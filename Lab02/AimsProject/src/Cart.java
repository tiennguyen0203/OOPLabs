import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Cart {
	
	public static final int MAX_NUMBERS_ORDERS = 20;
	
	public List<CartItem> cartItems = new ArrayList<>();
	
	public void addItem(DVD dvd, int quantity) {
		if(cartItems.size() <= MAX_NUMBERS_ORDERS) {
			cartItems.add(new CartItem(dvd, quantity));
		}
		else
		{
			System.out.println("Giỏ hàng đã quá số lượng tối đa!!!");
		}
		
		
	}
	
	public void removeItem(DVD dvd, String dvdRemove) {
		for(CartItem check : cartItems) {
			if(check.dvd.getTitle().equals(dvdRemove)) {
				cartItems.remove(check);
			}
		}
		
		System.out.println("Đã xóa DVD khỏi giỏ hàng.");
	}
	
	public void updateQuantity(String dvdName, int updateQuantity) {
		for(CartItem check : cartItems) {
			if(check.dvd.getTitle().equals(dvdName)) {
				check.quantity = updateQuantity;
			}
		}
		
		System.out.println("Bạn đã update giỏ hàng thành công.");
	}
	
	public double calculateTotalCost() {
		double totalCost = 0;
		for(CartItem check : cartItems) {
			totalCost += check.getSubTotal();
		}
		return totalCost;
	}
	
	public void getFreeItem() {
		System.out.println("Bạn vừa nhận 1 DVD miễn phí <3");
	}
	
	public void sortItemsByTitle() {
		Collections.sort(cartItems, new Comparator<CartItem>() {
            @Override
            public int compare(CartItem item1, CartItem item2) {
                int titleComparison = item1.dvd.getTitle().compareToIgnoreCase(item2.dvd.getTitle());
                if (titleComparison == 0) {
                    return Double.compare(item2.dvd.getCost(), item1.dvd.getCost());
                }
                return titleComparison;
            }
        });
	}
	
	public void sortItemsByCost() {
		 Collections.sort(cartItems, new Comparator<CartItem>() {
	            @Override
	            public int compare(CartItem item1, CartItem item2) {
	                int costComparison = Double.compare(item2.dvd.getCost(), item1.dvd.getCost());
	                if (costComparison == 0) {
	                    return item1.dvd.getTitle().compareToIgnoreCase(item2.dvd.getTitle());
	                }
	                return costComparison;
	            }
	        });
	}
	
	public void displayCartItems() {
		
		System.out.println();
		System.out.println("*****Giỏ hàng của bạn*****");
		double totalPrice = 0;
		
		if(cartItems == null || cartItems.isEmpty()) 
			{
			System.out.println("Không có sản phẩm nào trong giỏ hàng!!!");
			}
		else
			{
			for (CartItem item : cartItems) {
	            System.out.println("Title: " + item.dvd.getTitle() + ", Quantity: " + item.quantity + ", Subtotal: $" + item.getSubTotal());
	            totalPrice += item.getSubTotal();
	        }
			
			}
        
		System.out.println("Tổng: " + totalPrice);
    }
}
