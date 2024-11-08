
public class DVD {
	private int id;
	private String title;
	private String category;
	private String director;
	private float lenght;
	private double cost;
	
	//DVD constructor
	//Create a DVD object by title
	public DVD(String _title) {
		super();
		this.title = _title;
	}
	
	//Create a DVD object by category, title and cost
	public DVD(String _title, String _category, double _cost) {
		super();
		this.title = _title;
		this.category = _category;
		this.cost = _cost;
	}
	
	//Create a DVD object by director, category, title and cost
	public DVD(String _title, String _category, String _director, double _cost) {
		super();
		this.title = _title;
		this.category = _category;
		this.director = _director;
		this.cost = _cost;
	}
	
	// Create a DVD object by all attributes: title, category, director, length and cost
		public DVD(int _id, String _title, String _category, String _director, float _lenght, double _cost) {
			this.id = _id;
			this.title = _title;
			this.category = _category;
			this.director = _director;
			this.lenght = _lenght;
			this.cost = _cost;
		}
	
	public void playDemo() {
		System.out.println("DVD demo is playing listen ...");
	}
	
	public void displayInfor() {
		System.out.println("DVD Id: " + id + " - "+ title + " - " + category + " - " + director + " - " + cost + "." );
	}

	public void dislplayDetail() {
		System.out.println("DVD Id: " + id);
		System.out.println("DVD Title: " + title);
		System.out.println("Category: " + category);
		System.out.println("Directed by: " + director);
		System.out.println("Lenght: " + lenght);
		System.out.println("Price: " + cost + "$.");
	}
	
	
	//Getter and setter for attributes
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
