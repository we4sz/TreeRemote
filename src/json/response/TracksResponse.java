package json.response;

import java.io.Serializable;

public class TracksResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1468271434845414983L;
	private JsonTracks jsonQueue;
	private JsonTracks jsonHistory;
	private JsonTracks jsonToplist;
	private boolean isQueueUpdated = false;
	private boolean isHistoryUpdated = false;

	public TracksResponse() {
	}

	public void setQueueUpdated(boolean isQueueUpdated) {
		this.isQueueUpdated = isQueueUpdated;
	}

	public boolean isQueueUpdated() {
		return isQueueUpdated;
	}

	public boolean isHistoryUpdated() {
		return isHistoryUpdated;
	}

	public void setHistoryUpdated(boolean isHistoryUpdated) {
		this.isHistoryUpdated = isHistoryUpdated;
	}

	public void setJsonHistory(JsonTracks jsonHistory) {
		this.jsonHistory = jsonHistory;
	}

	public void setJsonQueue(JsonTracks jsonQueue) {
		this.jsonQueue = jsonQueue;
	}

	public void setJsonToplist(JsonTracks jsonToplist) {
		this.jsonToplist = jsonToplist;
	}

	public JsonTracks getJsonHistory() {
		return jsonHistory;
	}

	public JsonTracks getJsonQueue() {
		return jsonQueue;
	}

	public JsonTracks getJsonToplist() {
		return jsonToplist;
	}
}
