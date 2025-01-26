package main.java.org.dii.oop.exercise03;

public class MusicAlbum {
    String albumName;
    String[] songs;

    public MusicAlbum(){
        //albumName = "Unknown";
        this("Unknown",null);
    }

    public MusicAlbum(String albumName){
        this.albumName = albumName;
    }

    public MusicAlbum(String albumName, String[] songs){
        this.songs = songs;
        this.albumName = albumName;
    }

    public void displayInfo(){
        System.out.println("Album: "+albumName);
        if (songs != null){
            for (int i = 0; i < songs.length; i++){
                System.out.println((i+1)+" "+songs[i]);
            }
            System.out.println();
        }
        else {
            System.out.println("No song in this album.");
            System.out.println();
        }
    }
}