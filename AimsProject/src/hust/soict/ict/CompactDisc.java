import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	
	private List<Track> tracks = new ArrayList<Track>();
	private String artist;

	public CompactDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	
}
