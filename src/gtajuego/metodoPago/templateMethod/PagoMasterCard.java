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
public class PagoMasterCard extends Pago{

    @Override
    public void calcularPrecio() {
        descuento = precio * 0.15;
    }
    
}
