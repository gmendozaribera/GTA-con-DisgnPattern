/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtajuego.estadoPersonaje.state;

import javax.swing.JOptionPane;

/**
 *
 * @author German
 */
public class GameOver extends State{

    @Override
    public void esconderse(Personaje personaje) {
        JOptionPane.showMessageDialog(null, "Debes reiniciar el juego para empezar de nuevo", "Atencion", 1);
    }

    @Override
    public void cometerCrimen(Personaje personaje) {
        JOptionPane.showMessageDialog(null, "Debes reiniciar el juego para empezar de nuevo", "Atencion", 1);
    }

    @Override
    public void cumplirMision(Personaje personaje) {
        JOptionPane.showMessageDialog(null, "Debes reiniciar el juego para empezar de nuevo", "Atencion", 1);
    }

    @Override
    public void recibirDano(Personaje personaje) {
        JOptionPane.showMessageDialog(null, "Debes reiniciar el juego para empezar de nuevo", "Atencion", 1);
    }

    @Override
    public String getImage() {
        return "gameover.png";
    }

    
}
