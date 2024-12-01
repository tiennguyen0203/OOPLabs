import java.util.ArrayList;
import java.util.List;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		List<CartItem> cartItemList = new ArrayList<>();
		cart.addItem(new CartItem(new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.99), 2));
		
		CartItem cartItem1 = new CartItem(new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.99), 2);
		CartItem cartItem2 = new CartItem(new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 18.50), 1);
		
		cart.addItem(cartItem1, cartItem2);
		
		CartItem cartItem3 = new CartItem(new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 20.00), 2);
		CartItem cartItem4 = new CartItem(new DigitalVideoDisc("Schindler's List", "Biography", "Steven Spielberg", 195, 12.99), 1);
		CartItem cartItem5 = new CartItem(new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 16.75), 3);
		CartItem cartItem6 = new CartItem(new DigitalVideoDisc("The Lord of the Rings: The Return of the King", "Adventure", "Peter Jackson", 201, 19.99), 5);
		
		cartItemList.add(cartItem3);
		cartItemList.add(cartItem4);
		cartItemList.add(cartItem5);
		cartItemList.add(cartItem6);
		
		cart.addItem(cartItemList);
		
		cart.displayCart();
	}
}
