
public class CartItem {
	public static int nbCartItem = 0;
	public int id;
	public DVD dvd;
	public int quantity;
	
	public CartItem(DVD _dvd, int _quantity) {
		this.dvd = _dvd;
		this.quantity = _quantity;
		this.id = ++nbCartItem;
	};
	
	public double getSubTotal() {
		return(double) dvd.getCost()*quantity;
	}
}
