package Playlist;

public class Playlist {
    private String name;
    private int currentTrack;
    //private List<Track> trackList; //UML says Playlist contains many Track which do not die when Playlist stops

    public void add(Track track) {

    }

    public void add(Playlist other) {

    }

    public boolean remove(Track track) {
        return false;
    }

    public Track getCurrentTrack() {
        return null;
    }

    public boolean contains(String title) {
        return false;
    }

    public void next() {

    }

    public void previous() {

    }

}
