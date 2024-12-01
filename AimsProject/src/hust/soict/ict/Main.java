import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static List<DigitalVideoDisc> dvdList = new ArrayList<>();
	static Scanner aimsScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Cart cart = new Cart();
		Store store = new Store();
		int option = 0;
		
		dvdList.add(new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.99));
        dvdList.add(new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 18.50));
        dvdList.add(new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 20.00));
        dvdList.add(new DigitalVideoDisc("Schindler's List", "Biography", "Steven Spielberg", 195, 12.99));
        dvdList.add(new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 16.75));
        dvdList.add(new DigitalVideoDisc("The Lord of the Rings: The Return of the King", "Adventure", "Peter Jackson", 201, 19.99));
        dvdList.add(new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 14.99));
        dvdList.add(new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 17.50));
        dvdList.add(new DigitalVideoDisc("Fight Club", "Drama", "David Fincher", 139, 13.99));
        dvdList.add(new DigitalVideoDisc("The Matrix", "Sci-Fi", "Lana Wachowski, Lilly Wachowski", 136, 15.00));
        
        System.out.println("Chào mừng bạn đến với hệ thống cửa hàng DVD.");
        
        int firstOption = 0;
        
        do {
        	System.out.println("Chọn vai trò của bạn:");
            System.out.println("1. Người mua hàng.");
            System.out.println("2. Người quản lý");
            System.out.println("3. Thoát");
            firstOption = aimsScanner.nextInt() ;
            aimsScanner.nextLine();
            
            switch(firstOption) {
            case 1:
            	System.out.println("Vui lòng nhập thông tin khách hàng ^^");
                System.out.print("Họ và tên khách hàng: ");
        		String customerName = aimsScanner.nextLine();
        		System.out.print("Email: ");
        		String customerEmail = aimsScanner.nextLine();
        		
        		do {
        			System.out.println("Xin chào " + customerName + ". Vui lòng chọn các dịch vụ sau: ");
        			System.out.println("1. Xem danh sách DVD.");
        			System.out.println("2. Tìm kiếm DVD theo thể loại.");
        			System.out.println("3. Tìm kiến DVD theo tên.");
        			System.out.println("4. Tìm kiến DVD theo giá.");
        			System.out.println("5. Xem giỏ hàng.");
        			System.out.println("6. Thoát.");
        			System.out.print("Nhập lựa chọn của bạn: ");
        			option = aimsScanner.nextInt();
        			aimsScanner.nextLine();
        			System.out.println();
        			switch(option) {
        				case 1:
        					for(DigitalVideoDisc digitalVideoDisc : dvdList) digitalVideoDisc.displayInfor();
        					break;
        				case 2: 
        					searchDVDsByCategory(dvdList);
        					break;
        				case 3: 
        					searchDVDsByTitle(dvdList);
        					break;
        				case 4:
        					System.out.println("Nhập giá tiền bạn mong muốn.");
        					System.out.print("Từ: ");
        					double cost1 = aimsScanner.nextDouble();
        					aimsScanner.nextLine();
        					System.out.print("Đến: ");
        					double cost2 = aimsScanner.nextDouble();
        					aimsScanner.nextLine();
        					searchDVDsByCost(dvdList, cost1, cost2);
        					break;
        				case 5: 
        					cart.displayCart();
        					int cartOption = 0;
        					do 
        					{
        						System.out.println();
        						System.out.println("1.Sắp xếp theo tiêu đề.");
        						System.out.println("2.Sắp xếp theo giá.");
        						System.out.println("3.Nhận DVD miễn phí.");
        						System.out.println("4.Thêm DVD vào giỏ hàng");
        						System.out.println("5.Thay đổi số lượng sản phẩm.");
        						System.out.println("6.Xóa sản phẩm khỏi giỏ hàng");
        						System.out.println("7.Đặt hàng.");
        						System.out.println("8.Thoát khỏi giỏ hàng.");
        						System.out.print("Nhập lựa chọn của bạn: ");
        						
        						cartOption = aimsScanner.nextInt();
        						aimsScanner.nextLine();
        						
        						switch(cartOption) 
        						{
        							case 1: 
        								cart.sortItemsByTitle();
        								cart.displayCart();
        								break;
        							case 2:
        								cart.sortItemsByCost();
        								cart.displayCart();
        								break;
        							case 3: 
        								cart.getFreeDVD();
        								cart.displayCart();
        								break;
        							case 4:
        								System.out.print("Nhập tên DVD bạn muốn thêm vào giỏ hàng: ");
        								String dvdName = aimsScanner.nextLine();
        								System.out.print("Số lượng: ");
        								int quantity = aimsScanner.nextInt();
        								aimsScanner.nextLine();
        								
        								boolean added = false;
        								
        								for(DigitalVideoDisc digitalVideoDisc : dvdList) {
        									if(digitalVideoDisc.getTitle().equals(dvdName)){
        										cart.addItem(new CartItem(digitalVideoDisc, quantity));
        										added = true;
        										System.out.println("Đã thêm sản phẩm vào giỏ hàng!");
        										System.out.println();
        									}
        									
        								}
        								
        								if(added == false) {
        									System.out.println("Không có sản phẩm: " + dvdName);
        								}
        								
        								cart.displayCart();
        								break;
        							case 5:
        								System.out.print("Nhập tên DVD bạn muốn thay đổi số lượng: ");
        								String dvdUpdateName = aimsScanner.nextLine();
        								System.out.print("Số lượng mới: ");
        								int updateQuantity = aimsScanner.nextInt();
        								aimsScanner.nextLine();
        								cart.updateQuantity(dvdUpdateName, updateQuantity);
        								cart.displayCart();
        								break;
        								
        							case 6: 
        								System.out.print("Nhập tên DVD bạn muốn xóa khỏi giỏ hàng: ");
        								String dvdRemoveName = aimsScanner.nextLine();
        								
        								System.out.println(cart.cartItems.size());
        								
        								if(!cart.removeItem(dvdRemoveName)) {
        									System.out.println("Không có sản phẩm: " + dvdRemoveName);
        								}else {
        									System.out.println("Đã xóa sản phẩm khỏi giỏ hàng!");
        									System.out.println();
        								}
        								
        								cart.displayCart();
        								break;
        							case 7: 
        								System.out.println("Đặt hàng thành công. Thông tin chi tiết sẽ được gửi đến " + customerEmail + ".");
        								break;
        							case 8:
        								System.out.println("Đã thoát khỏi giỏ hàng!");
        								break;
        							default:
        								System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại lựa chọn của bạn.");
        								break;
        						}
        						
        					}while(cartOption != 8);
        					break;
        						
        				case 6:
        					System.out.println("Cảm ơn bạn. Hẹn gặp lại lần sau!!!");
        					break;
        				default:
        					System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại lựa chọn của bạn.");
        					break;
        				
        			}
        		}while(option != 6);
            	break;
            case 2:
            	String password = "";
            	do {
            		System.out.print("Nhập mật khẩu cho quản lý:");
                	password = aimsScanner.nextLine();
                	if(!password.equals(store.getPasswordToStore())) {
                		System.out.println("Sai mật khẩu. Vui lòng nhập lại!!!");
                	}
            	}while(!password.equals(store.getPasswordToStore()));
            	
            	
            	
            		System.out.println("Chào mừng đến với trang quản lý cửa hàng DVD.");
            		int storeOption = 0;
            		do {
            			System.out.println("1. Hiển thị danh sách DVD.");
            			System.out.println("2. Thêm DVD mới vào cửa hàng");
            			System.out.println("3. Xóa DVD khỏi cửa hàng");
            			System.out.println("4. Thoát.");
            			System.out.print("Nhập lựa chọn của bạn: ");
            			storeOption = aimsScanner.nextInt();
            			aimsScanner.nextLine();
            			switch(storeOption) {
            			case 1:
            				store.showDVDList();
            				break;
            			case 2:
            				System.out.println("Nhập thông tin DVD mới");
            				System.out.print("Tiêu đề: ");
            				String title = aimsScanner.nextLine();
            				System.out.print("Thể loại: ");
            				String category = aimsScanner.nextLine();
            				System.out.print("Tác giả: ");
            				String director = aimsScanner.nextLine();
            				System.out.print("Độ dài: ");
            				float lenght = aimsScanner.nextFloat();
            				System.out.print("Giá tiền: ");
            				double cost = aimsScanner.nextDouble();
            				
            				store.addNewDVD(new DigitalVideoDisc(title,category,director,lenght,cost));
            				
            				System.out.println("Thêm DVD mới thành công");
            				break;
            			case 3:
            				System.out.print("Nhập tên DVD muốn xóa: ");
            				String removeDVDName = aimsScanner.nextLine();
            				store.removeDVD(removeDVDName);
            				break;
            			case 4:
            				System.out.println("Tạm biệt, hẹn gặp lại!!!");
            				break;
            			default:
            				System.out.println("Lựa chọn không hợp lệ");
            				break;
            			}
            			
            		}while(storeOption != 4);
            	
            	
            	break;
            case 3:
            	System.out.println("Cảm ơn bạn đã ghé thăm hệ thống cửa hàng DVD. Hẹn gặp lại lần sau!!!");
            	break;
            }
        }while(firstOption != 3);
		
		aimsScanner.close();
	}
	
	
	public static void searchDVDsByCategory(List<DigitalVideoDisc> digitalVideoDisc) {
		String strCategory;
		System.out.print("Nhập tên thể loại bạn muốn tìm kiếm: ");
		strCategory = aimsScanner.nextLine();
		System.out.println("Danh sách những DVD thể loại: " + strCategory);
		boolean hasResult = false;
		for(DigitalVideoDisc item : digitalVideoDisc) {
			if(strCategory.equals(item.getCategory())) {
				item.displayInfor();
				hasResult = true;
			}
		}
		if(hasResult == false) System.out.println("Không có kết quả tìm kiếm!!!");
		
		
	}
	
	public static void searchDVDsByTitle(List<DigitalVideoDisc> digitalVideoDisc) {
		String strTitle;
		System.out.println("Nhập tên DVD muốn tìm kiếm: ");
		strTitle = aimsScanner.nextLine();
		boolean hasResult = false;
		System.out.println("Kết quả tìm kiếm: \"" + strTitle +"\"" );
		for(DigitalVideoDisc item : digitalVideoDisc) {
			
			if(item.getTitle().contains(strTitle)) {
				item.displayInfor();
				hasResult = true;
			}
		}
		
		if(hasResult == false) System.out.println("Không có kết quả tìm kiếm!!!");
	}
	
	public static void searchDVDsByCost(List<DigitalVideoDisc> digitalVideoDisc, double cost1, double cost2) {
		boolean hasResult = false;
		
		System.out.println("Danh sách những DVD trong tầm giá " + cost1 + "$ đến " + cost2 + "$:");
		for(DigitalVideoDisc item : digitalVideoDisc) {
			if(item.getCost() >= cost1 && item.getCost() <= cost2){
				item.displayInfor();
				hasResult = true;
			}
		}
		
		if(hasResult == false) System.out.println("Không có kết quả tìm kiếm!!!");
	}

}
