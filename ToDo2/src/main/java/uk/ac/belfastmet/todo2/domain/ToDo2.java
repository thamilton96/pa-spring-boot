package uk.ac.belfastmet.todo2.domain;

public class ToDo2 {
	
	private String author;
	private String task;
	private String priority;
	private boolean status;
	private String dueDate ;
	
	public ToDo2() {
		super();
	
	}
	

	public ToDo2(String author, String task, String priority, boolean status, String dueDate) {
		super();
		this.author = author;
		this.task = task;
		this.priority = priority;
		this.status = status;
		this.dueDate = dueDate;
		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	

}