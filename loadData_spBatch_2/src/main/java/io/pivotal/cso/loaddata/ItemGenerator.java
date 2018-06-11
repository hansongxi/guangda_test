package io.pivotal.cso.loaddata;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.boot.SpringApplication;

public class ItemGenerator<T> implements ItemReader<T>{

	private long limit;
	
	private long count;
	
	private T template;
	
	private long seed = System.currentTimeMillis();
	
	public String generateCustId() {
		return "000111" + (seed++);
	}
	
	protected T makeItemFromTemplate() throws Exception {
		Constructor c = template.getClass().getConstructor(null);
		T obj = (T) c.newInstance(null);
		
		Field[] fields = template.getClass().getDeclaredFields();
		for(Field field : fields) {
			String name = field.getName();
			if(name.equals("cust_id")) {
				field.setAccessible(true);
				field.set(obj, generateCustId());
			}
			else if(name.equals("serialVersionUID")) {
				continue;
			}
			else {
				String getter = "get" + name.substring(0, 1).toUpperCase() + name.substring(1);
				Method m = template.getClass().getMethod(getter);
				Object value = m.invoke(template);
				field.setAccessible(true);
				field.set(obj, value);
			}
		}
		
		return obj;
	}
	
	@Override
	public T read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		if (count < limit) {
			T obj = makeItemFromTemplate();
			count++;
			return obj;
		}
		else {
			return null;
		}
	}
	
//	public static void main(String[] args) throws Exception {
//		
//		CisCustBaseInfo template = new CisCustBaseInfo();
//		CisCustBaseInfoGenerator gen = new CisCustBaseInfoGenerator();
//		gen.setLimit(1000);
//		gen.setTemplate(template);
//		
//		CisCustBaseInfo obj = gen.read();
//		while(obj != null) {
//			System.out.println(gen.count + ":" + obj);
//			obj = gen.read();
//		}
//	}

	public long getLimit() {
		return limit;
	}

	public void setLimit(long limit) {
		this.limit = limit;
	}

	public T getTemplate() {
		return template;
	}

	public void setTemplate(T template) {
		this.template = template;
	}
}
