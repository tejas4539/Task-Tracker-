package Tester;

import java.util.Scanner;

import BL.TaskImpl;
import pojo.Status;

public class Test {

	public static void main(String[] args) {
		try {
			TaskImpl task=new TaskImpl();
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to the Task saver");
			questionLoop: while (true) {
				System.out.println("Enter the below option");
				System.out.println("1.Add the Task");
				System.out.println("2.Update the Task");
				System.out.println("3.Delete the Task");
				System.out.println("4.update Progress of the Task");
				System.out.println("5.get all the Task");
				System.out.println("6.get task that are done");
				System.out.println("10.To exit the task");
				int option = sc.nextInt();
				sc.nextLine();
				switch (option) {
				      case 1: {
                           System.out.println("enter the task description");
                           String description=sc.nextLine();
                           System.out.println( task.addTask(description));
                           break;
				       }
				      case 2:{
				    	  System.out.println("Enter the task Id");
				    	  int id=sc.nextInt();
				    	  sc.nextLine();
				    	  System.out.println("Enter the task");
				    	  String description=sc.nextLine();
				    	  System.out.println(task.updateTask(id,description));
				    	  break;
				      }
				      case 3:{
				    	  System.out.println("Enter the task Id");
				    	  int id=sc.nextInt();
				    	  sc.nextLine();
				    	  System.out.println(task.deleteTask(id));
				    	  break;
				      }
				      case 4:{
				    	  System.out.println("Enter the task id");
				    	  int id=sc.nextInt();
				    	  sc.nextLine();
				    	  System.out.println("Enter progress from this given option :Todo,InProgress,Done ");
				    	  Status progress=Status.valueOf(sc.nextLine());
				    	  task.updateProgress(id, progress);
				    	  System.out.println("Task Progress Updated");
				    	  break;
				      }
				      case 5:{
				    	  task.getAllTask();
				    	  break;
				      }
				      case 6:{
				    	  task.getDoneTask();
				    	  break;
				      }
				      case 10: {
					      System.out.println("Thank  you ");
					       break questionLoop;
				      }
				      default:{
				    	  System.out.println("Enter the correct values");
				      }
				
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
