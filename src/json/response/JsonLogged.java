package json.response;

import java.io.Serializable;

public class JsonLogged implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6638243573298928040L;
	private boolean loggingIn;
	private boolean error = false;

	public void setLoggingIn(boolean loggingIn) {
		this.loggingIn = loggingIn;
	}

	public boolean isLoggingIn() {
		return loggingIn;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}
}
