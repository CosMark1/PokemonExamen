package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    Button Curar;

    @FXML
    Button Continuar;

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
    private Ventana2Controller controller2;

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

        Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).setVidaActual((int) (Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getVidaActual()-randomValue));
        if(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getVidaActual()<=0 ){
            Alert(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x));
            control();
        }else {
            pokemones.setVidaActual((int) (pokemones.getVidaActual() - randomValue));
        }
        enviarPokemon(pokemones);
        this.controller.actualizarVidas();
    }

    @FXML
    void onMouseClickedAtaqueMuyArriesgado() {
        Random rd = new Random();
        double min = 10;
        double max = 25;
        double randomValue = min + (max - min) * rd.nextDouble();

        Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).setVidaActual((int) (Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getVidaActual()-randomValue));
        if(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getVidaActual()<=0){
            Alert(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x));
            control();
        }
        pokemones.setVidaActual(pokemones.getVidaActual()-20);
        enviarPokemon(pokemones);
        this.controller.actualizarVidas();
    }

    @FXML
    void onMouseClickedAtaqueNormal() {
        Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).setVidaActual(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getVidaActual()-20);
        if(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getVidaActual()<=0){
            Alert(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x));
            control();
        }
        pokemones.setVidaActual(pokemones.getVidaActual()-20);

        enviarPokemon(pokemones);
        this.controller.actualizarVidas();
    }

    @FXML
    void onMouseClickedCurar() {

    }

    @FXML
    void onMouseClickedCancelar() {
        resetear();
    }

    void cambiar() {

        AnchorPaneAtacar.setVisible(false);
        AtaqueNormal.setVisible(true);
        AtaqueArriesgado.setVisible(true);
        AtaqueMuyArriesgado.setVisible(true);
        Cancelar.setVisible(true);
        AnchorPaneSalir.setVisible(true);
        Atacar.setVisible(false);
        Curar.setVisible(false);
    }

    void resetear() {

        AnchorPaneAtacar.setVisible(true);
        AtaqueNormal.setVisible(false);
        AtaqueArriesgado.setVisible(false);
        AtaqueMuyArriesgado.setVisible(false);
        Cancelar.setVisible(false);
        AnchorPaneSalir.setVisible(false);
        Atacar.setVisible(true);
        Curar.setVisible(true);

    }


    public void enviarPokemon(Pokemon pokemon) {

        if (pokemon.getVidaActual() <= 0){
            Alert(pokemon);
        }
        pokemones=pokemon;

        pokemon.setNombre(pokemon.getNombre());
        pokemon.setVidaActual(pokemon.getVidaActual());
        pokemon.setVidaTotal(pokemon.getVidaTotal());
        pokemon.setNivel(pokemon.getNivel());
        pokemon.setImagenTrasera(pokemon.getImagenTrasera());
        labelNombre2.setText(pokemon.getNombre());
        labelNivel2.setText(pokemon.getNivel());
        progressBar2.setProgress((double) pokemon.getVidaActual()/pokemon.getVidaTotal());
        imageTrasera.setImage(new Image(pokemon.getImagenTrasera()));

        labelNombre1.setText(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getNombre());
        labelNivel1.setText(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getNivel());
        progressBar1.setProgress((double)Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getVidaActual()/Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getVidaTotal());
        imageDelantera.setImage(new Image(Ventana1Controller.PokemonArrayEnemigo.get(Ventana1Controller.x).getImagenDelantera()));

    }
    public void control(){
        Ventana1Controller.x = new Random().nextInt(Ventana1Controller.PokemonArrayEnemigo.size());
        while(Ventana1Controller.ArrayAleatorio.contains(Ventana1Controller.x)){
            Ventana1Controller.x = new Random().nextInt(Ventana1Controller.PokemonArrayEnemigo.size());
        }
        Ventana1Controller.ArrayAleatorio.add(Ventana1Controller.x);
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
        //Stage stage = (stage) this.Continuar.getScene().getWindow();
        //stage.close();
    }
    public void salir(){
        System.exit(0);
    }
    public void controllerPokemon(Ventana1Controller ventana1Controller){
        this.controller= ventana1Controller;
    }
}
