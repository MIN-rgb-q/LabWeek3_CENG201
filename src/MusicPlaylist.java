/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        ______________________________
 * Your Student ID:  ______________________________
 * Your Date:        ______________________________
 */

public class MusicPlaylist {

    //create private instants of the doubly linked list: 
    // -  head, tail and current
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    // constructor: The head,tail and current should be initialized to null in the beginning
    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {

        // TODO
        // 1. Create a new SongNode
        // 2. If the playlist is empty, make the new node
        //    head, tail and current
        // 3. Otherwise, add the new node after tail
        // 4. Update both next and prev pointer
        // 5. Update tail

        SongNode Node = new SongNode(title);
        if (head == null) {
            head = Node;
            tail = Node;
            current = Node;
            return;
        }

        tail.next = Node;
        Node.prev = tail;
        tail = Node;

    }


    // Remove a song from the playlist
    public void removeSong(String title) {

        // TODO
        // 1. Search for the song
        // 2. If the song does not exist, display a message as: "The song isn't in the playlist"
        // 3. Update the previous node's next pointer
        // 4. Update the next node's prev pointer
        // 5. Handle removing head
        // 6. Handle removing tail
        // 7. Handle removing the current song

        SongNode currNode = head;

        while (currNode != null && !currNode.title.equals(title)) {
            currNode = currNode.next;

        }

        if (currNode == null){
            System.out.println("The song isn't in the playlist");
            return;
        }

        if (currNode == head && currNode == tail) {
            head = null;
            tail = null;
            current = null;
            return;
        }

        if (currNode == head) {
            head = currNode.next;
            head.prev = null;
            return;
        }

        if (currNode == tail) {
            tail = currNode.prev;
            tail.next = null;
            return;
        }

        if (currNode == current) {
            current = currNode.prev;
        }

        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
    }


    // Move to the next song
    public void nextSong() {

        // TODO
        // If current is not null and current.next exists,
        // move current to current.next.
        //
        // Otherwise, display:
        // "Already at the last song of the playlist."

        if(current == null || current.next == null) {
            System.out.println("Already at the last song of the playlist.");
            return;
        }

        current = current.next;
    }


    // Move to the previous song
    public void previousSong() {

        // TODO
        // If current is not null and current.prev exists,
        // move current to current.prev.
        //
        // Otherwise, display:
        // "Already at the first song of the playlist."

        if(current == null || current.prev == null) {
            System.out.println("Already at the first song of the playlist.");
            return;
        }

        current = current.prev;
    }


    // Display the current song
    public void displayCurrentSong() {

        // TODO
        // Display the title of the current song.
        System.out.print(current.title + "\n");
    }


    // Display all songs
    public void displayPlaylist() {

        // TODO
        // Start from head and follow next pointer.
        SongNode currNode = head;

        while (currNode != null) {

            System.out.printf("%s <-> ",currNode.title);

            if (currNode.next == null) {
                System.out.println("End");
                return;
            }

            currNode = currNode.next;
        }
    }
}