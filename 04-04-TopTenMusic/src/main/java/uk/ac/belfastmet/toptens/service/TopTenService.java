package uk.ac.belfastmet.toptens.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.toptens.domain.TopTen;

@Service
public class TopTenService {
	
	private ArrayList<TopTen> songTopTens;
	private ArrayList<TopTen> albumTopTens;
	
	public ArrayList<TopTen> getsongTopTens(){
		
		this.songTopTens = new ArrayList<TopTen>();
		
		// add singles here!
		this.songTopTens.add(new TopTen("Ed Sheeran", "Song", "Take me Back to London", "Ed.jpg"));
		this.songTopTens.add(new TopTen("Aitch", "Single", "Taste", "Aitch.jpg"));
		this.songTopTens.add(new TopTen("Kygo & Whitney Houston", "Single", "Higher Love", "Whitney.jpg"));
		this.songTopTens.add(new TopTen("AJ Tracey", "Single", "Ladbroke Grove", "AJ.jpg"));
		this.songTopTens.add(new TopTen("Post Malone", "Single", "Circles", "Post Malone.jpg"));
		this.songTopTens.add(new TopTen("Joel Corry", "Single", "Sorry", "Joel.jpg"));
		this.songTopTens.add(new TopTen("Dominic Fike", "Single", "3 Nights", "Dominic.jpg"));
		this.songTopTens.add(new TopTen("Lil Tecca", "Single", "Ransom", "Tecca.jpg"));
		this.songTopTens.add(new TopTen("Young T & Bugsey", "Single", "Strike A Pose", "Bugsey.jpg"));
		this.songTopTens.add(new TopTen("Post Malone", "Single", "Goodbyes", "Post Malone.jpg"));
		
		
		
		return this.songTopTens;
	}
	
	public ArrayList<TopTen> getalbumTopTens(){
		
		this.albumTopTens = new ArrayList<TopTen>();
		
		// add albums here!
		this.albumTopTens.add(new TopTen("Post Malone", "Album", "Hollywood's Bleeding", "Post Malone.png"));
		this.albumTopTens.add(new TopTen("Ed Sheeran", "Album", "No.6 Collaborations Project", "Ed Sheeran.png"));
		this.albumTopTens.add(new TopTen("Aitch", "Album", "AitcH2O", "Aitch.png"));
		this.albumTopTens.add(new TopTen("Taylor Swift", "Album", "Lover", "TSwift.jpg"));
		this.albumTopTens.add(new TopTen("Lewis Capaldi", "Album", "Divinely Uninspired to a Hellish Extent", "Lewis.jpg"));
		this.albumTopTens.add(new TopTen("Status Quo", "Album", "Backbone", "Status.jpg"));
		this.albumTopTens.add(new TopTen("Lana Del Ray", "Album", "Norman F**king Rockwell", "Lana.jpg"));
		this.albumTopTens.add(new TopTen("Melania Martinez", "Album", "K-12", "Melania.jpg"));
		this.albumTopTens.add(new TopTen("Jax Jones", "Album", "Snacks", "Jax.jpg"));
		this.albumTopTens.add(new TopTen("Billie Eilish", "Album", "When We All Fall Asleep, Where Do We Go?", "Billie.jpg"));
		

		
		return this.albumTopTens;
	}
	
	
	

}
