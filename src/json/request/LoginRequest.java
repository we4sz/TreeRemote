package json.request;

import java.io.Serializable;

public class LoginRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9059006270889527856L;
	private JsonLogin jsonLogin;

	public JsonLogin getJsonLogin() {
		return jsonLogin;
	}

	public void setJsonLogin(JsonLogin jsonLogin) {
		this.jsonLogin = jsonLogin;
	}

}
