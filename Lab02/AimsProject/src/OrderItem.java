
public class OrderItem {
	public DVD dvd;
	public int quantity;
	
	public OrderItem(DVD _dvd, int _quantity) {
		this.dvd = _dvd;
		this.quantity = _quantity;
	}
	
	public double getSubTotal() {
		return (double) dvd.getCost()*quantity;
	}
}
