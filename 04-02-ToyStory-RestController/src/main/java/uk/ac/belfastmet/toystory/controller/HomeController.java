package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz was played by Tim Allen";
	}
	
	@GetMapping("/sid")
	public String sid() {
		return "Sid was played by Erik von Detten";
	}
	
	@GetMapping("/Rex")
	public String Rex() {
		return "Rex was played by Wallace Shawn";
	}

}
