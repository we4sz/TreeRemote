package json.models;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class BohnifyArtist implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8417553299965545920L;
	private String id;
	private String name;
	private List<BohnifyAlbum> albums;
	private List<ArtistAlbumTrack> favorites;
	private String bios;
	private List<BohnifyArtist> similar;
	private String picture;

	public BohnifyArtist() {
	}

	public BohnifyArtist(BohnifyArtist a) {
		this.name = a.getName();
		this.id = a.getId();
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}

	public List<BohnifyArtist> getSimilar() {
		return similar;
	}

	public void setSimilar(List<BohnifyArtist> similar) {
		this.similar = similar;
	}

	public List<BohnifyAlbum> getAlbums() {
		return albums;
	}

	public void setAlbums(List<BohnifyAlbum> albums) {
		this.albums = albums;
	}

	public List<ArtistAlbumTrack> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<ArtistAlbumTrack> favorites) {
		this.favorites = favorites;
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

}
