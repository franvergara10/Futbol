package equipo.jugador.delantero;


import equipo.Equipo;
import equipo.jugador.Jugador;

public abstract class Delantero extends Jugador {

	private int goles;

	public Delantero(String nombre, int dorsal, Equipo equipo, int goles) {
		super(nombre, dorsal, equipo);
		setGoles(goles);

	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

}
