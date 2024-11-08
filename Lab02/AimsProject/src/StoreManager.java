import java.util.List;

public class StoreManager {
	private String username;
	private String password;
	public List<Order> listOrder;
	
	public StoreManager(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean login() {
		return true;
	}
	
	public void viewPendingOrder() {
		System.out.println("Thông tin các đơn hàng:");
		for(Order order : listOrder) {
			order.showOrderInformation();
		}
	}
	
	public void approveOrder(Order order) {
		order.setStatus(true);
	}
	
	public void rejectOrder(Order order) {
		order.setStatus(true);
	}
	
	public void removeDVD(List<DVD> listDVD, DVD dvd) {
		listDVD.remove(dvd);	
	}
	
	public void addNewDVD(List<DVD> listDVD, DVD dvd) {
		listDVD.add(dvd);
	}
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
