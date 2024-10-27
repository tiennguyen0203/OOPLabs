import java.util.List;

public class Order {
	private int orderID;
	private Customer customer;
	private List<OrderItem> orderitems;
	private String status;
	
	public float calculateTotalBeforeVAT() {
		return (float) 99.99;
	}
	
	public float calculateTotalAfterVAT() {
		return (float) 109.99;
	}
}
