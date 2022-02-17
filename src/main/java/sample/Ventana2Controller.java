package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class Ventana2Controller {

    @FXML
    private Button Atacar;

    @FXML
    private Button AtaqueArriesgado;

    @FXML
    private Button AtaqueMuyArriesgado;

    @FXML
    private Button AtaqueNormal;

    @FXML
    private Button Cancelar;

    @FXML
    private Button Salir;

    @FXML
    private ImageView imageDelantera;

    @FXML
    private ImageView imageTrasera;

    @FXML
    private Label labelNivel1;

    @FXML
    private Label labelNivel2;

    @FXML
    private Label labelNombre1;

    @FXML
    private Label labelNombre2;

    @FXML
    private ProgressBar progressBar1;

    @FXML
    private ProgressBar progressBar2;

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
        cambiar();
    }

    @FXML
    void onMouseClickedSalir() {

    }
    @FXML
    void cambiar(){

    }

    public void enviarPokemon(Pokemon pokemon) {

        pokemon.setNombre(pokemon.nombre);
        pokemon.setVidamaxima(pokemon.vidamaxima);
        pokemon.setVidaTotal(pokemon.vidaTotal);
        pokemon.setNivel(pokemon.nivel);
        pokemon.setImagenDelantera(pokemon.imagenDelantera);
        pokemon.setImagenTrasera(pokemon.imagenTrasera);

    }
}
