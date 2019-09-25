package uk.ac.belfastmet.todo2.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import jdk.internal.org.jline.utils.ShutdownHooks.Task;

import uk.ac.belfastmet.todo2.domain.ToDo2;
import uk.ac.belfastmet.todo2.repository.TaskRepository;

@Service
public class ToDo2Service {

	Logger logger = LoggerFactory.getLogger(ToDo2Service.class);
	
	@Autowired
	private TaskRepository taskRepository;

	private ArrayList<ToDo2> homeToDo2;
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<ToDo2> getHomeToDo2()	
	{
		
		homeToDo2 = new ArrayList<ToDo2>();
		
		Iterable<ToDo2> task = taskRepository.findAll();
		Iterator<ToDo2> iterator = task.iterator();
		
		while (iterator.hasNext()) 
		{

			//logger.info("{}", iterator.next().toString());
			homeToDo2.add(iterator.next());
			logger.info("# of tasks: {}", taskRepository.count());

		}

//		this.homeToDo2.add(new ToDo2("Amy", "Homework", "High", "In progress", "Friday"));
//		this.homeToDo2.add(new ToDo2("Rory", "Housework", "Medium", "Not Started", "Thursday"));
//		this.homeToDo2.add(new ToDo2("Harry", "Get milk", "High", "Not bought", "Today"));
//		this.homeToDo2.add(new ToDo2("Hannah", "Send email to lecturer", "Medium", "Draft created", "Next Week"));

		return homeToDo2;
	}

	/**
	 * This method gets number of tasks from database
	 */

/*	public void getNumberOfTask() {

		Iterable<ToDo2> task = taskRepository.findAll();
		Iterator<ToDo2> iterator = task.iterator();
		ArrayList<ToDo2> todod2List = new ArrayList<ToDo2>();
		while (iterator.hasNext()) 
		{

			logger.info("{}", iterator.next().toString());
			todo2List.add(iterator.next());
			logger.info("# of tasks: {}", taskRepository.count());

		}
		return todo2List;

		public Iterable<ToDo2> getDBTasks()
		{ 
			logger.info("# of tasks: {}", todo2Repository.count());

			Iterable <ToDo2> toDo2Tasks = todo2Repository.findAll();
			while(iterator.hasNext()) 
			{
				logger.info("{}",iterator.next().toString());
			}

			return toDo2Task;
		}
*/


	//}
	
	
	
	
}

