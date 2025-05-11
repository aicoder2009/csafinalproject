public class Song extends Music {
    public Song(String title){ // Song Constructor
        super(title); // super keyword to music.java constructor
    }
    public String getDetails(){ // I am overriding the method in Music.java for adding a song
        return "Song: " + title;
    }
}
