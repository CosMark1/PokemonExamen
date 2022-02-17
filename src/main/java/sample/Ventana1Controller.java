package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class Ventana1Controller {


	private void abrirVentana(){
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("/Ventana2.fxml"));
			AnchorPane root = fxmlLoader.load();
			Scene scene = new Scene(root,600,440);
			Stage stage2 = new Stage();
			stage2.setScene(scene);
			stage2.show();
			Ventana2Controller a = fxmlLoader.getController();
			a.enviarPokemon(pokemonSeleccionado);


		} catch (IOException ex) {
			System.out.println("IO Exception: " + ex.getMessage());
		}
	}

	Pokemon p1 = new Pokemon("IvySaur", 200,200, "Nv 65", "/image/002.png","/image/ivysaurespaldas.gif");
	Pokemon p2 = new Pokemon("Charmeleon", 150,200, "Nv 45","/image/005.png","/image/charmeleonespaldas.gif");
	Pokemon p3 = new Pokemon("Blastoise", 200,200, "Nv 54", "/image/009.png","/image/blastoiseespaldas.gif");
	Pokemon p4 = new Pokemon("Sandshrew", 200,200 , "Nv 65", "/image/027.png","/image/sandshrewespaldas.gif");
	Pokemon p5 = new Pokemon("Vulpix", 200,200, "Nv 75","/image/037.png","/image/vulpixespaldas.gif");
	Pokemon p6 = new Pokemon("Growlithe", 200,200, "Nv 54", "/image/058.png","/image/growlitheespaldas.gif");

	Pokemon pokemonSeleccionado= null;

	@FXML
	Label labelNombre1;
	@FXML
	Label labelNombre2;
	@FXML
	Label labelNombre3;
	@FXML
	Label labelNombre4;
	@FXML
	Label labelNombre5;
	@FXML
	Label labelNombre6;
	@FXML
	Label labelVida1;
	@FXML
	Label labelVida2;
	@FXML
	Label labelVida3;
	@FXML
	Label labelVida4;
	@FXML
	Label labelVida5;
	@FXML
	Label labelVida6;
	@FXML
	Label labelNivel1;
	@FXML
	Label labelNivel2;
	@FXML
	Label labelNivel3;
	@FXML
	Label labelNivel4;
	@FXML
	Label labelNivel5;
	@FXML
	Label labelNivel6;
	@FXML
	ProgressBar progressBar1;
	@FXML
	ProgressBar progressBar2;
	@FXML
	ProgressBar progressBar3;
	@FXML
	ProgressBar progressBar4;
	@FXML
	ProgressBar progressBar5;
	@FXML
	ProgressBar progressBar6;

	@FXML
	ImageView image1;
	@FXML
	ImageView image2;
	@FXML
	ImageView image3;
	@FXML
	ImageView image4;
	@FXML
	ImageView image5;
	@FXML
	ImageView image6;
	@FXML
	AnchorPane anchorPane1;
	@FXML
	AnchorPane anchorPane2;
	@FXML
	AnchorPane anchorPane3;
	@FXML
	AnchorPane anchorPane4;
	@FXML
	AnchorPane anchorPane5;
	@FXML
	AnchorPane anchorPane6;
	@FXML
	Button boton1;
	@FXML
	Button boton2;


	@FXML
	public void initialize(){

		labelNombre1.setText(p1.nombre);
		labelNombre2.setText(p2.nombre);
		labelNombre3.setText(p3.nombre);
		labelNombre4.setText(p4.nombre);
		labelNombre5.setText(p5.nombre);
		labelNombre6.setText(p6.nombre);
		labelNivel1.setText(p1.nivel);
		labelNivel2.setText(p2.nivel);
		labelNivel3.setText(p3.nivel);
		labelNivel4.setText(p4.nivel);
		labelNivel5.setText(p5.nivel);
		labelNivel6.setText(p6.nivel);
		labelVida1.setText(p1.vidaActual+"/"+p1.vidaTotal);
		labelVida2.setText(p2.vidaActual+"/"+p2.vidaTotal);
		labelVida3.setText(p3.vidaActual+"/"+p3.vidaTotal);
		labelVida4.setText(p4.vidaActual+"/"+p4.vidaTotal);
		labelVida5.setText(p5.vidaActual+"/"+p5.vidaTotal);
		labelVida6.setText(p6.vidaActual+"/"+p6.vidaTotal);
		image1.setImage(new Image(p1.imagenDelantera));
		image2.setImage(new Image(p2.imagenDelantera));
		image3.setImage(new Image(p3.imagenDelantera));
		image4.setImage(new Image(p4.imagenDelantera));
		image5.setImage(new Image(p5.imagenDelantera));
		image6.setImage(new Image(p6.imagenDelantera));
		progressBar1.setProgress(p1.progressbar);
		progressBar2.setProgress(p2.progressbar);
		progressBar3.setProgress(p3.progressbar);
		progressBar4.setProgress(p4.progressbar);
		progressBar5.setProgress(p5.progressbar);
		progressBar6.setProgress(p6.progressbar);

	}

	@FXML
	private void onMouseClickedPokemon1() {
		reiniciar();
		labelNombre1.setStyle("-fx-text-fill: blue;");
		labelNivel1.setStyle("-fx-text-fill: blue;");
		labelVida1.setStyle("-fx-text-fill: blue;");
		anchorPane1.setStyle("-fx-border-color: white;");
		anchorPane1.setStyle("-fx-background-color: blue;");
		boton1.setStyle("-fx-text-fill: blue");
		pokemonSeleccionado = p1;

	}
	@FXML
	private void onMouseClickedPokemon2() {
		reiniciar();
		labelNombre2.setStyle("-fx-text-fill: blue;");
		labelNivel2.setStyle("-fx-text-fill: blue;");
		labelVida2.setStyle("-fx-text-fill: blue;");
		anchorPane2.setStyle("-fx-border-color: white;");
		anchorPane2.setStyle("-fx-background-color: blue;");
		boton1.setStyle("-fx-text-fill: blue");
		pokemonSeleccionado = p2;
	}
	@FXML
	private void onMouseClickedPokemon3() {
		reiniciar();
		labelNombre3.setStyle("-fx-text-fill: blue;");
		labelNivel3.setStyle("-fx-text-fill: blue;");
		labelVida3.setStyle("-fx-text-fill: blue;");
		anchorPane3.setStyle("-fx-border-color: white;");
		anchorPane3.setStyle("-fx-background-color: blue;");
		boton1.setStyle("-fx-text-fill: blue");
		pokemonSeleccionado = p3;
	}
	@FXML
	private void onMouseClickedPokemon4() {
		reiniciar();
		labelNombre4.setStyle("-fx-text-fill: blue;");
		labelNivel4.setStyle("-fx-text-fill: blue;");
		labelVida4.setStyle("-fx-text-fill: blue;");
		anchorPane4.setStyle("-fx-border-color: white;");
		anchorPane4.setStyle("-fx-background-color: blue;");
		boton1.setStyle("-fx-text-fill: blue");
		pokemonSeleccionado = p4;
	}
	@FXML
	private void onMouseClickedPokemon5() {
		reiniciar();
		labelNombre5.setStyle("-fx-text-fill: blue;");
		labelNivel5.setStyle("-fx-text-fill: blue;");
		labelVida5.setStyle("-fx-text-fill: blue;");
		anchorPane5.setStyle("-fx-border-color: white;");
		anchorPane5.setStyle("-fx-background-color: blue;");
		boton1.setStyle("-fx-text-fill: blue");
		pokemonSeleccionado = p5;
	}
	@FXML
	private void onMouseClickedPokemon6() {
		reiniciar();
		labelNombre6.setStyle("-fx-text-fill: blue;");
		labelNivel6.setStyle("-fx-text-fill: blue;");
		labelVida6.setStyle("-fx-text-fill: blue;");
		anchorPane6.setStyle("-fx-border-color: white;");
		anchorPane6.setStyle("-fx-background-color: blue;");
		boton1.setStyle("-fx-text-fill: blue");
		pokemonSeleccionado = p6;
	}

	private void reiniciar(){
		labelNombre1.setStyle("-fx-text-fill: black;");
		labelNivel1.setStyle("-fx-text-fill: black;");
		labelVida1.setStyle("-fx-text-fill: black;");
		anchorPane1.setStyle("-fx-border-color:  #776495;");
		anchorPane1.setStyle("-fx-background-color:  #776495;");

		labelNombre2.setStyle("-fx-text-fill: black;");
		labelNivel2.setStyle("-fx-text-fill: black;");
		labelVida2.setStyle("-fx-text-fill: black;");
		anchorPane2.setStyle("-fx-border-color:  #776495;");
		anchorPane2.setStyle("-fx-background-color:  #776495;");

		labelNombre3.setStyle("-fx-text-fill: black;");
		labelNivel3.setStyle("-fx-text-fill: black;");
		labelVida3.setStyle("-fx-text-fill: black;");
		anchorPane3.setStyle("-fx-border-color:  #776495;");
		anchorPane3.setStyle("-fx-background-color:  #776495;");

		labelNombre4.setStyle("-fx-text-fill: black;");
		labelNivel4.setStyle("-fx-text-fill: black;");
		labelVida4.setStyle("-fx-text-fill: black;");
		anchorPane4.setStyle("-fx-border-color:  #776495;");
		anchorPane4.setStyle("-fx-background-color:  #776495;");

		labelNombre5.setStyle("-fx-text-fill: black;");
		labelNivel5.setStyle("-fx-text-fill: black;");
		labelVida5.setStyle("-fx-text-fill: black;");
		anchorPane5.setStyle("-fx-border-color:  #776495;");
		anchorPane5.setStyle("-fx-background-color:  #776495;");

		labelNombre6.setStyle("-fx-text-fill: black;");
		labelNivel6.setStyle("-fx-text-fill: black;");
		labelVida6.setStyle("-fx-text-fill: black;");
		anchorPane6.setStyle("-fx-border-color:  #776495;");
		anchorPane6.setStyle("-fx-background-color:  #776495;");

	}
	@FXML
	void OnMouseClickedElegir(){
		abrirVentana();
	}
}
class Pokemon {
	String nombre;
	int vidaActual;
	int vidaTotal;
	String nivel;
	String imagenDelantera;
	String imagenTrasera;
	double progressbar;

	public Pokemon(String nombre, int vidaActual,int vidaTotal, String nivel, String imagenDelantera, String imagenTrasera) {
		this.nombre = nombre;
		this.vidaActual = vidaActual;
		this.vidaTotal = vidaTotal;
		this.nivel = nivel;
		this.imagenDelantera =imagenDelantera;
		this.imagenTrasera=imagenTrasera;
		this.progressbar= (double) vidaActual/vidaTotal;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVidamaxima() {
		return vidaActual;
	}

	public void setVidamaxima(int vidamaxima) {
		this.vidaActual = vidamaxima;
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

	public String getImagenDelantera() {
		return imagenDelantera;
	}

	public void setImagenDelantera(String imagenDelantera) {
		this.imagenDelantera = imagenDelantera;
	}

	public String getImagenTrasera() {
		return imagenTrasera;
	}

	public void setImagenTrasera(String imagenTrasera) {
		this.imagenTrasera = imagenTrasera;
	}
}