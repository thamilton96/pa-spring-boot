package uk.ac.belfastmet.todo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.todo2.domain.ToDo2;
import uk.ac.belfastmet.todo2.service.ToDo2Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@RequestMapping
public class ToDo2Controller {
	
	
	Logger logger = LoggerFactory.getLogger(ToDo2Controller.class);
	ToDo2 todo2 = new ToDo2();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) 
	{
		
		logger.info("Getting Home Page");
		logger.info(todo2.toString());
		
		ToDo2Service todo2Service = new ToDo2Service();
		model.addAttribute("pageTitle", "Home");
		model.addAttribute("todo2", todo2Service.getHomeToDo2());
		model.addAttribute("message", "");
		
		return "index";
	}
	
	@RequestMapping(value = "/completed", method = RequestMethod.GET)
	public String CompletedPage(Model model)
	{
		logger.info("Getting Completed Page");
		logger.info(todo2.toString());
		
		return "completed";
		
	
	}
	
	
	
	

}
