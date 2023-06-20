package Music;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author meenambigai
 *
 */
public class Playlist_Creation {

	HashMap<Integer, String> Playlist = new HashMap<Integer, String>();

	public static void main(String[] args) {

		References ref = new References();

		// Playlistap for initial Playlist Creation
		ref.setmapvalue(1, "s1");
		ref.setmapvalue(2, "s2");
		ref.setmapvalue(3, "s3");

		System.out.println("-------My Playlist-------");
		System.out.println(ref.Playlist.values());

		ref.SizeOfPlaylist = ref.Playlist.size();

		// given when 6 chances to change the songs
		for (int i = 6; i >= 0; i++) {
			System.out.println("please enter music of your choice");

			// user enter the new song
			Scanner sc = new Scanner(System.in);
			String newsong = sc.nextLine();

			// if a song which is already available in playlist, will be added on top and
			// least played will be removed
			if (ref.Playlist.containsValue(newsong)) {
				Iterator<Entry<Integer, String>> iterator = ref.Playlist.entrySet().iterator();
				while (iterator.hasNext()) 
				{
					if (iterator.next().getValue().equals(newsong))
						iterator.remove();
				}
				Set<Integer> keyset = ref.Playlist.keySet();
				Iterator<Integer> iterator1 = keyset.iterator();
				while (iterator1.hasNext()) {
					ref.x = iterator1.next();
				}
				ref.Playlist.put(ref.x + 1, newsong);
				System.out.println(ref.Playlist.values());
			}

			// when a new song is played which is out of playlist will be added in playlist
			// and arranged in order as per played
			else {
				Set<Integer> keyset = ref.Playlist.keySet();
				Iterator<Integer> iterator1 = keyset.iterator();
				while (iterator1.hasNext()) {
					ref.x = iterator1.next();
				}
				ref.Playlist.put(ref.x + 1, newsong);

				String[] values = ref.Playlist.values().toArray(new String[0]);
				ref.length = values.length;
				ref.playing = values[ref.length - 1];
				ref.before = values[ref.length - 2];
				ref.least = values[ref.length - 3];
				System.out.println(ref.least + " , " + ref.before + " , " + ref.playing);
			}
		}
	}
}
