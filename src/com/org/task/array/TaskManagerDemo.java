/**
 * 
 */
package com.org.task.array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class TaskManagerDemo {
	private static Task[] tasks = new Task[10];
    private static int taskCount = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
       try( Scanner scanner = new Scanner(System.in)){
        int choice;

        do {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    
                    addTask(scanner);
                    break;
                case 2:
                   // System.out.print("Enter task number to remove: ");
                   // int index = scanner.nextInt() - 1;
                    removeTask(scanner);
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
       }
       catch (InputMismatchException e) {
		System.err.println(e.getMessage());
	}
	}
    public static Task[] addTask(Scanner scanner) {
      	 if (taskCount < tasks.length) {
               System.out.print("Enter task Details: ");
               System.out.print("Enter task Description: ");
               String taskDescription = scanner.nextLine();
               System.out.print("Enter due date in this format dd-mm-yyyy: ");
               String dueDate = scanner.nextLine();  
               tasks[taskCount] = new Task(taskDescription,dueDate);
               taskCount++;
               System.out.println("taskCount "+taskCount);
               System.out.println("Task added successfully.");
               displayTasks();
           } else {
               System.out.println("Task list is full. Cannot add more tasks.");
           }       
          return tasks;
      }
       
      
    public static void removeTask(Scanner scanner) { 
    	    if (taskCount == 0) {
    	        System.out.println("No tasks to remove.");
    	    } else {
    	        System.out.print("Enter the task number to remove: ");
    	        int taskNumber = scanner.nextInt();
    	        scanner.nextLine(); // Consume newline

    	        if (taskNumber > 0 && taskNumber <= taskCount) {
    	            for (int i = taskNumber - 1; i < taskCount - 1; i++) {
    	                tasks[i] = tasks[i + 1];
    	            }
    	            tasks[taskCount - 1] = null;
    	            taskCount--;
    	            System.out.println("Task removed successfully.");
    	        } else {
    	            System.out.println("Invalid task number.");
    	        }
    	    }
    	}    
   
          
    public static void displayTasks() {
        		 if (taskCount == 0) {
        	         System.out.println("No tasks to display.");
        	     } else {
        	         System.out.println("To-Do List:");
        	         for (int i = 0; i < taskCount; i++) {
        	             System.out.println((i + 1) + ". " + tasks[i].getDescription()+ " "+tasks[i].getDueDate());
        	         }
        	     }
        		 
        	 }

	


}
