package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

import java.io.File;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            System.out.println("Empezando");
            AnchorPane root = FXMLLoader.load(getClass().getResource("/Ventana1.fxml"));
            Scene scene = new Scene(root,600,440);

        //    File file = new File("/image/005.png");
          //  File file1 = new File("/image/002.png");
       //     Image image = new Image("/image/005.png");
        //    ImageView imageView = new ImageView(image);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

