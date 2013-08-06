package json.response;

import java.io.Serializable;
import java.util.List;

import json.models.ArtistAlbumTrack;


public class JsonTracks implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1123780423139251351L;
	private List<ArtistAlbumTrack> tracks;
    private List<ArtistAlbumTrack> standardQueue;
    private List<ArtistAlbumTrack> manualQueue;

    public JsonTracks() {
    }

    public JsonTracks(List<ArtistAlbumTrack> tracks) {
        this.tracks = tracks;
    }

    public void setManualQueue(List<ArtistAlbumTrack> manualQueue) {
        this.manualQueue = manualQueue;
    }

    public List<ArtistAlbumTrack> getManualQueue() {
        return manualQueue;
    }

    public List<ArtistAlbumTrack> getStandardQueue() {
        return standardQueue;
    }

    public void setStandardQueue(List<ArtistAlbumTrack> standardQueue) {
        this.standardQueue = standardQueue;
    }

    public List<ArtistAlbumTrack> getTracks() {
        return tracks;
    }

    public void setTracks(List<ArtistAlbumTrack> tracks) {
        this.tracks = tracks;
    }
}
