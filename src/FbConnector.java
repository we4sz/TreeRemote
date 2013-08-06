import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Page;


public class FbConnector {
	final private String ACCESS_TOKEN = "CAAHaPypTIb8BAPJZAPWcRloY3s8ommEVj5liVZBbwiSugZA5kqAPhajqCyk5YasTf9MsReUCpioDwppHctFXGh2L5SH6bonoFUp8eOzzKOWvB4JyAPHiZAM6ZBQo49jcDOAbXiPASzJNbszya7Rjuuvex2xWsubkFjQ1QkWQYQ9eoPi5SZA2ML";
	private final FacebookClient fbClient; 
	private Page page;
	
	public FbConnector(){
		fbClient = new DefaultFacebookClient(ACCESS_TOKEN);
		page = fbClient.fetchObject("herrtrad", Page.class);
		
	}
	
	public void publishPost(String message, String link){
		if(page.getCanPost())
			fbClient.publish("herrtrad/feed", Page.class, Parameter.with("message", message), Parameter.with("link", link));
	}
	
	
	
	
	String getAbout(){
		return page.getAbout();
	}
	
}
