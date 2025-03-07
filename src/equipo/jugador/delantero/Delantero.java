package equipo.jugador.delantero;

import equipo.jugador.Jugador;


public abstract class Delantero extends Jugador {

	private int goles;

	public Delantero(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo);
		setGoles(goles);

	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
	public void mostrarDatos(){
		System.out.println(this);
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
		Delantero otroJugador = (Delantero) obj;
		if(super.equals(obj) && this.goles == otroJugador.goles) {
			iguales = true;
		}
		return iguales;

	}

}
