package sample;

public class Pokemon {
    String nombre;
    int vidaActual;
    int vidaTotal;
    int vidaActualRival;
    String nivel;
    String imagenDelantera;
    String imagenTrasera;
    double progressbar;

    public Pokemon(String nombre, int vidaActual, int vidaTotal, String nivel, String imagenDelantera, String imagenTrasera) {
        this.nombre = nombre;
        this.vidaActual = vidaActual;
        this.vidaTotal = vidaTotal;
        this.nivel = nivel;
        this.imagenDelantera = imagenDelantera;
        this.imagenTrasera = imagenTrasera;
        this.progressbar = (double) vidaActual / vidaTotal;
    }
    public Pokemon (String nombre, int vidaActual,int vidaTotal, String nivel, String imagenDelantera){
        this.nombre = nombre;
        this.vidaActual = vidaActual;
        this.vidaTotal = vidaTotal;
        this.nivel = nivel;
        this.imagenDelantera =imagenDelantera;
        this.progressbar= (double) vidaActual/vidaTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVidaActual() {
        if (vidaActual<0){
            return 0;
        }else if(vidaActual >vidaTotal){
            return vidaTotal;
        }else {
            return vidaActualRival;
        }
    }

    public double getProgressbar() {
        return progressbar;
    }

    public void setProgressbar(double progressbar) {
        this.progressbar = progressbar;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
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
