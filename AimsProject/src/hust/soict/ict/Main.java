import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Store store = DataGenerator.generateStoreData();
		Scanner scanner = new Scanner(System.in);
		Cart cart = new Cart();
		
		int aimsOption = 0, storeOption = 0, mediaDetailsOption = 0, cartOption = 0, updateStoreOption = 0;
		do {
			showMenu();
			aimsOption = scanner.nextInt();
			scanner.nextLine();
			switch(aimsOption) {
			case 2: 
				do {
					updateStoreDetails();
					updateStoreOption = scanner.nextInt();
					scanner.nextLine();
					switch(updateStoreOption) {
					case 1:
						System.out.println("Choose the type of media to add:");
	                    System.out.println("1. Book");
	                    System.out.println("2. Digital Video Disc (DVD)");
	                    System.out.println("3. Compact Disc (CD)");
	                    int mediaType = scanner.nextInt();
	                    scanner.nextLine(); 

	                    switch (mediaType) {
	                        case 1: // Add Book
	                            System.out.print("Enter book ID: ");
	                            int bookId = scanner.nextInt();
	                            scanner.nextLine();
	                            System.out.print("Enter book title: ");
	                            String bookTitle = scanner.nextLine();
	                            System.out.print("Enter book category: ");
	                            String bookCategory = scanner.nextLine();
	                            System.out.print("Enter book cost: ");
	                            float bookCost = scanner.nextFloat();
	                            scanner.nextLine();
	                            System.out.print("Enter authors (comma-separated): ");
	                            String authorsInput = scanner.nextLine();
	                            List<String> authors = List.of(authorsInput.split(","));

	                            Book book = new Book(bookId, bookTitle, bookCategory, bookCost, authors);
	                            store.addNewItem(book);
	                            System.out.println("Book added successfully!");
	                            break;

	                        case 2: // Add DVD
	                            System.out.print("Enter DVD ID: ");
	                            int dvdId = scanner.nextInt();
	                            scanner.nextLine();
	                            System.out.print("Enter DVD title: ");
	                            String dvdTitle = scanner.nextLine();
	                            System.out.print("Enter DVD category: ");
	                            String dvdCategory = scanner.nextLine();
	                            System.out.print("Enter DVD cost: ");
	                            float dvdCost = scanner.nextFloat();
	                            scanner.nextLine();
	                            System.out.print("Enter DVD length: ");
	                            int dvdLength = scanner.nextInt();
	                            scanner.nextLine();
	                            System.out.print("Enter DVD director: ");
	                            String dvdDirector = scanner.nextLine();

	                            DigitalVideoDisc dvd = new DigitalVideoDisc(dvdId, dvdTitle, dvdCategory, dvdCost, dvdLength, dvdDirector);
	                            store.addNewItem(dvd);
	                            System.out.println("DVD added successfully!");
	                            break;

	                        case 3: // Add CD
	                            System.out.print("Enter CD ID: ");
	                            int cdId = scanner.nextInt();
	                            scanner.nextLine();
	                            System.out.print("Enter CD title: ");
	                            String cdTitle = scanner.nextLine();
	                            System.out.print("Enter CD category: ");
	                            String cdCategory = scanner.nextLine();
	                            System.out.print("Enter CD cost: ");
	                            float cdCost = scanner.nextFloat();
	                            scanner.nextLine();
	                            System.out.print("Enter CD length: ");
	                            int cdLength = scanner.nextInt();
	                            scanner.nextLine();
	                            System.out.print("Enter CD director: ");
	                            String cdDirector = scanner.nextLine();
	                            System.out.print("Enter CD artist: ");
	                            String cdArtist = scanner.nextLine();

	                            // Adding tracks
	                            List<Track> tracks = new ArrayList<>();
	                            System.out.print("How many tracks does the CD have? ");
	                            int trackCount = scanner.nextInt();
	                            scanner.nextLine();
	                            for (int i = 0; i < trackCount; i++) {
	                                System.out.print("Enter title for track " + (i + 1) + ": ");
	                                String trackTitle = scanner.nextLine();
	                                System.out.print("Enter length for track " + (i + 1) + ": ");
	                                int trackLength = scanner.nextInt();
	                                scanner.nextLine();
	                                tracks.add(new Track(trackTitle, trackLength));
	                            }

	                            CompactDisc cd = new CompactDisc(cdId, cdTitle, cdCategory, cdCost, cdLength, cdDirector, cdArtist, tracks);
	                            store.addNewItem(cd);
	                            System.out.println("CD added successfully!");
	                            break;

	                        default:
	                            System.out.println("Invalid media type! Choose again.");
	                            break;
	                    }
						break;
					case 2:
						System.out.print("Enter the title of the media to remove: ");
	                    String removeTitle = scanner.nextLine();
	                    store.removeItems(removeTitle);
	                    break;
					case 0:
						System.out.println("Returning to the main menu.");
						break;
						default:
							System.out.println("Invalid option! Choose again!");	
							break;
					}
					
				}while(updateStoreOption != 0);
				break;
			case 1:
				do {
					storeMenu();
					storeOption = scanner.nextInt();
					scanner.nextLine();
					switch(storeOption) {
					case 1: 
						System.out.print("Enter media title to show details: ");
			            String mediaTitle = scanner.nextLine();

			            Media foundMedia = store.searchMediaByTitle(mediaTitle);
			            if (foundMedia != null) {
			                System.out.println("Media details: ");
			                System.out.println(foundMedia.toString()); 
			                
			                do {
			                    mediaDetailsMenu(); 
			                    mediaDetailsOption = scanner.nextInt();
			                    scanner.nextLine();
			                    switch (mediaDetailsOption) {
			                        case 1: 
			                            cart.addMedia(foundMedia);
			                            System.out.println("Media added to cart.");
			                            break;
			                        case 2: 
			                            if (foundMedia instanceof Playable) {
			                                System.out.println("Playing media...");
			                                ((Playable) foundMedia).play();
			                            } else {
			                                System.out.println("This media is not playable.");
			                            }
			                            break;
			                        case 0: 
			                            System.out.println("Returning to the previous menu.");
			                            break;
			                        default:
			                            System.out.println("Invalid option! Choose again!");
			                            break;
			                    }
			                } while (mediaDetailsOption != 0);

			            } else {
			                System.out.println("Media not found.");
			            }
			            break;
					case 2:
						System.out.print("Enter title of media: ");
			            String title = scanner.nextLine();

			            Media foundMedia2 = store.searchMediaByTitle(title);
			            if (foundMedia2 != null) {
			                cart.addMedia(foundMedia2);
			                System.out.println("Media added to cart.");
			            } else {
			                System.out.println("Media not found.");
			            }
			            break;
					case 3:
						if (!store.itemsInStore.isEmpty()) {
			                Media randomMedia = store.itemsInStore.get((int) (Math.random() * store.itemsInStore.size()));
			                if (randomMedia instanceof Playable) {
			                    System.out.println("Playing random media: " + randomMedia.getTitle());
			                    ((Playable) randomMedia).play();
			                } else {
			                    System.out.println("Selected random media is not playable.");
			                }
			            } else {
			                System.out.println("Store is empty.");
			            }
			            break;
					case 4:
						if (cart.itemsOrdered.isEmpty()) {
			                System.out.println("Cart is empty.");
			            } else {
			                cart.showCart();
			                do {
			                    cartMenu(); 
			                    cartOption = scanner.nextInt();
			                    scanner.nextLine();
			                    switch (cartOption) {
			                        case 1: 
			                            System.out.print("Enter title to filter: ");
			                            String filterTitle = scanner.nextLine();
			                            boolean found = false;
			                            for (Media media : cart.itemsOrdered) {
			                                if (media.getTitle().contains(filterTitle)) {
			                                    System.out.println(media.toString());
			                                    found = true;
			                                }
			                            }
			                            if (!found) {
			                                System.out.println("No media found with the given title.");
			                            }
			                            break;
			                        case 2: 
			                            System.out.println("Choose sorting option:");
			                            System.out.println("1. By title");
			                            System.out.println("2. By cost");
			                            int sortOption = scanner.nextInt();
			                            scanner.nextLine();
			                            if (sortOption == 1) {
			                                cart.sortItemsByTitle();
			                                System.out.println("Cart sorted by title:");
			                            } else if (sortOption == 2) {
			                                cart.sortItemsByCost();
			                                System.out.println("Cart sorted by cost:");
			                            } else {
			                                System.out.println("Invalid sorting option.");
			                            }
			                            cart.showCart();
			                            break;
			                        case 3: 
			                            System.out.print("Enter the title of the media to remove: ");
			                            String removeTitle = scanner.nextLine();
			                            cart.removeMedia(removeTitle);
			                            break;
			                        case 4: 
			                            System.out.print("Enter the title of the media to play: ");
			                            String playTitle = scanner.nextLine();
			                            boolean played = false;
			                            for (Media media : cart.itemsOrdered) {
			                                if (media.getTitle().equalsIgnoreCase(playTitle) && media instanceof Playable) {
			                                    ((Playable) media).play();
			                                    played = true;
			                                    break;
			                                }
			                            }
			                            if (!played) {
			                                System.out.println("Media not found or is not playable.");
			                            }
			                            break;
			                        case 5: 
			                            if (cart.itemsOrdered.isEmpty()) {
			                                System.out.println("Cart is empty. Add items before placing an order.");
			                            } else {
			                                System.out.println("Order placed successfully! Total cost: $" + cart.totalCost());
			                                cart.itemsOrdered.clear(); 
			                            }
			                            break;
			                        case 0: 
			                            System.out.println("Returning to the previous menu.");
			                            break;
			                        default:
			                            System.out.println("Invalid option! Choose again!");
			                            break;
			                    }
			                } while (cartOption != 0);
			            }
			            break;
					case 0: 
						System.out.println("Returning to the previous menu.");
						break;
					default:
						System.out.println("Invalid option! Choose again!");	
						break;
					}
				}while(storeOption != 0);
				
				break;
			case 3:
				cart.showCart();
				do {
					cartMenu();
					cartOption = scanner.nextInt();
					scanner.nextLine();
					switch(cartOption) {
					case 1:
						System.out.print("Enter title to filter: ");
	                    String filterTitle = scanner.nextLine();
	                    boolean found = false;
	                    for (Media media : cart.itemsOrdered) {
	                        if (media.getTitle().contains(filterTitle)) {
	                            System.out.println(media.toString());
	                            found = true;
	                        }
	                    }
	                    if (!found) {
	                        System.out.println("No media found with the given title.");
	                    }
						break;
					case 2:
						System.out.println("Choose sorting option:");
	                    System.out.println("1. By title");
	                    System.out.println("2. By cost");
	                    int sortOption = scanner.nextInt();
	                    if (sortOption == 1) {
	                        cart.sortItemsByTitle();
	                        System.out.println("Cart sorted by title:");
	                    } else if (sortOption == 2) {
	                        cart.sortItemsByCost();
	                        System.out.println("Cart sorted by cost:");
	                    } else {
	                        System.out.println("Invalid sorting option.");
	                    }
	                    cart.showCart();
						break;
					case 3:
						System.out.print("Enter the title of the media to remove: ");
	                    String removeTitle = scanner.nextLine();
	                    cart.removeMedia(removeTitle);
						break;
					case 4:
						System.out.print("Enter the title of the media to play: ");
	                    String playTitle = scanner.nextLine();
	                    boolean played = false;
	                    for (Media media : cart.itemsOrdered) {
	                        if (media.getTitle().equalsIgnoreCase(playTitle) && media instanceof Playable) {
	                            ((Playable) media).play();
	                            played = true;
	                            break;
	                        }
	                    }
	                    if (!played) {
	                        System.out.println("Media not found or is not playable.");
	                    }
						break;
					case 5:
						if (cart.itemsOrdered.isEmpty()) {
	                        System.out.println("Cart is empty. Add items before placing an order.");
	                    } else {
	                        System.out.println("Order placed successfully! Total cost: $" + cart.totalCost());
	                        cart.itemsOrdered.clear();
	                    }
						break;
					case 0:
						System.out.println("Returning to the previous menu.");
						break;
						default:
							System.out.println("Invalid option! Choose again!");	
							break;
							
					}
				}while(cartOption != 0);
				break;
			case 0:
				System.out.println("Goodbye!!!");
				break;
			default:
				System.out.println("Invalid option! Choose again!");	
				break;
			}
		}while(aimsOption != 0);
		
		scanner.close();
	    
	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	
	public static void storeMenu() {
		System.out.println("Store options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu() {
		System.out.println("Media details options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Cart Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	public static void updateStoreDetails() {
		System.out.println("Update Store: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add new media");
		System.out.println("2. Remove a media");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

}
