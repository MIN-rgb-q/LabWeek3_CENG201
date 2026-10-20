/**
 * MusicPlayerDemo.java
 *
 * Tests the playlist

 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        //create the playlist object
        MusicPlaylist plyLst = new MusicPlaylist();


        // Add songs
        //(playn=== AFTER REMOVING Snap SONG ===");
        // remove the song called "Snap - Manifest" from the playlist 
        //Then display the Playlist
        plyLst.addSong("Shape of You - Ed Sheeran");
        plyLst.addSong("Save Me - BTS");
        plyLst.addSong("Snap - Manifest");
        plyLst.addSong("like JENNIE - JENNIE");

        System.out.println("\n=== PLAYLIST === ");
        plyLst.displayPlaylist();

        System.out.println("\n=== CURRENT SONG PLAYING ===");
        plyLst.displayCurrentSong();



        System.out.println("=== NEXT SONG TO PLAY ===");
        plyLst.nextSong();
        plyLst.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        plyLst.nextSong();
        plyLst.displayCurrentSong();

        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        plyLst.previousSong();
        plyLst.displayCurrentSong();

        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        System.out.println("Removed: Shape of You - Ed Sheeran");
        plyLst.removeSong("Shape of You - Ed Sheeran");
        plyLst.displayPlaylist();

        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        System.out.println("Removed: Snap - Manifest");
        plyLst.removeSong("Snap - Manifest");
        plyLst.displayPlaylist();

    }
}