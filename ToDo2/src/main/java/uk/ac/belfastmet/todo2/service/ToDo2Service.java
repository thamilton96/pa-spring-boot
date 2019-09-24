package uk.ac.belfastmet.todo2.service;
// no java doc
import java.util.ArrayList;

import uk.ac.belfastmet.todo2.domain.ToDo2;

public class ToDo2Service {

	private ArrayList<ToDo2> homeToDo2;
	
	public ArrayList<ToDo2> getHomeToDo2()
	{
		this.homeToDo2 = new ArrayList<ToDo2>();
		
		this.homeToDo2.add(new ToDo2("Amy", "Homework", "High", "In progress", "Friday"));
		this.homeToDo2.add(new ToDo2("Rory", "Housework", "Medium", "Not Started", "Thursday"));
		this.homeToDo2.add(new ToDo2("Harry", "Get milk", "High", "Not bought", "Today"));
		this.homeToDo2.add(new ToDo2("Hannah", "Send email to lecturer", "Medium", "Draft created", "Next Week"));
		
		return this.homeToDo2;
	}
		
}
	

