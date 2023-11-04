package org.example.playlist;

public class Playlist {
    static String[] playlist;
    static int songCount = 0;

    public static void main(String[] args) {
        playlist = new String[5];
    }

    public static void addSong(String songName) {
        // We can return even when we are in void function
        if (isValidInput(songName)) {
            System.out.println("Song name cannot be empty");
            return;
        }
        // handle the case when playlist is full
        if (songCount == playlist.length) {
            System.out.println("Playlist is full");
            return;
        }
        // add song to the playlist here...
    }

    public static void showSong(String songName) {
        // Write the code to print all song here...
    }

    public static int findSongIndex(String songName) {
        // Write the code to find the index of the song here...
        return -1;
    }

    public static void updateSong(String songName, String newSongName) {
        // Write the code to update the song here...
    }

    public static boolean isValidInput(String songName) {
        // Check for null or empty string
        return songName == null || songName.isBlank();
    }
}
