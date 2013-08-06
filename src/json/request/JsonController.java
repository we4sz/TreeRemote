package json.request;

import java.io.Serializable;
import java.util.List;

public class JsonController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8473360809046823288L;
	private boolean repeat = false;
	private boolean random = false;
	private boolean paused = false;
	private boolean next = false;
	private boolean prev = false;
	private int seek = -1;
	private int volume = -1;
	private String search = null;
	private boolean queue = false;
	private boolean history = false;
	private boolean toplist = false;
	private String playList = null;
	private String playTrack = null;
	private List<String> removeStandardQueueTracks = null;
	private List<String> removeManualQueueTracks = null;
	private List<String> addStandardQueueTracks = null;
	private List<String> addManualQueueTracks = null;
	private List<String> setStandardQueueTracks = null;
	private List<String> setManualQueueTracks = null;
	private boolean party = false;
	private String rankUp = null;
	private String rankDown = null;

	public String getRankUp() {
		return rankUp;
	}

	public void setRankUp(String rankUp) {
		this.rankUp = rankUp;
	}

	public String getRankDown() {
		return rankDown;
	}

	public void setRankDown(String rankDown) {
		this.rankDown = rankDown;
	}

	public boolean isQueue() {
		return queue;
	}

	public void setQueue(boolean queue) {
		this.queue = queue;
	}

	public boolean isHistory() {
		return history;
	}

	public void setHistory(boolean history) {
		this.history = history;
	}

	public boolean isToplist() {
		return toplist;
	}

	public void setToplist(boolean toplist) {
		this.toplist = toplist;
	}

	public String getPlayList() {
		return playList;
	}

	public void setPlayList(String playList) {
		this.playList = playList;
	}

	public String getPlayTrack() {
		return playTrack;
	}

	public void setPlayTrack(String playTrack) {
		this.playTrack = playTrack;
	}

	public List<String> getRemoveStandardQueueTracks() {
		return removeStandardQueueTracks;
	}

	public void setRemoveStandardQueueTracks(List<String> removeStandardQueueTracks) {
		this.removeStandardQueueTracks = removeStandardQueueTracks;
	}

	public List<String> getRemoveManualQueueTracks() {
		return removeManualQueueTracks;
	}

	public void setRemoveManualQueueTracks(List<String> removeManualQueueTracks) {
		this.removeManualQueueTracks = removeManualQueueTracks;
	}

	public List<String> getAddStandardQueueTracks() {
		return addStandardQueueTracks;
	}

	public void setAddStandardQueueTracks(List<String> addStandardQueueTracks) {
		this.addStandardQueueTracks = addStandardQueueTracks;
	}

	public List<String> getAddManualQueueTracks() {
		return addManualQueueTracks;
	}

	public void setAddManualQueueTracks(List<String> addManualQueueTracks) {
		this.addManualQueueTracks = addManualQueueTracks;
	}

	public List<String> getSetStandardQueueTracks() {
		return setStandardQueueTracks;
	}

	public void setSetStandardQueueTracks(List<String> setStandardQueueTracks) {
		this.setStandardQueueTracks = setStandardQueueTracks;
	}

	public List<String> getSetManualQueueTracks() {
		return setManualQueueTracks;
	}

	public void setSetManualQueueTracks(List<String> setManualQueueTracks) {
		this.setManualQueueTracks = setManualQueueTracks;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public int getVolume() {
		return volume;
	}

	public int getSeek() {
		return seek;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setSeek(int seek) {
		this.seek = seek;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isPaused() {
		return paused;
	}

	public boolean isRandom() {
		return random;
	}

	public boolean isRepeat() {
		return repeat;
	}

	public void setPaused(boolean pause) {
		this.paused = pause;
	}

	public void setRandom(boolean random) {
		this.random = random;
	}

	public void setRepeat(boolean repeat) {
		this.repeat = repeat;
	}

	public void setParty(boolean party) {
		this.party = party;
	}

	public boolean isParty() {
		return party;
	}
}
