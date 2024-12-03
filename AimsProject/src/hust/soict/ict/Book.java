import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
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
	
	@Override
	public String toString() {
		return "Book [Title=" + getTitle() + ", Category=" + getCategory() + ", Cost=" + getCost() + ", Authors=" + String.join(", ", authors) + "]";
	}
}
