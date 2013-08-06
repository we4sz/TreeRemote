package json.response;

import java.io.Serializable;
import java.util.List;

import json.models.TrackPlaylist;


public class JsonPlayLists implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3727607252913171063L;
	private List<TrackPlaylist> playLists;

	public void setPlayLists(List<TrackPlaylist> playLists) {
		this.playLists = playLists;
	}

	public List<TrackPlaylist> getPlayLists() {
		return playLists;
	}

}
