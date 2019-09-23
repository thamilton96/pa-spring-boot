package uk.ac.belfastmet.todo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping
public class ToDo2Controller {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		logger.info("Getting Home Page");
		return "index";
	}
	
	
	

}
