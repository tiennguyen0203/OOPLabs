import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Cart {
	public static final int MAX_NUMBERS_ORDERS = 20;
	public List<Media> itemsOrdered = new ArrayList<Media>();	
	
	public void addMedia(Media item) {
		if(itemsOrdered.size() < MAX_NUMBERS_ORDERS) {
			itemsOrdered.add(item);
		}else System.out.println("Something went wrong! Can not add item to the cart!");
		
	}
		
	public void removeMedia(String mediaTitle) {
		Iterator<Media> iterator = itemsOrdered.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getTitle().equals(mediaTitle)) {
				iterator.remove();
			}
		}
		
		System.out.println("Deleted item.");
	}
	
	public float totalCost() {
		float totalCost = 0;
		for(Media item : itemsOrdered) {
			totalCost += item.getCost()
;		}
		return totalCost;
	}
	
	
	public void sortItemsByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortItemsByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
	
	public void showCart() {
		if (itemsOrdered.isEmpty()) {
	        System.out.println("Your cart is empty.");
	    } else {
	        System.out.println("Items in your cart:");
	        for (Media item : itemsOrdered) {
	            System.out.println(item.toString());
	        }
	        System.out.println("Total cost: $" + totalCost());
	    }
    }

}
