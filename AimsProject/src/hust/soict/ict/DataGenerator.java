import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static Store generateStoreData() {
        Store store = new Store();
        
        List<String> authors1 = new ArrayList<>();
        authors1.add("J.K. Rowling");
        authors1.add("John Doe");
        Book book1 = new Book(1, "Harry Potter", "Fantasy", 20.99f, authors1);
        store.addNewItem(book1);
        
        List<String> authors2 = new ArrayList<>();
        authors2.add("George R. R. Martin");
        Book book2 = new Book(2, "A Game of Thrones", "Fantasy", 25.99f, authors2);
        store.addNewItem(book2);
        
        List<String> authors3 = new ArrayList<>();
        authors3.add("J.R.R. Tolkien");
        Book book3 = new Book(3, "The Hobbit", "Fantasy", 18.99f, authors3);
        store.addNewItem(book3);
        
        Track track1 = new Track("Song 1", 210);
        Track track2 = new Track("Song 2", 180);
        Track track3 = new Track("Song 3", 240);
        
        List<Track> tracks1 = new ArrayList<>();
        tracks1.add(track1);
        tracks1.add(track2);
        tracks1.add(track3);
        
        CompactDisc cd1 = new CompactDisc(4, "Greatest Hits", "Music", 15.99f, 60, "Director 1", "Artist 1", tracks1);
        store.addNewItem(cd1);
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(5, "Movie 1", "Action", 12.99f, 120, "Director A");
        store.addNewItem(dvd1);
                
        for (int i = 6; i < 30; i++) {
            List<String> authors = new ArrayList<>();
            authors.add("Author " + i);
            Book book = new Book(i, "Book Title " + i, "Category " + (i % 3), (i * 5) + 10, authors);
            store.addNewItem(book);
            
            if (i % 2 == 0) {
                List<Track> tracks = new ArrayList<>();
                for (int j = 0; j < 3; j++) {
                    tracks.add(new Track("Track " + j, (int) (Math.random() * 300)));
                }
                CompactDisc cd = new CompactDisc(i + 20, "CD Title " + i, "Music", 12.99f, 60 + (i % 3), "Director " + i, "Artist " + i, tracks);
                store.addNewItem(cd);
            } else {
                DigitalVideoDisc dvd = new DigitalVideoDisc(i + 30, "DVD Title " + i, "Action", (float) (Math.random() * 20), 100 + (i % 40), "Director " + i);
                store.addNewItem(dvd);
            }
        }
        
        return store;
    }
}
