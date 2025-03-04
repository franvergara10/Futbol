package equipo.jugador.defensa;

import equipo.Equipo;
import equipo.jugador.Jugador;
import equipo.jugador.enums.EnumPuesto;

public abstract class Defensa extends Jugador {
	
	private int disputasRealizadas;
	private EnumPuesto puesto;
	
	public Defensa(String nombre, int dorsal, Equipo equipo) {
		super(nombre,dorsal,equipo);
		setDisputasRealizadas(disputasRealizadas);
	}
	public void setDisputasRealizadas(int disputasRealizadas) {
		
	}
	public int getDisputasRealizadas() {
		return this.disputasRealizadas;
	}
	public EnumPuesto getPuesto() {
		return puesto;
	}
	
	public void mostraDatos(){
		System.out.println(this);
	}
	@Override
	public String toString() {
		String result = "Defensa \n";
		result +="Nombre = "+ this.getNombre() 
		+ " Dorsal= " + this.getDorsal()
		+ " Posición= " + this.getPuesto()
		+" Equipo =" + this.getEquipo();
		return result;
	}

}
