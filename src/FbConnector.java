import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.Page;


public class FbConnector {
	final private String ACCESS_TOKEN = "CAAHaPypTIb8BAMGlngZBDLMqxJ5cl8192gT77MOLJDBKd6JsbpKgNVAvg5tt8GN1e54vhlmZB16gE5u76rtUgVhZBeg2ZBHSvZCGFByKhvch4GAZA630p15EP3kvjaSwX5MEOyy7n9ENL1utZCsJyTROLUwZCQKXOGZCXHHepCSIbILBL8uo5L6bw";
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
