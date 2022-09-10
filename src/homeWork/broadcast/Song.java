package homeWork.broadcast;

public class Song implements Broadcast {

    private String songTitle;
    private String artistName;
    private int timeInSeconds;
    public Song(String songTitle, String artistName, int timeInSeconds) {
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.timeInSeconds = timeInSeconds;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public int getDuration() {

        return (int) Math.ceil(timeInSeconds/60.);
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public double getIncome() {
        return 0;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
