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
        //
        System.out.println("Music Player over interface\n--------");
        Playable playable = new MusicPlayer();
        playable.play("We_are_the_Champins.mp3");
        System.out.println("Video Player over interface\n--------");
        Playable playable2 = new VideoPlayer();
        playable2.play("The_little_hobbit");
    }
}