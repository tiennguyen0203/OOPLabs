import java.util.List;

public class Order {
	private String orderID;
	private Customer customer;
	private List<OrderItem> orderitems;
	private boolean status;
	
	
	public Order(String orderID, Customer customer, List<OrderItem> orderitems, boolean status) {
		super();
		this.orderID = orderID;
		this.customer = customer;
		this.orderitems = orderitems;
		this.status = status;
	}
	
	public void showOrderInformation() {
		System.out.println(orderID + "   " + customer.getName() +  "   " + orderitems.size() + "   " + status);
	}
	
	public double calculateTotalBeforeVAT() {
		double totalBeforeVAT = 0;
		for(OrderItem orderItem : orderitems) {
			totalBeforeVAT = orderItem.getSubTotal();
		}
		
		return totalBeforeVAT;
	}
	
	public double calculateTotalAfterVAT() {
		return calculateTotalBeforeVAT()*1.08;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID ;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderItem> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(List<OrderItem> orderitems) {
		this.orderitems = orderitems;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
