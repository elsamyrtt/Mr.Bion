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
        // Verificar que mediaView no sea nulo antes de utilizarlo
        if (mediaView != null) {
            // Cargar el archivo de video desde el recurso
            URL videoUrl = getClass().getResource("/com/main/iguanan/0p.mp4");
            Media media = new Media(videoUrl.toString());
            mediaPlayer = new MediaPlayer(media);

            // Establecer el MediaPlayer en el MediaView
            mediaView.setMediaPlayer(mediaPlayer);

            // Event listener para cuando el video finaliza
            mediaPlayer.setOnEndOfMedia(() -> {
                try {
                    URL videomenucarga = getClass().getResource("/com/main/iguanan/1p.mp4");
                    extracted();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            });

            // Reproducir el video
            mediaPlayer.play();
        } else {
            System.err.println("mediaView is null. Check FXML injection.");
        }
    }

    private void extracted() throws IOException {
        mediaPlayer.pause();
        App.setRoot("secondary");
    }
}
