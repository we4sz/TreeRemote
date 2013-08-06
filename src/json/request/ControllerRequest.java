package json.request;

import java.io.Serializable;

public class ControllerRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3969427693946739389L;
	private JsonController jsonController;

	public JsonController getJsonController() {
		return jsonController;
	}

	public void setJsonController(JsonController jsonController) {
		this.jsonController = jsonController;
	}

}
