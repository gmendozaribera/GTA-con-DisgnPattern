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
public class PersonajeMasculino extends Personaje{

    public PersonajeMasculino(String colorCabello, String colorRemera, String colorPantalon, String colorCalzado, String sexo) {
        super(colorCabello, colorRemera, colorPantalon, colorCalzado, sexo);
    }

    @Override
    public Object clone() {
        return new PersonajeMasculino(getColorCabello(), getColorRemera(), getColorPantalon(), getColorCalzado(), getSexo());
    }
    
}
