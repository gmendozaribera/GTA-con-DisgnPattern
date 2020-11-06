/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtajuego.estadoPersonaje.state;

/**
 *
 * @author German
 */
public abstract class State {

    public abstract void esconderse(Personaje personaje);

    public abstract void cometerCrimen(Personaje personaje);

    public abstract void cumplirMision(Personaje personaje);

    public abstract void recibirDano(Personaje personaje);
    
    public abstract String getImage();
}
