public class Music {
    protected String title;
    public Music(String title){
        this.title = title;
    }
    public String getDetails(){
        return "Music: " + title;
    }
}
