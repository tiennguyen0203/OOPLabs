import java.util.ArrayList;
import java.util.List;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<DVD> dvdList = new ArrayList<>();
		
		dvdList.add(new DVD(1, "The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.99));
        dvdList.add(new DVD(2, "The Godfather", "Crime", "Francis Ford Coppola", 175, 18.50));
        dvdList.add(new DVD(3, "The Dark Knight", "Action", "Christopher Nolan", 152, 20.00));
        dvdList.add(new DVD(4, "Schindler's List", "Biography", "Steven Spielberg", 195, 12.99));
        dvdList.add(new DVD(5, "Pulp Fiction", "Crime", "Quentin Tarantino", 154, 16.75));
        dvdList.add(new DVD(6, "The Lord of the Rings: The Return of the King", "Adventure", "Peter Jackson", 201, 19.99));
        dvdList.add(new DVD(7, "Forrest Gump", "Drama", "Robert Zemeckis", 142, 14.99));
        dvdList.add(new DVD(8, "Inception", "Sci-Fi", "Christopher Nolan", 148, 17.50));
        dvdList.add(new DVD(9, "Fight Club", "Drama", "David Fincher", 139, 13.99));
        dvdList.add(new DVD(10, "The Matrix", "Sci-Fi", "Lana Wachowski, Lilly Wachowski", 136, 15.00));
        dvdList.add(new DVD(11, "Goodfellas", "Crime", "Martin Scorsese", 146, 14.50));
        dvdList.add(new DVD(12, "Se7en", "Thriller", "David Fincher", 127, 13.50));
        dvdList.add(new DVD(13, "Interstellar", "Sci-Fi", "Christopher Nolan", 169, 18.00));
        dvdList.add(new DVD(14, "The Green Mile", "Fantasy", "Frank Darabont", 189, 12.75));
        dvdList.add(new DVD(15, "Gladiator", "Action", "Ridley Scott", 155, 16.00));
        
        
        
        System.out.println("DVD List:");
        for (DVD dvd : dvdList) {
            dvd.dislplayDetail();
            System.out.println();
        }
		
		
	}

}
