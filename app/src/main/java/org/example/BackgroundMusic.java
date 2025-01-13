package org.example;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.List;

public class BackgroundMusic implements Runnable {
    private static final List<String> mp3List = List.of(
            "/game-music-teste-204327.mp3",
            "/a-109881.mp3",
            "/andando-em-circulos-195703.mp3",
            "/game-music-150676.mp3",
            "/game-music-loop-2-144037.mp3",
            "/game-music-loop-10-145572.mp3",
            "/game-music-loop-15-153386.mp3",
            "/game-music-loop-16-153389.mp3",
            "/game-music-loop-18-153392.mp3",
            "/game-music-loop-19-153393.mp3",
            "/game-time-172907.mp3"
    );

    @Override
    public void run() {
        int randomInt =(int) (Math.random() * mp3List.size()-1);
        while (randomInt > mp3List.size()) {
            randomInt =(int) (Math.random() * mp3List.size()-1);
        }
        System.out.println(randomInt);
        final String URL = mp3List.get(randomInt);
        Media media = new Media(getClass().getResource(URL).toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
    }
}
