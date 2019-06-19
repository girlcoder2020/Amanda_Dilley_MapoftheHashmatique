import java.util.HashMap;
import java.util.Set;

public class TrackList {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		
		trackList.put("Hesitation", "Do you know what you're doing");
		trackList.put("Disbelief","Am I really here");
		trackList.put("Honor", "What an awesome career");
		trackList.put("Stubborn", "I will complete this");
		
		String lyric = trackList.get("Disbelief");
		System.out.println(lyric);
		
		Set<String> keys = trackList.keySet();
		for (String key : keys) {
			System.out.println(key);
			System.out.println(trackList.get(key));
		}
	}

}
