package equipo.jugador.portero;

import equipo.Equipo;
import equipo.jugador.Jugador;

public abstract class Portero extends Jugador {
	
	private int paradas;
	
	public Portero(String nombre, int dorsal, Equipo equipo) {	
		super(nombre,dorsal,equipo);
		setParadas(paradas);
	}
	public void setParadas(int paradas) {
		
	}
	public int getParadas() {
		return this.paradas;
	}
	public void mostraDatos(){
		System.out.println(this);
	}
	@Override
	public String toString() {
		String result = "Portero \n";
		result +="Nombre = "+ this.getNombre() 
		+ " Dorsal= " + this.getDorsal()
		+" Equipo =" + this.getEquipo();
		return result;
	}
	
	

}
