package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;


public class Ventana2Controller {

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

    private Pokemon pokemones;
    private Ventana1Controller controller;

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

        quitarVida(randomValue,controller.pokemonSeleccionado,pokemones);
        enviarPokemon(pokemones);
        controllerPokemon(controller);
        this.controller.actualizarVidas();
    }

    @FXML
    void onMouseClickedAtaqueMuyArriesgado() {
        Random rd = new Random();
        double min = 10;
        double max = 25;
        double randomValue = min + (max - min) * rd.nextDouble();

        quitarVida(randomValue,pokemones,pokemones);
        enviarPokemon(pokemones);
        controllerPokemon(controller);
        this.controller.actualizarVidas();
    }

    @FXML
    void onMouseClickedAtaqueNormal() {
        pokemones.setVidaActual(pokemones.getVidaActual()-20);
        quitarVida(20.0,controller.pokemonSeleccionado,pokemones);
        enviarPokemon(pokemones);
        controllerPokemon(controller);
        this.controller.actualizarVidas();
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

    void elegirPokemon(ArrayList listaPokemonRivales){
        Random rd = new Random();
        int p = rd.nextInt(3);
        do{
            Pokemon removedObj = (Pokemon) listaPokemonRivales.remove(p);
            labelNombre1.setText(removedObj.nombre);
            labelNivel1.setText(removedObj.nivel);
            progressBar1.setProgress(removedObj.progressbar);
            imageDelantera.setImage(new Image(removedObj.imagenDelantera));

        }while(listaPokemonRivales.isEmpty());

    }
    private void showAlert(Alert alert) {
        Optional<ButtonType> resultado = alert.showAndWait();
        if(!resultado.isPresent()) {
            System.out.println("Dialogo cerrado con la X");
        } else if(resultado.get() == ButtonType.OK) {
            System.out.println("Resultado = OK");
        } else if (resultado.get() == ButtonType.CANCEL) {
            System.out.println("Resultado = CANCEL");
        } else {
            System.out.println("Resultado = OTROS: " + resultado.get().getText());
        }
    }

    void quitarVida(Double cantidad, Pokemon pokemonAliado, Pokemon pokemonRival) {

        if (pokemonRival.progressbar >= 0) {
            progressBar1.setProgress((pokemonRival.vidaActual - cantidad) / pokemonRival.vidaTotal);
        }else{
                progressBar1.setProgress(0);
            }
            if (pokemonAliado.progressbar >= 0) {
                progressBar2.setProgress((pokemonAliado.vidaActual - cantidad) / pokemonAliado.vidaTotal);
            } else {
                progressBar2.setProgress(0);
            }
            if (pokemones.progressbar < 0) {
                pokemones.progressbar = 0;
            }

        }

    public void enviarPokemon(Pokemon pokemon) {

        if (pokemon.getProgressbar() <= 0){
            Alert(pokemon);
        }
        pokemones=pokemon;
        float vidaActual = pokemon.getVidaActual();
        float vidaTotal = pokemon.getVidaTotal();
        pokemon.setNombre(pokemon.getNombre());
        pokemon.setVidamaxima(pokemon.getVidaActual());
        pokemon.setVidaTotal(pokemon.getVidaTotal());
        pokemon.setNivel(pokemon.getNivel());
        pokemon.setImagenDelantera(pokemon.getImagenDelantera());
        pokemon.setImagenTrasera(pokemon.imagenTrasera);
        labelNombre2.setText(pokemon.getNombre());
        labelNivel2.setText(pokemon.getNivel());
        progressBar2.setProgress(vidaActual/vidaTotal);
        imageTrasera.setImage(new Image(pokemon.getImagenTrasera()));

    }
    public void Alert(Pokemon pokemon)  {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Seguir o no");
        alert.setContentText("El pokemon "+pokemon.getNombre()+" ha muerto");
        alert.setGraphic(new ImageView(pokemon.getImagenDelantera()));
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK) {
            continuarAhora();
        } else {
            salir();
        }
    }
    public void continuarAhora(){

    }
    public void salir(){
        System.exit(0);
    }
    public void controllerPokemon(Ventana1Controller ventana1Controller){
        this.controller= ventana1Controller;
    }
}
