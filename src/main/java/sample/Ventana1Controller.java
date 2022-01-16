package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




public class Ventana1Controller {



	@FXML
	Pokemon p1 = new Pokemon("Bulbasaur", "204/204" , "Nv 65", "/image/002.png");
	Pokemon p2 = new Pokemon("Pedro", "148/204", "Nv 45","/image/005.png");
	Pokemon p3 = new Pokemon("Pedro", "148/204", "Nv 54", "/image/009.png");
	Pokemon p4 = new Pokemon("Pedro", "148/204" , "Nv 65", "/image/027.png");
	Pokemon p5 = new Pokemon("Pedro", "148/204", "Nv 75","/image/037.png");
	Pokemon p6 = new Pokemon("Pedro", "148/204", "Nv 54", "/image/058.png");






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
		labelVida1.setText(p1.vida);
		labelVida2.setText(p2.vida);
		labelVida3.setText(p3.vida);
		labelVida4.setText(p4.vida);
		labelVida5.setText(p5.vida);
		labelVida6.setText(p6.vida);
		image1.setImage(new Image(p1.imagenDelantera));
		image2.setImage(new Image(p2.imagenDelantera));
		image3.setImage(new Image(p3.imagenDelantera));
		image4.setImage(new Image(p4.imagenDelantera));
		image5.setImage(new Image(p5.imagenDelantera));
		image6.setImage(new Image(p6.imagenDelantera));

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
	String imagenDelantera;

	public Pokemon(String nombre, String vida, String nivel, String imagenDelantera) {
		this.nombre = nombre;
		this.vida = vida;
		this.nivel = nivel;
		this.imagenDelantera =imagenDelantera;


	}
}