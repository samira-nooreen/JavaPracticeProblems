import java.util.*;

class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " (" + duration + " mins)";
    }
}

class Album {
    private String name;
    private List<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

    public Song getSong(String title) {
        return findSong(title);
    }
}

public class Main {
    private static List<Album> albums = new ArrayList<>();
    private static LinkedList<Song> playlist = new LinkedList<>();

    public static void main(String[] args) {
        Album album1 = new Album("Album 1");
        album1.addSong("Song A", 4.5);
        album1.addSong("Song B", 3.8);
        albums.add(album1);

        Album album2 = new Album("Album 2");
        album2.addSong("Song C", 5.2);
        album2.addSong("Song D", 4.1);
        albums.add(album2);

        addToPlaylist("Song A", "Album 1");
        addToPlaylist("Song C", "Album 2");

        playPlaylist();
    }

    private static boolean addToPlaylist(String songTitle, String albumName) {
        for (Album album : albums) {
            if (albumName.equalsIgnoreCase(albumName)) {
                Song song = album.getSong(songTitle);
                if (song != null) {
                    playlist.add(song);
                    return true;
                }
            }
        }
        System.out.println("Song not found in album.");
        return false;
    }

    private static void playPlaylist() {
        ListIterator<Song> iterator = playlist.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Now playing: " + iterator.next());

        while (!quit) {
            System.out.println("Menu: 0 - Quit, 1 - Next, 2 - Previous, 3 - Replay, 4 - List Songs, 5 - Remove Current Song");
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    System.out.println("Exiting playlist...");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (iterator.hasNext()) iterator.next();
                        forward = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Now playing: " + iterator.next());
                    } else {
                        System.out.println("Reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (iterator.hasPrevious()) iterator.previous();
                        forward = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Now playing: " + iterator.previous());
                    } else {
                        System.out.println("At the start of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward && iterator.hasPrevious()) {
                        System.out.println("Replaying: " + iterator.previous());
                        forward = false;
                    } else if (!forward && iterator.hasNext()) {
                        System.out.println("Replaying: " + iterator.next());
                        forward = true;
                    }
                    break;
                case 4:
                    listSongs();
                    break;
                case 5:
                    if (!playlist.isEmpty()) {
                        iterator.remove();
                        System.out.println("Song removed.");
                        if (iterator.hasNext()) {
                            System.out.println("Now playing: " + iterator.next());
                        } else if (iterator.hasPrevious()) {
                            System.out.println("Now playing: " + iterator.previous());
                        } else {
                            System.out.println("Playlist is empty.");
                            quit = true;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void listSongs() {
        System.out.println("Songs in playlist:");
        for (Song song : playlist) {
            System.out.println(song);
        }
    }
}
