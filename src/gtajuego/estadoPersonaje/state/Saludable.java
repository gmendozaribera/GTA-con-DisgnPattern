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
public class Saludable extends State {

    @Override
    public void esconderse(Personaje personaje) {
        if (personaje.getSalud() == 0) {
            personaje.setState(new GameOver());
            personaje.lbEstado.setText("GAME OVER, reinicia el juego");
            personaje.setImagen("gameover.png");
        } else {
            if (personaje.getCantidadDinero() == 0) {
                personaje.lbEstado.setText("No tengo dinero para pagarle a alguien para que me oculte");
            } else {
                personaje.setNivelAmenaza(0);
                personaje.setSalud(100);
                personaje.setCantidadDinero(personaje.getCantidadDinero() - 10);
                personaje.setState(new Ocultado());
                personaje.lbEstado.setText("Ocultado: Escondido me podre recuperar y ocultarme de la policia");
            }
        }
    }

    @Override
    public void cometerCrimen(Personaje personaje) {
        personaje.setNivelAmenaza(personaje.getNivelAmenaza() + 1);
        if (personaje.getSalud() == 0) {
            personaje.setState(new GameOver());
            personaje.lbEstado.setText("GAME OVER, reinicia el juego");
            personaje.setImagen("gameover.png");
        } else {
            personaje.setState(new Amenazante());
            personaje.lbEstado.setText("Nivel de Amenazana: cometere crimenes para subir mi popularidad");
        }
    }

    @Override
    public void cumplirMision(Personaje personaje) {
        personaje.setCantidadDinero(personaje.getCantidadDinero() + 10);
        if (personaje.getSalud() == 0) {
            personaje.setState(new GameOver());
            personaje.lbEstado.setText("GAME OVER, reinicia el juego");
            personaje.setImagen("gameover.png");
        } else {
            personaje.setState(new Financiero());
            personaje.lbEstado.setText("Estado Financiero: cumplire mi mision para hacerme mas rico");
        }
    }

    @Override
    public void recibirDano(Personaje personaje) {
        personaje.setSalud(personaje.getSalud() - 10);
        if (personaje.getSalud() <= 0) {
            personaje.setState(new GameOver());
            personaje.lbEstado.setText("GAME OVER, reinicia el juego");
            personaje.setImagen("gameover.png");
        }
    }

    @Override
    public String getImage() {
        return "recibirAtaque.png";
    }

}
