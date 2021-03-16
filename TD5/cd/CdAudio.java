package cd;

public class CdAudio {
	private long isbn;
	private String artist;
	private String title;
	private String style;
	private int nbTracks;
	
	public CdAudio(long isbn, String artist, String title, String style, int nbTracks) {
		super();
		this.isbn = isbn;
		this.artist = artist;
		this.title = title;
		this.style = style;
		this.nbTracks = nbTracks;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getNbTracks() {
		return nbTracks;
	}

	public void setNbTracks(int nbTracks) {
		this.nbTracks = nbTracks;
	}
}
