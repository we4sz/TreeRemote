package json.response;

import java.io.Serializable;

public class PlaylistResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3581409462749683814L;
	private JsonPlayLists jsonPlayLists;

	public PlaylistResponse() {

	}

	public PlaylistResponse(JsonPlayLists jsonPlayLists) {
		this.jsonPlayLists = jsonPlayLists;
	}

	public JsonPlayLists getJsonPlayLists() {
		return jsonPlayLists;
	}

	public void setJsonPlayLists(JsonPlayLists jsonPlayLists) {
		this.jsonPlayLists = jsonPlayLists;
	}

}
