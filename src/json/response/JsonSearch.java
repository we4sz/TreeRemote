package json.response;

import java.io.Serializable;
import java.util.List;

import json.models.ArtistAlbumTrack;
import json.models.BohnifyAlbum;
import json.models.BohnifyArtist;
import json.models.TrackPlaylist;

public class JsonSearch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1825614697626016205L;
	private List<ArtistAlbumTrack> trackResults;
	private BohnifyArtist artistResult;
	private BohnifyAlbum albumResult;
	private TrackPlaylist playlistResult;
	private String suggestion;
	private String search;

	public JsonSearch(String s) {
		this.search = s;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public TrackPlaylist getPlaylistResult() {
		return playlistResult;
	}

	public void setPlaylistResult(TrackPlaylist playlistResult) {
		this.playlistResult = playlistResult;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public BohnifyAlbum getAlbumResult() {
		return albumResult;
	}

	public BohnifyArtist getArtistResult() {
		return artistResult;
	}

	public List<ArtistAlbumTrack> getTrackResults() {
		return trackResults;
	}

	public void setAlbumResult(BohnifyAlbum albumResult) {
		this.albumResult = albumResult;
	}

	public void setArtistResult(BohnifyArtist artistResult) {
		this.artistResult = artistResult;
	}

	public void setTrackResults(List<ArtistAlbumTrack> trackResults) {
		this.trackResults = trackResults;
	}
}
