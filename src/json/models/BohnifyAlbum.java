package json.models;

import java.io.Serializable;
import java.util.List;

public class BohnifyAlbum implements Serializable, Comparable<BohnifyAlbum> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4744746243750159537L;
	private String id;
	private String name;
	private String cover;
	private List<ArtistAlbumTrack> tracks;
	private int year;
	private BohnifyArtist artist;
	private AlbumType type = AlbumType.UNKNOWN;
	private int index;

	public BohnifyAlbum() {
	}

	public BohnifyAlbum(BohnifyAlbum a) {
		String c = null;
		if (a.getCover() != null) {
			c = a.getCover();
		}
		this.id = a.getId();
		this.name = a.getName();
		this.cover = c;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setType(AlbumType type) {
		this.type = type;
	}

	public AlbumType getType() {
		return type;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setArtist(BohnifyArtist artist) {
		this.artist = artist;
	}

	public BohnifyArtist getArtist() {
		return artist;
	}

	public List<ArtistAlbumTrack> getTracks() {
		return tracks;
	}

	public void setTracks(List<ArtistAlbumTrack> tracks) {
		this.tracks = tracks;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(BohnifyAlbum o) {
		return this.getIndex() - o.getIndex();
	}

}
