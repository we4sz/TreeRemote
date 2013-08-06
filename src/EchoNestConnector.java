import java.util.Iterator;
import java.util.List;

import com.echonest.api.v4.EchoNestAPI;
import com.echonest.api.v4.EchoNestException;
import com.echonest.api.v4.Params;
import com.echonest.api.v4.Song;


public class EchoNestConnector {
	
	private EchoNestAPI echoNest;
	private final String API_KEY = "F8X7CQVKEP0ZDVBQ2";
	private List<Song> songs;
	
	public EchoNestConnector(String mood, int results) throws EchoNestException{
		float ht = (float) 0.6;
		Params p = new Params();
        p.add("mood", mood);
        p.add("results", results);
        p.add("bucket", "id:spotify-WW");
        p.add("sort", "song_hotttnesss-desc");
		echoNest = new EchoNestAPI(API_KEY);
		songs = echoNest.searchSongs(p);
		
		Iterator<Song> it = songs.iterator();
		while (it.hasNext()){
			Song s = it.next();
			System.out.println(s.getSongHotttnesss() + " " + s.toString());
		}
		
	}
}
