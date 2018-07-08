package Inheritance.OnlineRadioDatabase;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
   public Playlist(){
       this.songs= new ArrayList<>();
   }
   public void addSong(Song song){
       this.songs.add(song);
   }
   private int getSum(){
      return this.songs.stream().mapToInt(Song::getTotalLength).sum();

   }
   private int getHours(){
       return this.getSum() / 3600;
   }
   private int getMinutes(){
       return (this.getSum() % 3600) / 60;
   }
   private int getSeconds(){
       return this.getSum() %60;
   }

    @Override
    public String toString() {
        return String.format("Playlist length: %dh %dm %ds",this.getHours(),this.getMinutes(),this.getSeconds());
    }
}
