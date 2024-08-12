    package com.main.iguanan;

    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.IOException;
    import java.net.URL;

    import javafx.fxml.FXML;
    import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
    import javafx.scene.media.MediaPlayer;
    import javafx.scene.media.*;
    import javafx.scene.text.Font;
    import javafx.stage.Stage;

    public class AjustController{
        @FXML
        private ImageView image;

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

        public void salirajustesClick(){
            try {
                App.setRoot("secondary");
                
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            ajustes = false;
        }
        
        public void salirClick(){
            System.exit(0);
        }


    }
