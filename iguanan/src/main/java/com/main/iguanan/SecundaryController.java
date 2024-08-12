package com.main.iguanan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SecundaryController {
        @FXML
    private MediaView mediaView;

    private MediaPlayer mediaPlayer;


    public boolean ajustes = false;
    public void ajustesClick(){
        try {
            App.setRoot("ajustes");
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ajustes = true;
    }



    public void jugarClick(){
        App.run();
    }
    
    public void salirClick(){
        System.exit(0);
    }

    public void initialize() {
         // Verificar que mediaView no sea nulo antes de utilizarlo
         if (mediaView != null) {
            // Cargar el archivo de video desde el recurso
            URL videoUrl = getClass().getResource("/com/main/iguanan/1p.mp4");
            Media media = new Media(videoUrl.toString());
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.pause();
            // Establecer el MediaPlayer en el MediaView
            mediaView.setMediaPlayer(mediaPlayer);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);  
            mediaPlayer.play();     // Reproducir el video
            
        } else {
            System.err.println("mediaView is null. Check FXML injection.");
        }
        
    

    }

}
