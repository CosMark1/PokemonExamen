package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class Ventana2Controller {

    @FXML
    AnchorPane AnchorPane;

    @FXML
    Button Atacar;

    @FXML
    Button AtaqueArriesgado;

    @FXML
    Button AtaqueMuyArriesgado;

    @FXML
    Button AtaqueNormal;

    @FXML
    Button Cancelar;

    @FXML
    Button Salir;

    @FXML
    ImageView imageDelantera;

    @FXML
    ImageView imageTrasera;

    @FXML
    Label labelNivel1;

    @FXML
    Label labelNivel2;

    @FXML
    Label labelNombre1;

    @FXML
    Label labelNombre2;

    @FXML
    ProgressBar progressBar1;

    @FXML
    ProgressBar progressBar2;

    @FXML
    public void initialize() {


    }
    @FXML
    void OnMouseEnteredPokemon() {

    }

    @FXML
    void OnMouseEnteredRival() {

    }

    @FXML
    void OnMouseExitedPokemon() {

    }

    @FXML
    void OnMouseExitedRival() {

    }

    @FXML
    void onMouseClickedAtacar() {
        cambiar();
    }

    @FXML
    void onMouseClickedAtaqueArriesgado() {

    }

    @FXML
    void onMouseClickedAtaqueMuyArriesgado() {

    }

    @FXML
    void onMouseClickedAtaqueNormal() {

    }

    @FXML
    void onMouseClickedCancelar() {

    }

    @FXML
    void onMouseClickedSalir() {

    }
    @FXML
    void cambiar(){
        AnchorPane.setVisible(true);
    }

    public void enviarPokemon(Pokemon pokemon) {

        pokemon.setNombre(pokemon.nombre);
        pokemon.setVidamaxima(pokemon.vidaActual);
        pokemon.setVidaTotal(pokemon.vidaTotal);
        pokemon.setNivel(pokemon.nivel);
        pokemon.setImagenDelantera(pokemon.imagenDelantera);
        pokemon.setImagenTrasera(pokemon.imagenTrasera);

    }
}
