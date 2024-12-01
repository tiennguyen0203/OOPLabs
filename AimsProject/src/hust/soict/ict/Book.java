import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
		
	}

	
	public List<String> getAuthors() {
		return authors;
	}



	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}



	public void addAthor(String authorName) {
		
	}
	
	public void removeAuthor(String authorName) {
		
	}
}
