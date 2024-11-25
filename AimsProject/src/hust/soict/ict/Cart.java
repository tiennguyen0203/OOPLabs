import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
	public static final int MAX_NUMBERS_ORDERS = 20;
	public List<CartItem> cartItems = new ArrayList<>();	
	
	public void addItem(CartItem cartItem) {
		if(cartItems.size() <= MAX_NUMBERS_ORDERS){
			cartItems.add(cartItem);
		}
		else
		{
			System.out.println("Giỏ hàng đã quá số lượng tối đa!!!");
		}
	}
	
	public void addItem(CartItem [] cartItem) {
		
		for(CartItem item : cartItem) {
			if(cartItems.size() <= MAX_NUMBERS_ORDERS) {
				cartItems.add(item);
			}
			else
			{
				System.out.println("Giỏ hàng đã quá số lượng tối đa!!!");
				break;
			}
		}
		
	}
	
	public void addItem(CartItem item1, CartItem item2) {
		if(cartItems.size() <= MAX_NUMBERS_ORDERS) {
			cartItems.add(item1);
		}
		else {
			System.out.println("Giỏ hàng đã quá số lượng tối đa!!!");
		}
		
		if(cartItems.size() <= MAX_NUMBERS_ORDERS) {
			cartItems.add(item2);
		}
		else {
			System.out.println("Giỏ hàng đã quá số lượng tối đa!!!");
		}
	}
	
	public boolean removeItem(String dvdTitle) {
		boolean isRemoved = false;
		if (cartItems != null) {
		    
		    Iterator<CartItem> iterator = cartItems.iterator();
		    while (iterator.hasNext()) {
		        CartItem removeItem = iterator.next();
		        if (removeItem.dvd.getTitle().equals(dvdTitle)) {
		            iterator.remove(); 
		            isRemoved = true;
		        }
		    }
		}
		return isRemoved;
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
	
	public void getFreeDVD() {
		System.out.println("Bạn vừa nhận 1 DVD miễn phí <3");
	}
	
	public void sortItemsByTitle() {
		System.out.println("Tính năng đang phát triển ...");
	}
	
	public void sortItemsByCost() {
		System.out.println("Tính năng đang phát triển ...");
	}
	
	public void displayCart() {
		
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
        
		System.out.println("Tổng: " + totalPrice + " $");
		System.out.println("**************************");
    }
}
