public class DigitalVideoDisc extends Disc implements Playable {
		public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
			super(id, title, category, cost, length, director);
		}
	
	@Override
	public void play() {
				
	}

	@Override
    public String toString() {
        return "DigitalVideoDisc [Title=" + getTitle() + ", Category=" + getCategory() + ", Cost=" + getCost() +
               ", Director=" + getDirector() + ", Length=" + getLength() + " minutes]";
    }
	
	
}
