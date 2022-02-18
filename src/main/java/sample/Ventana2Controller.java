package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Ventana2Controller<aPR> {

    @FXML
    AnchorPane AnchorPaneAtacar;

    @FXML
    AnchorPane AnchorPaneSalir;

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
    static
    ImageView imageDelantera;

    @FXML
    ImageView imageTrasera;

    @FXML
    static
    Label labelNivel1;

    @FXML
    Label labelNivel2;

    @FXML
    static
    Label labelNombre1;

    @FXML
    Label labelNombre2;

    @FXML
    static
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
        Random rd = new Random();
        double min = 0;
        double max = 50;
        double randomValue = min + (max - min) * rd.nextDouble();
        quitarVida(randomValue,getPokemonRival(),getPokemon());
    }

    @FXML
    void onMouseClickedAtaqueMuyArriesgado() {
        Random rd = new Random();
        double min = 10;
        double max = 25;
        double randomValue = min + (max - min) * rd.nextDouble();
        quitarVida(randomValue ,elegirPokemon());
    }

    @FXML
    void onMouseClickedAtaqueNormal() {
        quitarVida(20.0,getPokemonRival(),getPokemon());
    }

    @FXML
    void onMouseClickedCancelar() {

    }

    @FXML
    void onMouseClickedSalir() {
        resetear();
    }

    void cambiar() {

        AnchorPaneAtacar.setVisible(false);
        AtaqueNormal.setVisible(true);
        AtaqueArriesgado.setVisible(true);
        AtaqueMuyArriesgado.setVisible(true);
        Salir.setVisible(true);
        AnchorPaneSalir.setVisible(true);
        Atacar.setVisible(false);
        Cancelar.setVisible(false);
    }

    void resetear() {

        AnchorPaneAtacar.setVisible(true);
        AtaqueNormal.setVisible(false);
        AtaqueArriesgado.setVisible(false);
        AtaqueMuyArriesgado.setVisible(false);
        Salir.setVisible(false);
        AnchorPaneSalir.setVisible(false);
        Atacar.setVisible(true);
        Cancelar.setVisible(true);
    }

    public static void enviarPokemon(Pokemon pokemon) {

        pokemon.setNombre(pokemon.nombre);
        pokemon.setVidamaxima(pokemon.vidaActual);
        pokemon.setVidaTotal(pokemon.vidaTotal);
        pokemon.setNivel(pokemon.nivel);
        pokemon.setImagenDelantera(pokemon.imagenDelantera);
        pokemon.setImagenTrasera(pokemon.imagenTrasera);

    }












     public class PokemonRival {
        String nombre;
        int vidaActual;
        int vidaTotal;
        String nivel;
        String imagen;
        double progressbar;

        public PokemonRival(String nombre, int vidaActual, int vidaTotal, String nivel, String imagen) {
            this.nombre = nombre;
            this.vidaActual = vidaActual;
            this.vidaTotal = vidaTotal;
            this.nivel = nivel;
            this.imagen = imagen;
            this.progressbar = (double) vidaActual / vidaTotal;

        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getVidaActual() {
            return vidaActual;
        }

        public void setVidaActual(int vidaActual) {
            this.vidaActual = vidaActual;
        }

        public int getVidaTotal() {
            return vidaTotal;
        }

        public void setVidaTotal(int vidaTotal) {
            this.vidaTotal = vidaTotal;
        }

        public String getNivel() {
            return nivel;
        }

        public void setNivel(String nivel) {
            this.nivel = nivel;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }

        public double getProgressbar() {
            return progressbar;
        }

        public void setProgressbar(double progressbar) {
            this.progressbar = progressbar;
        }
    }
}
