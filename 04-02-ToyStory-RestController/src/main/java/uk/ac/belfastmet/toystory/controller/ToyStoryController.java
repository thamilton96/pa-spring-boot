package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/toystorymovie")
	public class ToyStoryController {
		
		@GetMapping("/")
		public String home() {
			return "Characters in the movie ToyStory";
		}
		
		@GetMapping("/woody")
		public String shrek() {
			return "Woody is the main character";
		}
		
		@GetMapping("/donkey")
		public String donkey() {
			return "Donkey is Woody's sidekick";
		}
		
	}



