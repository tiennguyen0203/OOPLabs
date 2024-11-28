
import java.util.Scanner;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		Scanner storeScanner = new Scanner(System.in);
		
		String password = "";
    	do {
    		System.out.print("Nhập mật khẩu cho quản lý:");
        	password = storeScanner.nextLine();
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
    			storeOption = storeScanner.nextInt();
    			storeScanner.nextLine();
    			switch(storeOption) {
    			case 1:
    				store.showDVDList();
    				break;
    			case 2:
    				System.out.println("Nhập thông tin DVD mới");
    				System.out.print("Tiêu đề: ");
    				String title = storeScanner.nextLine();
    				System.out.print("Thể loại: ");
    				String category = storeScanner.nextLine();
    				System.out.print("Tác giả: ");
    				String director = storeScanner.nextLine();
    				System.out.print("Độ dài: ");
    				float lenght = storeScanner.nextFloat();
    				System.out.print("Giá tiền: ");
    				double cost = storeScanner.nextDouble();
    				
    				store.addNewDVD(new DVD(title,category,director,lenght,cost));
    				
    				System.out.println("Thêm DVD mới thành công");
    				break;
    			case 3:
    				System.out.print("Nhập tên DVD muốn xóa: ");
    				String removeDVDName = storeScanner.nextLine();
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
    		
    		storeScanner.close();
	}
}
