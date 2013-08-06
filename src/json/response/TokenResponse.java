package json.response;

import java.io.Serializable;

public class TokenResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3581409462749683814L;
	private JsonToken jsonToken;

	public TokenResponse() {

	}

	public TokenResponse(JsonToken jsonToken) {
		this.jsonToken = jsonToken;
	}

	public JsonToken getJsonToken() {
		return jsonToken;
	}

	public void setJsonToken(JsonToken jsonToken) {
		this.jsonToken = jsonToken;
	}

}
