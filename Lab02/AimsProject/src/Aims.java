import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<DVD> dvdList = new ArrayList<>();
		dvdList.add(new DVD(1, "The Shawshank Redemption", "Drama", "Frank Darabont", 142, 15.99));
        dvdList.add(new DVD(2, "The Godfather", "Crime", "Francis Ford Coppola", 175, 18.50));
        dvdList.add(new DVD(3, "The Dark Knight", "Action", "Christopher Nolan", 152, 20.00));
        dvdList.add(new DVD(4, "Schindler's List", "Biography", "Steven Spielberg", 195, 12.99));
        dvdList.add(new DVD(5, "Pulp Fiction", "Crime", "Quentin Tarantino", 154, 16.75));
        dvdList.add(new DVD(6, "The Lord of the Rings: The Return of the King", "Adventure", "Peter Jackson", 201, 19.99));
        dvdList.add(new DVD(7, "Forrest Gump", "Drama", "Robert Zemeckis", 142, 14.99));
        dvdList.add(new DVD(8, "Inception", "Sci-Fi", "Christopher Nolan", 148, 17.50));
        dvdList.add(new DVD(9, "Fight Club", "Drama", "David Fincher", 139, 13.99));
        dvdList.add(new DVD(10, "The Matrix", "Sci-Fi", "Lana Wachowski, Lilly Wachowski", 136, 15.00));
        dvdList.add(new DVD(11, "Goodfellas", "Crime", "Martin Scorsese", 146, 14.50));
        dvdList.add(new DVD(12, "Se7en", "Thriller", "David Fincher", 127, 13.50));
        dvdList.add(new DVD(13, "Interstellar", "Sci-Fi", "Christopher Nolan", 169, 18.00));
        dvdList.add(new DVD(14, "The Green Mile", "Fantasy", "Frank Darabont", 189, 12.75));
        dvdList.add(new DVD(15, "Gladiator", "Action", "Ridley Scott", 155, 16.00));
        dvdList.add(new DVD(16, "Braveheart", "Biography", "Mel Gibson", 178, 14.25));
        dvdList.add(new DVD(17, "The Departed", "Crime", "Martin Scorsese", 151, 16.99));
        dvdList.add(new DVD(18, "Memento", "Mystery", "Christopher Nolan", 113, 13.75));
        dvdList.add(new DVD(19, "Django Unchained", "Western", "Quentin Tarantino", 165, 17.50));
        dvdList.add(new DVD(20, "The Lion King", "Animation", "Roger Allers, Rob Minkoff", 88, 10.99));
        dvdList.add(new DVD(21, "Toy Story", "Animation", "John Lasseter", 81, 9.99));
        dvdList.add(new DVD(22, "The Avengers", "Action", "Joss Whedon", 143, 19.00));
        dvdList.add(new DVD(23, "The Silence of the Lambs", "Thriller", "Jonathan Demme", 118, 14.75));
        dvdList.add(new DVD(24, "Saving Private Ryan", "War", "Steven Spielberg", 169, 15.99));
        dvdList.add(new DVD(25, "The Prestige", "Drama", "Christopher Nolan", 130, 16.50));
        dvdList.add(new DVD(26, "Whiplash", "Drama", "Damien Chazelle", 106, 13.00));
        dvdList.add(new DVD(27, "The Wolf of Wall Street", "Biography", "Martin Scorsese", 180, 18.25));
        dvdList.add(new DVD(28, "Black Panther", "Action", "Ryan Coogler", 134, 17.75));
        dvdList.add(new DVD(29, "Joker", "Crime", "Todd Phillips", 122, 15.00));
        dvdList.add(new DVD(30, "La La Land", "Romance", "Damien Chazelle", 128, 14.50));
        dvdList.add(new DVD(31, "The Incredibles", "Animation", "Brad Bird", 115, 11.99));
        dvdList.add(new DVD(32, "Up", "Animation", "Pete Docter, Bob Peterson", 96, 12.99));
        dvdList.add(new DVD(33, "A Beautiful Mind", "Biography", "Ron Howard", 135, 13.99));
        dvdList.add(new DVD(34, "The Social Network", "Biography", "David Fincher", 120, 14.25));
        dvdList.add(new DVD(35, "Mad Max: Fury Road", "Action", "George Miller", 120, 16.75));
        
        Scanner aimsScanner = new Scanner(System.in);
        
        
        StoreManager storeManager = new StoreManager("Nguyentien", "123456");
        Cart cart = new Cart();
        List<OrderItem> orderitems = new ArrayList<OrderItem>();
        int option = 0;
		
		System.out.println("Chào mừng bạn đã đến với hệ thống mua đĩa DVD. Hãy nhập thông tin của bạn để được hỗ trợ.");
		System.out.print("Họ và tên khách hàng: ");
		String customerName = aimsScanner.nextLine();
		System.out.print("Email: ");
		String customerEmail = aimsScanner.nextLine();
		
		Customer customer = new Customer(customerName, customerEmail, cart);
		
		do {
			System.out.println("Cảm ơn bạn đã nhập thông tin. Vui lòng chọn các dịch vụ sau: ");
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
					for(DVD dvd : dvdList) dvd.displayInfor();
					break;
				case 2: 
					customer.searchDVDsByCategory(dvdList);
					break;
				case 3: 
					customer.searchDVDsByTitle(dvdList);
					break;
				case 4:
					System.out.println("Nhập giá tiền bạn mong muốn.");
					System.out.print("Từ: ");
					double cost1 = aimsScanner.nextDouble();
					aimsScanner.nextLine();
					System.out.print("Đến: ");
					double cost2 = aimsScanner.nextDouble();
					aimsScanner.nextLine();
					customer.searchDVDsByCost(dvdList, cost1, cost2);
					break;
				case 5: 
					cart.displayCartItems();
					int cartOption = 0;
					do {
						System.out.println();
						System.out.println("1.Sắp xếp theo tiêu đề.");
						System.out.println("2.Sắp xếp theo giá.");
						System.out.println("3.Nhận DVD miễn phí.");
						System.out.println("4.Thêm DVD vào giỏ hàng");
						System.out.println("5.Thay đổi số lượng sản phẩm.");
						System.out.println("6.Đặt hàng.");
						System.out.println("7.Thoát khỏi giỏ hàng.");
						System.out.print("Nhập lựa chọn của bạn: ");
						
						cartOption = aimsScanner.nextInt();
						aimsScanner.nextLine();
						
						switch(cartOption) {
							case 1: 
								cart.sortItemsByTitle();
								cart.displayCartItems();
								break;
							case 2:
								cart.sortItemsByCost();
								cart.displayCartItems();
								break;
							case 3: 
								cart.getFreeItem();
								cart.displayCartItems();
								break;
							case 4:
								System.out.print("Nhập tên DVD bạn muốn thêm vào giỏ hàng: ");
								String dvdName = aimsScanner.nextLine();
								System.out.print("Số lượng: ");
								int quantity = aimsScanner.nextInt();
								aimsScanner.nextLine();
								
								boolean added = false;
								
								for(DVD dvd : dvdList) {
									if(dvd.getTitle().equals(dvdName)){
										cart.addItem(dvd, quantity);
										added = true;
										System.out.println("Đã thêm sản phẩm vào giỏ hàng!");
										System.out.println();
									}
									
								}
								
								if(added == false) {
									System.out.println("Không có sản phẩm: " + dvdName);
								}
								
								cart.displayCartItems();
								break;
							case 5:
								System.out.print("Nhập tên DVD bạn muốn thay đổi số lượng: ");
								String dvdUpdateName = aimsScanner.nextLine();
								System.out.print("Số lượng mới: ");
								int updateQuantity = aimsScanner.nextInt();
								aimsScanner.nextLine();
								cart.updateQuantity(dvdUpdateName, updateQuantity);
								cart.displayCartItems();
								break;
								
							case 6: 
								System.out.print("Vui lòng nhập địa chỉ giao hàng: ");
								String address = aimsScanner.nextLine();
								System.out.print("Ghi chú giao hàng: ");
								String instructions = aimsScanner.nextLine();
								
								Delivery delivery = new Delivery(address, instructions, 1.00);
								
								System.out.println("Thông tin giao hàng:");
								delivery.deliveryShowInformation(customer);
								
								LocalDateTime now = LocalDateTime.now();
							      
						        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
						        
						        for(CartItem cartItem : cart.cartItems) {
						        	orderitems.add(new OrderItem(cartItem.dvd, cartItem.quantity));
						        }
						        
								Order order = new Order("ORDER-" + now.format(formatter), customer, orderitems, false);
								storeManager.listOrder.add(order);
								break;
								
							case 7:
								System.out.println("Đã thoát khỏi giỏ hàng!");
								break;
							default:
								System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại lựa chọn của bạn.");
								break;
						}
						
						
					}while(cartOption != 7);
					break;
				case 6:
					System.out.println("Cảm ơn bạn. Hẹn gặp lại lần sau!!!");
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại lựa chọn của bạn.");
					break;
				
			}
		}while(option != 6);
		
		aimsScanner.close();
	}

}
