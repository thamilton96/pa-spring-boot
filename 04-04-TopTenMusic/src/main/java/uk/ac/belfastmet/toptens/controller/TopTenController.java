package uk.ac.belfastmet.toptens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.toptens.service.TopTenService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class TopTenController {
	
	Logger logger = LoggerFactory.getLogger(TopTenController.class);
		
		@GetMapping()
		public String homePage() {
			logger.info("Getting Home Page");
			return "index";
		}
	
	
	/*@RequestMapping (value = "/TopTen/song", method = RequestMethod.GET)
	public String getIndex() {
		@RequestMapping("/")
        publicString index() {
     	   logger.info("An INFO Message");
        }
		return "";
	}*/
		
		@GetMapping("/song")
		public String songsPage(Model model) {
			logger.info("Getting Songs");
			
			
			       TopTenService toptenService = new TopTenService();
					model.addAttribute("pageTitle", "Single Charts!");
					model.addAttribute("topten",toptenService.getsongTopTens());
			
			return "songs";
		}
	
	/*@RequestMapping (value = "/topten/album", method = RequestMethod.GET)public TopTenController() {
	}@ResponseBody
	public String getIndex() {
		return "songs"
	}*/

		@GetMapping("/album") 
		public String albumPage(Model model) {
			logger.info("Getting Albums");
			
			TopTenService toptenService = new TopTenService();
			model.addAttribute("pageTitle", "Album Charts!");
			model.addAttribute("topten",toptenService.getalbumTopTens());
			
			
			return "albums";
		}
	}
