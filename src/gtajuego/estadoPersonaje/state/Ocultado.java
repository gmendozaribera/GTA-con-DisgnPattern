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
public class Ocultado extends State {

    @Override
    public void esconderse(Personaje personaje) {
        personaje.lbEstado.setText("Ocultado: Ya estas oculto!!!");
    }

    @Override
    public void cometerCrimen(Personaje personaje) {
        personaje.setNivelAmenaza(personaje.getNivelAmenaza() + 1);
        personaje.setState(new Amenazante());
        personaje.lbEstado.setText("Nivel de Amenazana: cometere crimenes para subir mi popularidad");

    }

    @Override
    public void cumplirMision(Personaje personaje) {
        personaje.setCantidadDinero(personaje.getCantidadDinero() + 10);
        personaje.setState(new Financiero());
        personaje.lbEstado.setText("Estado Financiero: cumplire mi mision para hacerme mas rico");
        personaje.lbDinero.setText(String.valueOf(personaje.getCantidadDinero()));
    }

    @Override
    public void recibirDano(Personaje personaje) {
        personaje.lbEstado.setText("Ocultado: Mientras este escondido, no recibire daño de alguien");
    }

    @Override
    public String getImage() {
        return "escondido.png";
    }

}
