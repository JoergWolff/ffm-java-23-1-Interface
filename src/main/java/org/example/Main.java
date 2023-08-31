package org.example;

public class Main {
    public static void main(String[] args) {

        MediaController mediaController = new MediaController();
        System.out.println("Music Player\n--------");
        MusicPlayer musicPlayer = new MusicPlayer("Invisible_Man.mp3");
        mediaController.playMedia(musicPlayer);
        System.out.println("Video Player\n--------");
        VideoPlayer videoPlayer = new VideoPlayer("Herr_der_Ringe.mp4");
        mediaController.playMedia(videoPlayer);

    }
}