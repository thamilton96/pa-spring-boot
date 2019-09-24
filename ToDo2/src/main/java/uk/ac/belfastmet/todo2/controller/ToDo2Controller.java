package uk.ac.belfastmet.todo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todo2.domain.ToDo2;
import uk.ac.belfastmet.todo2.service.ToDo2Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author HAM19171866
 *
 */

@Controller
@RequestMapping
public class ToDo2Controller {
	
	@Autowired
	private ToDo2Service todo2Service;
	
	Logger logger = LoggerFactory.getLogger(ToDo2Controller.class);
	ToDo2 todo2 = new ToDo2();
	
	/**
	 * 
	 * @param model
	 * @return homepage
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) 
	{
		
		
		logger.info("Getting Home Page");
		logger.info(todo2.toString());
		
		model.addAttribute("pageTitle", "Index");
		model.addAttribute("todo2", todo2Service.getHomeToDo2());
		model.addAttribute("message", "");
		
		todo2Service.getNumberOfTask();
		
		return "index";
	}
	
	/**
	 * method for retrieving homepage
	 * @param model
	 * @return
	 */
	
	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	public String CompletedPage(Model model)
	{
		logger.info("Getting Completed Page");
		logger.info(todo2.toString());
		
		return "completed";
		
	}

}
