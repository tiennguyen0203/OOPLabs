public class TestPassingParameter {

	public static void main(String[] args) {
		DVD jungleDVD = new DVD("Jungle");
		DVD cinderellaDVD = new DVD("Cinderella");
		
		System.out.println("Before swap:");
		System.out.println("   Jungle title: "+jungleDVD.getTitle()); 				//Jungle title: Jungle
		System.out.println("   Cinderella title: " +cinderellaDVD.getTitle());      //Cinderella title: Cinderella
		System.out.println();
		
		//swap2(jungleDVD, cinderellaDVD);
		swap2(jungleDVD, cinderellaDVD);
		
		System.out.println("After swap:");
		System.out.println("   Jungle title: "+jungleDVD.getTitle());				//Jungle title: Cinderella
		System.out.println("   Cinderella title: " +cinderellaDVD.getTitle());		//Cinderella title: Jungle
		
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("   Jungle title: "+jungleDVD.getTitle());
	}
	
//	private static void swap(Object o1, Object o2) {
//		Object temp = o1;
//		o1 = o2;
//		o2 = temp;
//	}
//
//	public static void changeTitle(DVD dvd, String title) {
//		String oldTitle = dvd.getTitle();
//		dvd.setTitle(title);
//		dvd = new DVD(oldTitle);
//		
//	}
	private static void swap2(DVD dvd1, DVD dvd2) {
		String tempTitle = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(tempTitle);
	}

}
