import static org.junit.Assert.*;

public class AlbumTest {

    Album album;
    @org.junit.Before
    public void setUp() throws Exception {
        album = new Album("test", "test");
        album.addSong("test1", 2.11);
        album.addSong("test2", 2.00);
    }

    @org.junit.Test
    public void addSong() {
        album.addSong("test3", 3.00);
        assertEquals(3, album.getSongs().size());
    }
    @org.junit.Test
    public void addSameSong() {
        album.addSong("test2", 2.00);
        assertEquals(2, album.getSongs().size());
    }

    @org.junit.Test
    public void findSong() {
        assertEquals("test1", album.findSong("test1").getTitle());
        assertEquals(2.11, album.findSong("test1").getDuration(),0);
        assertEquals(null, album.findSong("test7"));
    }

}