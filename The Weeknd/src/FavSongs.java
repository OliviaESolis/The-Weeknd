public class FavSongs{
	String favSongOne ="Die For You";
	String favSongTwo ="Out of Time";
	public FavSongs() {}
	public void setFavSongOne(String newFavSongs) {
		favSongOne = newFavSongs;
	}
	public void getFavSong(int num) {
		if(num == 1) {
			System.out.println("My favorite The Weeknd song is "+favSongOne+".");
		}else {
			System.out.println("My second favorite The Weeknd song is "+favSongTwo+".");
		}
	}
}