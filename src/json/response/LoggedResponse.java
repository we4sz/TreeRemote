package json.response;

import java.io.Serializable;

public class LoggedResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8539863315895499957L;
	private JsonLogged jsonLogged;

	public LoggedResponse() {

	}

	public LoggedResponse(JsonLogged l) {
		this.jsonLogged = l;
	}

	public JsonLogged getJsonLogged() {
		return jsonLogged;
	}

	public void setJsonLogged(JsonLogged jsonLogged) {
		this.jsonLogged = jsonLogged;
	}

}
