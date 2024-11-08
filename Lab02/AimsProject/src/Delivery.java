
public class Delivery {
	private String address;
	private String instructions;
	private double deliveryFee;
	
	public Delivery(String address, String instructions, double deliveryFee) {
		super();
		this.address = address;
		this.instructions = instructions;
		this.deliveryFee = deliveryFee;
	}
	
	public void deliveryShowInformation(Customer customer) {
		System.out.println("***Thông tin giao hàng***");
		System.out.print("Người nhận: " + customer.getName() + ".");
		System.out.println();
		System.out.print("Email: " + customer.getEmail() + ".");
		System.out.println();
		System.out.print("Địa điểm: " + address + ".");
		System.out.println();
		System.out.println("Dự kiến đơn hàng sẽ nhận được sau 2 - 3 ngày nữa.");
	}
	
	//Getter and Setter
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public double getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(float deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	
}
