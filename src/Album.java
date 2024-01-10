import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){

        if (findSong(title) == null){
            songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public Song findSong(String title){

        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)){
                return song;
            }
        }
        return null;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }


    //tekrar bakılacak
//    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
//        Song s = playlist.get(trackNumber-1);
//        if ((findSong(s.getTitle()) != null)){
//            playlist.add(s);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
//
//        int index = trackNumber - 1;
//        if ((index >= 0) && (index <= songs.size())) {
//            playList.add(songs.get(index));
//            return true;
//        }
//        return false;
//    }


//    public boolean addToPlayList(String title, LinkedList<Song> playlist){
//        Song s = findSong(title);
//        if (s != null){
//            playlist.add(s);
//            return true;
//        }
//        return false;
//    }

}
