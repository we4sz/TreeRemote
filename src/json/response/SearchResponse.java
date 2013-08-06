package json.response;

import java.io.Serializable;

public class SearchResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8403264644847357772L;
	private JsonSearch jsonSearch;

	public SearchResponse() {
	}

	public SearchResponse(JsonSearch jsonSearch) {
		this.jsonSearch = jsonSearch;
	}

	public JsonSearch getJsonSearch() {
		return jsonSearch;
	}

	public void setJsonSearch(JsonSearch jsonSearch) {
		this.jsonSearch = jsonSearch;
	}

}
