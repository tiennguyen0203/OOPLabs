import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
	private static String passwordToStore = "nguyentien123";
	public List<DVD> dvdList = new ArrayList<>();
	public void addNewDVD(DVD dvd) {
		dvdList.add(dvd);
		System.out.println("Thêm DVD mới thành công!!!");
	}
	
	public void showDVDList() {
		for(DVD dvd : dvdList) dvd.displayInfor();
	}
	
	public void removeDVD(String strRemove) {
		if(dvdList != null){
			Iterator<DVD> iterator = dvdList.iterator();
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
