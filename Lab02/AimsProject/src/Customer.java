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
		
		for(DVD item : dvd) {
			System.out.println("Danh sách những DVD thể loại: " + strCategory);
			if(strCategory.equals(item.getCategory())) {
				item.dislplayDetail();
			}
			else System.out.println("Không có kết quả!!!");
			
		}
		
		
	}
	
	public void searchDVDsByTitle(List<DVD> dvd) {
		String strTitle;
		System.out.println("Nhập tên DVD muốn tìm kiếm: ");
		strTitle = scanner.nextLine();
		
		for(DVD item : dvd) {
			System.out.println("Kết quả tìm kiếm: \"" + strTitle +"\"" );
			if(item.getTitle().contains(strTitle)) {
				item.dislplayDetail();
			}
			else System.out.println("Không có kết quả!!!");
			
		}
	}
	
	public void searchDVDsByCost(List<DVD> dvd) {
		double strCost1;
		double strCost2;
		System.out.println("Nhập giá tiền bạn muốn: ");
		System.out.print("Từ: ");
		strCost1 = scanner.nextDouble();
		
		System.out.print("Đến: ");
		strCost2 = scanner.nextDouble();
		
		for(DVD item : dvd) {
			System.out.println("Danh sách những DVD trong tầm giá " + strCost1 + "$ đến " + strCost2 + "$.");
			if(item.getCost() >= strCost1 && item.getCost() <= strCost2){
				item.dislplayDetail();
			}
			else System.out.println("Không có kết quả!!!");
			
		}
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
