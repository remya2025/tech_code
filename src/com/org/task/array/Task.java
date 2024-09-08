package com.org.task.array;


public class Task {

	private String description;
	private String dueDate;
	private int priority;
	
	public Task(String description, String dueDate,int priority) {	
		this.description = description;
		this.dueDate = dueDate;
		this.priority=priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
	
	public int getPriority() {
		return priority;
	}

	public void displayTaskDetails() {
		System.out.println("Task Description :"+description);
		System.out.println("Due Date :"+dueDate);
		System.out.println("Priority :"+priority);
	}
	
	
}
