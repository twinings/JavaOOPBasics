package Inheritance.OnlineRadioDatabase;

public class Song {
    private String artistName;
    private String songName;
private Length length;
public Song(String artistName,String songName,Length length){
    this.setArtistName(artistName);
    this.setSongName(songName);
    this.length=length;
}

    public void setArtistName(String artistName) {
    if(artistName.length()<3 || artistName.length()>20){
throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
    }
        this.artistName = artistName;
    }

    public void setSongName(String songName) {
    if(songName.length()<3 || songName.length()>30){
        throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
    }
        this.songName = songName;
    }
    public  int getTotalLength(){
        return this.length.getMinutes()*60+ this.length.getSeconds();
    }
}
