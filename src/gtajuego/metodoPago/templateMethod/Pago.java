/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtajuego.metodoPago.templateMethod;

/**
 *
 * @author German
 */
public abstract class Pago {
    protected int numeroTarjeta;
    protected int mmaa;
    protected int cvv;
    protected String pais;
    protected double descuento;
    protected double precio;
    protected double precioTotal;
    
    public abstract void calcularPrecio();

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void calcularPrecioDcto(){
        this.calcularPrecio();
        precioTotal = precio - descuento;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    
    public void setDatosTarjeta(int numeroTarjeta, int mmaa, int cvv, String pais){
        this.numeroTarjeta = numeroTarjeta;
        this.mmaa = mmaa;
        this.cvv = cvv;
        this.pais = pais;
    }
}
