import java.util.Iterator;

public class Store {
	private static String passwordToStore = "nguyentien123";
	public void addNewDVD(DVD dvd) {
		Main.dvdList.add(dvd);
		System.out.println("Thêm DVD mới thành công!!!");
	}
	
	public void showDVDList() {
		for(DVD dvd : Main.dvdList) dvd.displayInfor();
	}
	
	public void removeDVD(String strRemove) {
		if(Main.dvdList != null){
			Iterator<DVD> iterator = Main.dvdList.iterator();
			while(iterator.hasNext()) {
				DVD removeDVD = iterator.next();
				if(removeDVD.getTitle().equals(strRemove)) {
					iterator.remove();
					System.out.println("Xóa DVD thành công!!!");
				}
			}
		}
	}
	
	public String getPasswordToStore() {
		return passwordToStore;
	}
}
