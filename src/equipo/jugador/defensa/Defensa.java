package equipo.jugador.defensa;

import equipo.Equipo;
import equipo.jugador.Jugador;

public abstract class Defensa extends Jugador {
	
	private int disputasRealizadas;
	
	public Defensa(String nombre, int dorsal, Equipo equipo) {
		super(nombre,dorsal,equipo);
		setDisputasRealizadas(disputasRealizadas);
	}
	public void setDisputasRealizadas(int disputasRealizadas) {
		
	}
	public int getDisputasRealizadas() {
		return this.disputasRealizadas;
	}
	

}
