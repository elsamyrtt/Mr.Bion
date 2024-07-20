package com.main.iguanan;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.IOException;
import java.net.URL;

public class PrimaryController {
    @FXML
    private MediaView mediaView;

    private MediaPlayer mediaPlayer;

    public void initialize() {
        if (mediaView != null) {
            try {
                URL videoUrl = getClass().getResource("/com/main/iguanan/0p.mp4");
                if (videoUrl == null) {
                    throw new RuntimeException("El archivo de video no se encontró en la ruta especificada.");
                }
                Media media = new Media(videoUrl.toString());
                mediaPlayer = new MediaPlayer(media);
                mediaPlayer.pause();
                mediaView.setMediaPlayer(mediaPlayer);
                mediaPlayer.setOnEndOfMedia(() -> {
                    try {
                        extracted();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                mediaPlayer.setOnError(() -> {
                    System.err.println("Error: " + mediaPlayer.getError());
                });
                mediaPlayer.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("mediaView is null. Check FXML injection.");
        }
    }

    private void extracted() throws IOException {
        mediaPlayer.pause();
        App.setRoot("secondary");
    }
}
