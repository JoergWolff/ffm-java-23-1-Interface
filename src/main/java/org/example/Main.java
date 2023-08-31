package org.example;

public class Main {
    public static void main(String[] args) {

        MediaController mediaController = new MediaController();

        MusicPlayer musicPlayer = new MusicPlayer("Invisible_Man.mp3");
        mediaController.playMedia(musicPlayer);
        VideoPlayer videoPlayer = new VideoPlayer("Herr_der_Ringe.mp4");
        mediaController.playMedia(videoPlayer);
    }
}