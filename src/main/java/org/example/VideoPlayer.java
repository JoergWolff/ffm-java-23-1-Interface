package org.example;

import java.util.Objects;

public class VideoPlayer implements Playable {
    String filePath;
    @Override
    public void play(String filePath) {
        System.out.println("Ich spiele den Film des Files " + filePath);;
    }

    public VideoPlayer() {
    }

    public VideoPlayer(String filePath) {
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
        return "VideoPlayer{" +
                "filePath='" + filePath + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoPlayer that = (VideoPlayer) o;
        return Objects.equals(filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath);
    }
}
