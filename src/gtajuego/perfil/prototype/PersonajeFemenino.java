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
public class PersonajeFemenino extends Personaje{

    public PersonajeFemenino(String colorCabello, String colorRemera, String colorPantalon, String colorCalzado, String sexo) {
        super(colorCabello, colorRemera, colorPantalon, colorCalzado, sexo);
    }

    @Override
    public Object clone() {
        return new PersonajeFemenino(getColorCabello(), getColorRemera(), getColorPantalon(), getColorCalzado(), getSexo());
    }
    
}
