package json.models;

import java.io.Serializable;
import java.util.List;

public class TrackPlaylist implements Serializable, Comparable<TrackPlaylist> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9173951089192502139L;
	private String id;
	private List<ArtistAlbumTrack> tracks;
	private String name;
	private String author;
	private String description;
	private String picture;
	private int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getId() {
		return id;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ArtistAlbumTrack> getTracks() {
		return tracks;
	}

	public void setTracks(List<ArtistAlbumTrack> tracks) {
		this.tracks = tracks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int compareTo(TrackPlaylist o) {
		return this.getIndex() - o.getIndex();
	}

}
