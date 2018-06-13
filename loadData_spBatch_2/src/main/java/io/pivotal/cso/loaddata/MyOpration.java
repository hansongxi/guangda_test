package io.pivotal.cso.loaddata;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.geode.cache.CommitConflictException;

public class MyOpration {
	
	public static void main(String[] args) throws Exception {
		System.out.println("请输入要操作的指令");
		try(Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print(">>>>");
				String input = scanner.nextLine();
				
				if ("quit".equals(input)) {
	                System.out.println("Exit!");
	                break;
	            }
				else if ("insert".equals(input)) {
					System.out.println("insert......");
					//DataLoadBatchApplication.start(Arrays.copyOfRange(args, 1, args.length));
					
				}
				else if ("commit".equals(input)) {
					System.out.println("Committed.");
				}
				else if ("rollback".equals(input)) {
					System.out.println("Rollback!");
				}
				else if ("print".equals(input)) {
					System.out.println();
				}
				else {
					if(input.length() > 0) {
						System.out.println("Unknown command.");
					}
				}
			}
		}
		catch (CommitConflictException ex) {
			ex.printStackTrace();
		}
		
	}

}
