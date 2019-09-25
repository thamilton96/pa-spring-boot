package uk.ac.belfastmet.todo2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// @entity is a JPA object. The Java Persistence API (JPA) is a Java specification for accessing, persisting,
// and managing data between Java objects/classes and a relational database. 
@Entity
@Table(name = "task")
// refers to table name in database

/**
 * 
 * @author HAM19171866
 *
 */

public class ToDo2 {

	private long id;
	private String author;
	private String task;
	private String priority;
	private String status;
	private String dueDate;

	public ToDo2() {
		super();

	}

	/**
	 * This method...
	 * @param author type String
	 * @param task type String
	 * @param priority type String
	 * @param status type String
	 * @param dueDate type String
	 */
	public ToDo2(String author, String task, String priority, String status, String dueDate) {
		super();
		//keyword this used to differentiate instance variable from local variable
		this.author = author;
		this.task = task;
		this.priority = priority;
		this.status = status;
		this.dueDate = dueDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "task")
	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "duedate")
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	/*
	 * ToDo2 toString
	 * @Returns the author and status
	 */
	public String toString() {
		return author + "" + status;
	}

}
