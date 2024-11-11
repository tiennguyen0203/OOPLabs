import java.util.List;
import java.util.Scanner;

public class Customer {
	private String name;
	private String email;
	public Cart cart;
	
	Scanner scanner = new Scanner(System.in);
	
	public Customer(String _name, String _email, Cart _cart) {
		this.name = _name;
		this.email = _email;
		this.cart = _cart;
	}
	
	public void viewCart() {
		cart.displayCartItems();
	}
	
	public void searchDVDsByCategory(List<DVD> dvd) {
		String strCategory;
		System.out.print("Nhập tên thể loại bạn muốn tìm kiếm: ");
		strCategory = scanner.nextLine();
		System.out.println("Danh sách những DVD thể loại: " + strCategory);
		boolean hasResult = false;
		for(DVD item : dvd) {
			if(strCategory.equals(item.getCategory())) {
				item.displayInfor();
				hasResult = true;
			}
		}
		if(hasResult == false) System.out.println("Không có kết quả tìm kiếm!!!");
		
		
	}
	
	public void searchDVDsByTitle(List<DVD> dvd) {
		String strTitle;
		System.out.println("Nhập tên DVD muốn tìm kiếm: ");
		strTitle = scanner.nextLine();
		boolean hasResult = false;
		System.out.println("Kết quả tìm kiếm: \"" + strTitle +"\"" );
		for(DVD item : dvd) {
			
			if(item.getTitle().contains(strTitle)) {
				item.displayInfor();
				hasResult = true;
			}
		}
		
		if(hasResult == false) System.out.println("Không có kết quả tìm kiếm!!!");
	}
	
	public void searchDVDsByCost(List<DVD> dvd, double cost1, double cost2) {
		boolean hasResult = false;
		
		System.out.println("Danh sách những DVD trong tầm giá " + cost1 + "$ đến " + cost2 + "$:");
		for(DVD item : dvd) {
			if(item.getCost() >= cost1 && item.getCost() <= cost2){
				item.displayInfor();
				hasResult = true;
			}
		}
		
		if(hasResult == false) System.out.println("Không có kết quả tìm kiếm!!!");
	}
	
	public void placeOrder() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
