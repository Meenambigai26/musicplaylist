package Music;

import java.util.HashMap;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

//maintaining variables in the below class
/**
 * @author meenambigai
 *
 */
public class References {

	int x = 0;
	int key = 0;
	int SizeOfPlaylist = 0;
	int length = 0;
	String playing = " ";
	String before = " ";
	String least = " ";
	HashMap<Integer, String> Playlist = new HashMap<Integer, String>();

	public void setmapvalue(Integer key, String song) {
		Playlist.put(key, song);
	}
	
	

}
