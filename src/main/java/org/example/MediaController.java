package org.example;

public class MediaController {
    public void playMedia(Playable mediaPath){
        mediaPath.play(mediaPath.toString());
    }

}
