package json.response;

import java.io.Serializable;

import json.models.ArtistAlbumTrack;

public class JsonCurrent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7013334957440417207L;
	private ArtistAlbumTrack track;
	private int position;
	private boolean isRepeat;
	private boolean isRandom;
	private boolean isPaused;
	private boolean isParty;
	private int volume;
	private int duration;

	public boolean isParty() {
		return isParty;
	}

	public void setParty(boolean isParty) {
		this.isParty = isParty;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public boolean isRepeat() {
		return isRepeat;
	}

	public void setRepeat(boolean isRepeat) {
		this.isRepeat = isRepeat;
	}

	public boolean isPaused() {
		return isPaused;
	}

	public void setPaused(boolean isPaused) {
		this.isPaused = isPaused;
	}

	public boolean isRandom() {
		return isRandom;
	}

	public void setRandom(boolean isRandom) {
		this.isRandom = isRandom;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public ArtistAlbumTrack getTrack() {
		return track;
	}

	public void setTrack(ArtistAlbumTrack t) {
		this.track = t;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
