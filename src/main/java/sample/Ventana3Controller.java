package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;

import java.io.IOException;


public class Ventana3Controller {

    private int totalDanoAliado = 0;
    private int totalDanoEnemigo = 0;
    private Ventana1Controller controller1;


    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private PieChart pieChart;



    public void initialize() {

        pieChartfuncion();

    }

    public void setdanoTotalEnemigo(int cantidadDanoEnemigo) {
        this.totalDanoEnemigo = cantidadDanoEnemigo;
    }

    public void setdanoTotalAliado(int cantidadDanoAliado) {
        this.totalDanoAliado = cantidadDanoAliado;
    }
    public void controllerEstadisticas(Ventana1Controller ventana1Controller){
        controller1= ventana1Controller;
        controller1.setController3(this);
    }
    public void pieChartfuncion(){

        Scene scene = new Scene(new Group());
        controller1.actualizarDanoEnemigo(totalDanoEnemigo);
        controller1.actualizarDanoAliado(totalDanoAliado);
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Aliados", totalDanoAliado),
                        new PieChart.Data("Enemigos", totalDanoAliado));

        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Dano Total");

        ((Group) scene.getRoot()).getChildren().add(chart);

        pieChart.setData(pieChartData);
    }
    public void getDanoAliado(double cantidadDanoAliado) {
        this.totalDanoAliado = (int) cantidadDanoAliado;
    }

    public void getDanoEnemigo(double cantidadDanoEnemigo) {
        this.totalDanoEnemigo = (int) cantidadDanoEnemigo;
    }
}

