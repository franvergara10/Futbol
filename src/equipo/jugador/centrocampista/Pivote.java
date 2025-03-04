package equipo.jugador.centrocampista;

import equipo.Equipo;

public class Pivote extends Centrocampista {

	private int intercepciones;

	public Pivote(String nombre, int dorsal, Equipo equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		setIntercepciones(intercepciones);
	}

	public int getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	@Override
	public String toString() {
		return "Pivote [getIntercepciones()=" + getIntercepciones() + ", getNombre()=" + getNombre() + ", getDorsal()="
				+ getDorsal() + ", getEquipo()=" + getEquipo() + "]";
	}

	@Override
	public void mostrarDatos() {
		System.out.println(this);

	}

}
