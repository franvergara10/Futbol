package equipo.jugador.centrocampista;

import equipo.Equipo;
import equipo.jugador.Jugador;

public abstract class Centrocampista extends Jugador {

	private int pasesCompletados;

	public Centrocampista(String nombre, int dorsal, Equipo equipo, int pasesCompletados) {
		super(nombre, dorsal, equipo);
		setPasesCompletados(pasesCompletados);
	}

	public int getPasesCompletados() {
		return pasesCompletados;
	}

	public void setPasesCompletados(int pasesCompletados) {
		this.pasesCompletados = pasesCompletados;
	}

}
