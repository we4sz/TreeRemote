package json.request;

import java.io.Serializable;

public class JsonLogin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8499697424747395314L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
