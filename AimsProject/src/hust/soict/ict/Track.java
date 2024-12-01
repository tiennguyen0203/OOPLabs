
public class Track implements Playable{
	private String title;
	private int length;
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public boolean equals(Track o1, Track o2) {
		if(o1.getTitle() == o2.getTitle() && o1.getLength() == o2.getLength()) {
			return true;
		}
		else return false;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
