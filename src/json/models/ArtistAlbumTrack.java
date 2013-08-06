package json.models;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class ArtistAlbumTrack implements Serializable,
		Comparable<ArtistAlbumTrack> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1865885542382282112L;
	private String id;
	private String title;
	private List<BohnifyArtist> artists;
	private BohnifyAlbum album;
	private int length;
	private int popularity;
	private int rank = 0;
	private int trackNr;
	private int index = -1;

	public ArtistAlbumTrack() {

	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getTrackNr() {
		return trackNr;
	}

	public void setTrackNr(int trackNr) {
		this.trackNr = trackNr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<BohnifyArtist> getArtists() {
		return artists;
	}

	public void setArtists(List<BohnifyArtist> artists) {
		if (artists != null && artists.size() == 0) {
			this.artists = null;
		} else {
			this.artists = artists;
		}
	}

	public BohnifyAlbum getAlbum() {
		return album;
	}

	public void setAlbum(BohnifyAlbum album) {
		this.album = album;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ArtistAlbumTrack) {
			ArtistAlbumTrack t = (ArtistAlbumTrack) obj;
			return t.getId().equals(id);
		}
		return false;
	}

	@Override
	public int compareTo(ArtistAlbumTrack o) {
		return o.rank - rank;
	}
}
