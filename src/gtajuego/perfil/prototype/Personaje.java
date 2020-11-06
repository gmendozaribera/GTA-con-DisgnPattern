/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtajuego.perfil.prototype;

/**
 *
 * @author German
 */
public abstract class Personaje implements Cloneable{
    protected String colorCabello;
    protected String colorRemera;
    protected String colorPantalon;
    protected String colorCalzado;
    protected String sexo;

    public Personaje(String colorCabello, String colorRemera, String colorPantalon, String colorCalzado, String sexo) {
        this.colorCabello = colorCabello;
        this.colorRemera = colorRemera;
        this.colorPantalon = colorPantalon;
        this.colorCalzado = colorCalzado;
        this.sexo = sexo;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public String getColorRemera() {
        return colorRemera;
    }

    public void setColorRemera(String colorRemera) {
        this.colorRemera = colorRemera;
    }

    public String getColorPantalon() {
        return colorPantalon;
    }

    public void setColorPantalon(String colorPantalon) {
        this.colorPantalon = colorPantalon;
    }

    public String getColorCalzado() {
        return colorCalzado;
    }

    public void setColorCalzado(String colorCalzado) {
        this.colorCalzado = colorCalzado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
//    funcion abstracta
    public abstract Object clone();
}
