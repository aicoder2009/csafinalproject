public class Podcast extends Music {
    public Podcast(String title){ // Podcast Constructor
        super(title); // super keyword to music.java constructor
    }


    public String getDetails(){ // I am overriding the method in Music.java for adding a podcast
        return "Podcast: " + title;
    }
}
