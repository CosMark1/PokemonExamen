package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import javax.swing.text.html.ImageView;


public class Ventana1Controller {

	@FXML
	Pokemon p1 = new Pokemon("Bulbasaur", "204"+"/"+"204" , "Nv 65");
	Pokemon p2 = new Pokemon("Pedro", "148"+"/"+"204", "Nv 45");
	Pokemon p3 = new Pokemon("Pedro", "234", "Nv 54");
	Pokemon p4 = new Pokemon("Pedro", "222" , "Nv 65");
	Pokemon p5 = new Pokemon("Pedro", "298", "Nv 75");
	Pokemon p6 = new Pokemon("Pedro", "160", "Nv 54");

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
	Label labelVidaMaxima1;
	@FXML
	Label labelVidaMaxima2;
	@FXML
	Label labelVidaMaxima3;
	@FXML
	Label labelVidaMaxima4;
	@FXML
	Label labelVidaMaxima5;
	@FXML
	Label labelVidaMaxima6;
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
	public void initialize(){

		labelNombre1.setText(p1.nombre);

	}
	@FXML
	private void onButtonAbrirClicked() {
		System.out.println("Botón pulsado");

	}

}
class Pokemon {
	String nombre;
	String vida;
	String nivel;

	public Pokemon(String nombre, String vida, String nivel) {
		this.nombre = nombre;
		this.vida = vida;
		this.nivel = nivel;

	}
}