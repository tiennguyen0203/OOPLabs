import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	
	private List<Track> tracks = new ArrayList<Track>();
	private String artist;

	public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List<Track> tracks) {
		super(id, title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
		
		int cdLength = 0;
		for(Track i : tracks) {
			cdLength += i.getLength();		
			}
		
		this.setLength(cdLength);
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
	
	
	@Override
    public String toString() {
        String trackTitles = "";
        for (Track track : tracks) {
            trackTitles += track.getTitle() + " (" + track.getLength() + " sec), ";
        }

        if (trackTitles.length() > 0) {
            trackTitles = trackTitles.substring(0, trackTitles.length() - 2);
        }

        return "CompactDisc [Title=" + getTitle() + ", Category=" + getCategory() + ", Cost=" + getCost() +
                ", Artist=" + artist + ", Length=" + getLength() + " minutes, Tracks=[" + trackTitles + "]]";
	}
	
}
