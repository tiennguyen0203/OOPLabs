import java.util.Comparator;

public abstract class Media {
	private int id;
	protected String title;
	private String category;
	protected float cost;
	
	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	
	@Override
	public boolean equals(Object obj) {	
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Media media = (Media) obj;
		return title != null && title.equals(media.title);
	}
	
	@Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
	
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new Comparator<Media>() {
        @Override
        public int compare(Media media1, Media media2) {
            int titleComparison = media1.getTitle().compareTo(media2.getTitle());
            
            if (titleComparison != 0) {
                return titleComparison;
            }
            
            return Float.compare(media2.getCost(), media1.getCost());
        }
    };
    
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new Comparator<Media>() {
        @Override
        public int compare(Media media1, Media media2) {
            int costComparison = Float.compare(media2.getCost(), media1.getCost());
            
            if (costComparison != 0) {
                return costComparison;
            }
            
            return media1.getTitle().compareTo(media2.getTitle());
        }
    };
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
}
