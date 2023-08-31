package org.example;

import java.util.Objects;

public class MusicPlayer implements Playable {
    String filePath;

    @Override
    public void play(String filePath) {
        System.out.println("Ich spiele die Musik des Files " + filePath);
        ;
    }

    public MusicPlayer() {
    }

    public MusicPlayer(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "filePath='" + filePath + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicPlayer that = (MusicPlayer) o;
        return Objects.equals(filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath);
    }
}
