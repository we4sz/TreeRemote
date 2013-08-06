package json.response;

import java.io.Serializable;

public class RankResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8403264644847357772L;
	private JsonRank jsonRank;

	public RankResponse() {
	}

	public RankResponse(JsonRank jsonRank) {
		this.jsonRank = jsonRank;
	}

	public JsonRank getJsonRank() {
		return jsonRank;
	}

	public void setJsonRank(JsonRank jsonRank) {
		this.jsonRank = jsonRank;
	}

}
