package equipo.jugador;

import equipo.Equipo;

public abstract class Jugador {

	private String nombre;
	private int dorsal;
	private Equipo equipo;

	public Jugador(String nombre, int dorsal, Equipo equipo) {
		setNombre(nombre);
		setDorsal(dorsal);
		setEquipo(equipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public abstract void mostrarDatos();

}
