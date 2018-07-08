package Inheritance.OnlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Playlist playlist = new Playlist();
int counter = 0;
        int n = Integer.parseInt(reader.readLine());
        for(int i = 0 ; i<n ; i++){
String[] currentSong = reader.readLine().split(";");
try{
if(currentSong.length != 3){
    throw new InvalidSongException("Invalid song.");
}

    Length length = new Length(currentSong[2]);
    Song song = new Song(currentSong[0],currentSong[1],length);
    playlist.addSong(song);
    System.out.println("Song added.");
    counter++;
}catch (InvalidSongException iae){
    System.out.println(iae.getMessage());
}
        }
        System.out.println(String.format("Songs added: %d",counter));
        System.out.println(playlist);
    }
}
