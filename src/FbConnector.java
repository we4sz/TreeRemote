import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Page;


public class FbConnector {
	final private String ACCESS_TOKEN = "CAAHaPypTIb8BAGBZBwqEbGmT8uPHPWoquBwTFz2ZBiTjTW8B2aSCGO9ZCK816kydPxgQuVgPeKHkrsSrC6L6niUQXNiukZBVsNxcmSC7PATcIjhRRs7P11wHAlD2RqcXtOSrCY8gKJIBIDlPmYfAEUeFKnIkaXGVbWujLn6QwR01Hum17wCL";
	private FacebookClient fbClient; 
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
