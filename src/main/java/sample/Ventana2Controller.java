package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
    private static int cantidadDanoAliado;
    private static int cantidadDanoEnemigo;

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
        cambiar();
        Random rd = new Random();
        double min = 0;
        double max = 50;
        double randomValueAliado = min + (max - min) * rd.nextDouble();
        double randomValueEnemigo = min + (max - min) * rd.nextDouble();




        Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).setVidaActual((int) (Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()-randomValueEnemigo));
        if(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()<=0 ){
            Alert(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x));
            control();
            cantidadDanoEnemigo += (int) randomValueEnemigo;
        }else {
            pokemones.setVidaActual((int) (pokemones.getVidaActual() - randomValueAliado));
            cantidadDanoAliado += (int) randomValueAliado;
        }
        enviarPokemon(pokemones);
        this.controller.actualizarVidas();
    }

    @FXML
    void onMouseClickedAtaqueMuyArriesgado() {
        cambiar();
        Random rd = new Random();
        double min = 10;
        double max = 25;
        double randomValueAliado = min + (max - min) * rd.nextDouble();
        double randomValueEnemigo = min + (max - min) * rd.nextDouble();



        Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).setVidaActual((int) (Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()-randomValueEnemigo));
        if(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()<=0){
            Alert(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x));
            control();
            cantidadDanoEnemigo += (int) randomValueEnemigo;
        }else{
            pokemones.setVidaActual((int) (pokemones.getVidaActual() - randomValueAliado));
            cantidadDanoAliado += (int) randomValueAliado;
        }
        enviarPokemon(pokemones);
        this.controller.actualizarVidas();
    }

    @FXML
    void onMouseClickedAtaqueNormal() {
        cambiar();

        Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).setVidaActual((Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()-20));
        if(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()<=0){
            Alert(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x));
            control();
            cantidadDanoAliado+=20;
        }else {
            pokemones.setVidaActual((pokemones.getVidaActual() - 20));
            cantidadDanoEnemigo+=20;
        }
        enviarPokemon(pokemones);
        this.controller.actualizarVidas();
    }

    @FXML
    void onMouseClickedCurar() throws IOException {
        Random rd = new Random();
        double min = 25;
        double max = 75;
        double randomValue = min + (max - min) * rd.nextDouble();
        Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).setVidaActual((int) (Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()+randomValue));
        if(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()>=200){
            AlertaCurar(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x));

        }
        pokemones.setVidaActual((int) (pokemones.getVidaActual()+randomValue));

        enviarPokemon(pokemones);
        this.controller.actualizarVidas();
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

        labelNombre1.setText(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getNombre());
        labelNivel1.setText(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getNivel());
        progressBar1.setProgress((double)Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()/Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaTotal());
        imageDelantera.setImage(new Image(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getImagenDelantera()));

        colorVida(pokemon);

    }


    public void control(){
        Ventana1Controller.x = new Random().nextInt(Ventana1Controller.ArrayPokemonEnemigo.size());
        while(Ventana1Controller.PokemonEnemigoAleatorio.contains(Ventana1Controller.x)){
            Ventana1Controller.x = new Random().nextInt(Ventana1Controller.ArrayPokemonEnemigo.size());
        }
        Ventana1Controller.PokemonEnemigoAleatorio.add(Ventana1Controller.x);
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
    public void colorVida(Pokemon pokemones){
        if(pokemones.getVidaActual()<=50){
            progressBar2.setStyle("-fx-accent: red;");
        }else if (pokemones.getVidaActual() <= 100) {
            progressBar2.setStyle("-fx-accent: orange;");
        }
        if(Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual()<=50) {
            progressBar1.setStyle("-fx-accent: orange;");
        }else if (Ventana1Controller.ArrayPokemonEnemigo.get(Ventana1Controller.x).getVidaActual() <= 100) {
            progressBar1.setStyle("-fx-accent: orange;");
        }
    }
    public void showAlert1(Alert alert){

        Optional<ButtonType> resultado = alert.showAndWait();

        if(resultado.get() == ButtonType.OK){
            Curar.setVisible(false);
        }


    }
    //public Alert alerta_Rival(Pokemon rival){

    //    Alert customAlert = new Alert(Alert.AlertType.NONE);

    //    customAlert.setTitle("Pokemon Ganador");
    //    customAlert.setContentText("El pokemon perdedor es " + rival.getNombre());
    //    customAlert.setGraphic(new ImageView(new Image(rival.getImagenDelantera())));
    //    customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.NEXT, ButtonType.CLOSE);
    //    customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.OK);

    //    showAlert1(customAlert);

    //    return customAlert;
    //}
    public Alert AlertaCurar(Pokemon pokemon)  {

        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setHeaderText(null);
        alert.setTitle("Pokemon curado");
        alert.setContentText("El pokemon "+pokemon.getNombre()+" ya esta curado");
        alert.setGraphic(new ImageView(pokemon.getImagenDelantera()));
        alert.getDialogPane().getButtonTypes().addAll(ButtonType.OK);
        showAlert1(alert);
        return alert;



    }
    public void continuarAhora(){
        Ventana1Controller.stage2 = (Stage) Ventana1Controller.stage2.getScene().getWindow();
        Ventana1Controller.stage2.close();
        Ventana1Controller.stage2 = null;
    }
    public void salir(){
        System.exit(0);
    }
    public void controllerPokemon(Ventana1Controller ventana1Controller){
        this.controller= ventana1Controller;
    }
}
