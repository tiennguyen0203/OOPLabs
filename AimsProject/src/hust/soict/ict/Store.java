import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
	public List<Media> itemsInStore = new ArrayList<Media>();
	
	public void addNewItem(Media item) {
		if(!itemsInStore.contains(item)) {
			itemsInStore.add(item);	
		}
		else {
			System.out.println("This media is already in the store!");
		}
	}
	
	public void removeItems(String title) {
		Iterator<Media> iterator = itemsInStore.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getTitle().equals(title)) {
				iterator.remove();
			}
		}
		
		System.out.println("Deleted item.");
	}
	
	public void showStore() {
		System.out.println("Media Store");
		System.out.println("--------------------------------");
		for(Media media : itemsInStore) {
			System.out.println(media.toString());	
			System.out.println();
		}
		System.out.println("--------------------------------");
	}
	
	
	public Media searchMediaByTitle(String title) {
        System.out.println("Searching for media with title: " + title);
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found media: ");
                System.out.println(media.toString());
                return media;
            }
        }
        
        System.out.println("No media found with the title: " + title);
       
        return null;
    }
	
}
