import json.models.ArtistAlbumTrack;
import json.models.TrackPlaylist;
import json.response.CurrentResponse;
import json.response.JsonCurrent;
import json.response.LoggedResponse;
import json.response.PlaylistResponse;
import json.response.RankResponse;
import json.response.SearchResponse;
import json.response.TokenResponse;
import json.response.TracksResponse;

import com.esotericsoftware.kryonet.Connection;
import com.google.gson.Gson;

public class TreeRemoteImpl implements ITreeRemote {

	private boolean loggedin = false;
	private PlaylistResponse playlists;
	private long trackStarted;
	private JsonCurrent current;

	public TreeRemoteImpl() {
		// TODO Auto-generated constructor stub
	}

	public boolean isLoggedin() {
		return loggedin;
	}

	public void setLoggedin(boolean loggedin) {
		this.loggedin = loggedin;
	}

	public long getTrackStarted() {
		return trackStarted;
	}

	public void setTrackStarted(long trackStarted) {
		this.trackStarted = trackStarted;
	}

	@Override
	public void connectedToTree() {
		// TODO Auto-generated method stub
		System.out.println("contree");
	}

	@Override
	public void disconnectedFromTree() {
		// TODO Auto-generated method stub
		System.out.println("distree");
	}

	@Override
	public void dataFromTree(String s) {
		// TODO Auto-generated method stub
		System.out.println("datatree");
	}

	@Override
	public void disconnectedFromBohnify() {
		// TODO Auto-generated method stub
		System.out.println("disbohn");
	}

	@Override
	public void dataFromBohnify(String s) {
		// TODO Auto-generated method stub
		System.out.println("databohn");
		try {
			if (s.contains("jsonLogged")) {
				LoggedResponse r = (LoggedResponse) new Gson().fromJson(s,
						LoggedResponse.class);
				loggedin = false;
			} else if (s.contains("jsonPlayLists")) {
				PlaylistResponse r = (PlaylistResponse) new Gson().fromJson(s,
						PlaylistResponse.class);
				this.playlists = r;
			} else if (s.contains("jsonSearch")) {
				SearchResponse r = (SearchResponse) new Gson().fromJson(s,
						SearchResponse.class);
			} else if (s.contains("jsonToplist")) {
				TracksResponse r = (TracksResponse) new Gson().fromJson(s,
						TracksResponse.class);
			} else if (s.contains("jsonHistory")) {
				TracksResponse r = (TracksResponse) new Gson().fromJson(s,
						TracksResponse.class);
			} else if (s.contains("jsonQueue")) {
				TracksResponse r = (TracksResponse) new Gson().fromJson(s,
						TracksResponse.class);
			} else if (s.contains("jsonCurrent")) {
				CurrentResponse r = (CurrentResponse) new Gson().fromJson(s,
						CurrentResponse.class);
				if (r.getJsonCurrent() != null) {
					trackStarted = System.currentTimeMillis()
							- r.getJsonCurrent().getPosition();
				}
				boolean f = isParty();
				current = r.getJsonCurrent();
				loggedin = true;
			} else if (s.contains("jsonRank")) {
				RankResponse r = (RankResponse) new Gson().fromJson(s,
						RankResponse.class);
				if (r.getJsonRank() != null) {
					for (ArtistAlbumTrack track : r.getJsonRank().getTracks()) {
						for (TrackPlaylist p : playlists.getJsonPlayLists()
								.getPlayLists()) {
							for (ArtistAlbumTrack track1 : p.getTracks()) {
								if (track.equals(track1)) {
									track1.setRank(track.getRank());
								}
							}
						}
					}

				}
			} else if (s.contains("jsonToken")) {
				TokenResponse r = (TokenResponse) new Gson().fromJson(s,
						TokenResponse.class);
				if (r.getJsonToken() != null) {
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	private boolean isParty() {
		return current.isParty();
	}

	@Override
	public void connectedToBohnify(Connection c) {
		// TODO Auto-generated method stub
		System.out.println("conbohn");
	}

}
