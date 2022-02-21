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
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Ventana1.fxml"));
            AnchorPane root = fxmlLoader.load();
            Scene scene = new Scene(root,600,440);

            primaryStage.setScene(scene);
            primaryStage.show();

            Pokemon p1 = new Pokemon("IvySaur", 200,200, "Nv 65", "/image/002.png","/image/ivysaurespaldas.gif");
            Pokemon p2 = new Pokemon("Charmeleon", 150,200, "Nv 45","/image/005.png","/image/charmeleonespaldas.gif");
            Pokemon p3 = new Pokemon("Blastoise", 200,200, "Nv 54", "/image/009.png","/image/blastoiseespaldas.gif");
            Pokemon p4 = new Pokemon("Sandshrew", 200,200 , "Nv 65", "/image/027.png","/image/sandshrewespaldas.gif");
            Pokemon p5 = new Pokemon("Vulpix", 200,200, "Nv 75","/image/037.png","/image/vulpixespaldas.gif");
            Pokemon p6 = new Pokemon("Growlithe", 200,200, "Nv 54", "/image/058.png","/image/growlitheespaldas.gif");

            Pokemon pR1 = new Pokemon("Arceus", 200, 200, "Nv 65", "/image/arceusrival.gif");
            Pokemon pR2 = new Pokemon("Blissey", 200, 200, "Nv 65", "/image/blisseyrival.gif");
            Pokemon pR3 = new Pokemon("Grumpig", 200, 200, "Nv 65", "/image/grumpigrival.gif");
            Pokemon pR4 = new Pokemon("Hitmontop", 200, 200, "Nv 65", "/image/hitmontoprival.gif");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

