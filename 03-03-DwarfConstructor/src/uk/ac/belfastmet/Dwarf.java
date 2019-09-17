package uk.ac.belfastmet;

public class Dwarf {
	
	private String name;
	private String author;

	
	//constructor
	public Dwarf(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
