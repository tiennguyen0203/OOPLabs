
public class TestPassingParameter {

	public static void main(String[] args) {
		DVD jungleDVD = new DVD("Jungle");
		DVD cinderellaDVD = new DVD("Cinderella");
		
		System.out.println("Before swap:");
		System.out.println("   Jungle title: "+jungleDVD.getTitle());
		System.out.println("   Cinderella title: " +cinderellaDVD.getTitle());
		System.out.println();
		swap(jungleDVD, cinderellaDVD);
		
		System.out.println("After swap:");
		System.out.println("   Jungle title: "+jungleDVD.getTitle());
		System.out.println("   Cinderella title: " +cinderellaDVD.getTitle());
		
		

	}

	private static void swap(DVD dvd1, DVD dvd2) {
		String tempTitle = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(tempTitle);
	}

}
