public abstract class SpotifyList {
    private String listName;
    private String creator;
    private String listType;

    public SpotifyList(String listName, String creator, String listType) {
        this.listName = listName;
        this.creator = creator;
        this.listType = listType;
        
    }

    public abstract int getNumSongs();

}