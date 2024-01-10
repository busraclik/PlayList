import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Röyksopp Essential", "Röyksopp");
        album.addSong("You dont have clue", 3.20);
        album.addSong("Something in my heart", 2.20);
        album.addSong("Thank You", 2.55);
        albums.add(album);

        Album album1 = new Album("Tame Impala Essential", "Tame Impala");
        album1.addSong("Border", 4.29);
        album1.addSong("Same Person Same Old Mistakes", 3.20);
        album1.addSong("Let It Happen", 2.56);
        album1.addSong("Going Backwards", 4.56);
        albums.add(album1);


        PlayList pl = new PlayList("my playlist");
        System.out.println("My PLaylist");
        pl.addToPlayList(1, albums.get(0));
        pl.addToPlayList(2, albums.get(0));
        pl.addToPlayList(3, albums.get(0));
        pl.addToPlayList(2, albums.get(0));
        pl.addToPlayList(1, albums.get(0));

        pl.addToPlayList(1, albums.get(1));
        pl.addToPlayList(2, albums.get(1));
        pl.addToPlayList(1, albums.get(1));
//        pl.addToPlayList("Going Backwards", albums.get(1));


        System.out.println(pl.playList);








//        ArrayList<Album> albums = new ArrayList<>();
//
//        Album album = new Album("Stormbringer", "Deep Purple");
//        album.addSong("Stormbringer", 4.6);
//        album.addSong("Love don't mean a thing", 4.22);
//        album.addSong("Holy man", 4.3);
//        album.addSong("Hold on", 5.6);
//        album.addSong("Lady double dealer", 3.21);
//        album.addSong("You can't do it right", 6.23);
//        album.addSong("High ball shooter", 4.27);
//        album.addSong("The gypsy", 4.2);
//        album.addSong("Soldier of fortune", 3.13);
//        albums.add(album);
//
//        album = new Album("For those about to rock", "AC/DC");
//        album.addSong("For those about to rock", 5.44);
//        album.addSong("I put the finger on you", 3.25);
//        album.addSong("Lets go", 3.45);
//        album.addSong("Inject the venom", 3.33);
//        album.addSong("Snowballed", 4.51);
//        album.addSong("Evil walks", 3.45);
//        album.addSong("C.O.D.", 5.25);
//        album.addSong("Breaking the rules", 5.32);
//        album.addSong("Night of the long knives", 5.12);
//        albums.add(album);
//
//        LinkedList<Song> playList = new LinkedList<Song>();
//        albums.get(0).addToPlayList("You can't do it right", playList);
//        albums.get(0).addToPlayList("Holy man", playList);
//        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
//        albums.get(0).addToPlayList(9, playList);
//        albums.get(1).addToPlayList(3, playList);
//        albums.get(1).addToPlayList(2, playList);
//        albums.get(1).addToPlayList(24, playList);  // There is no track 24




    }
}