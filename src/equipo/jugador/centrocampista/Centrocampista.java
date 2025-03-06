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
	@Override
	public String toString() {
		String result = "Jugador \n";
		result +="Nombre = "+ this.getNombre() 
		+ " Dorsal= " + this.getDorsal()
		+" Equipo =" + this.getEquipo();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!this.getClass().equals(obj.getClass())) {
			return false;
		}
		boolean iguales = false;
		Centrocampista otroJugador = (Centrocampista) obj;
		if(super.equals(obj) && this.pasesCompletados == otroJugador.pasesCompletados) {
			iguales = true;
		}
		return iguales;

	}
}
