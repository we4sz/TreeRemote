package json.response;

import java.io.Serializable;


public class CurrentResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8457036692259518753L;
	private JsonCurrent jsonCurrent;

	public CurrentResponse() {
	}

	public CurrentResponse(JsonCurrent jsonCurrent) {
		this.jsonCurrent = jsonCurrent;
	}

	public JsonCurrent getJsonCurrent() {
		return jsonCurrent;
	}

	public void setJsonCurrent(JsonCurrent jsonCurrent) {
		this.jsonCurrent = jsonCurrent;
	}

}
