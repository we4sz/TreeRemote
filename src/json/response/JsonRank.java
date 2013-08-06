package json.response;

import java.io.Serializable;
import java.util.List;

import json.models.ArtistAlbumTrack;

public class JsonRank implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3321080172099947527L;
	private List<ArtistAlbumTrack> tracks;

	public void setTracks(List<ArtistAlbumTrack> tracks) {
		this.tracks = tracks;
	}

	public List<ArtistAlbumTrack> getTracks() {
		return tracks;
	}

}
