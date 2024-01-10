import java.util.ArrayList;
import java.util.LinkedList;

public class PlayList {
    private String name;
    public LinkedList<Song> playList;

    public PlayList(String name) {
        this.name = name;
        this.playList = new LinkedList<>();
    }


    private Song findSong(String title){

        for (Song song : playList) {
            if (song.getTitle().equalsIgnoreCase(title)){
                return song;
            }
        }
        return null;
    }


    public boolean addToPlayList(int trackNumber, Album album) {

        int index = trackNumber - 1;
        Song checkedSong = album.getSongs().get(index);

        if ( findSong(checkedSong.getTitle()) == null){
        if ((index >= 0) && (index <= album.getSongs().size())){
            playList.add(checkedSong);
            return true;
        }
        }
        return false;
    }



//    public boolean addToPlayList(String title, Album album){
//
//        Song checkedSong = album.getSongs().ge;
//
//        Song s = findSong(title);
//        if (s == null){
//            playList.add(s);
//            return true;
//        }
//        return false;
//    }


}
