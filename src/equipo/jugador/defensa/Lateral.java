package equipo.jugador.defensa;

import equipo.Equipo;
import equipo.jugador.enums.EnumPuesto;

public abstract class Lateral extends Defensa {
	private int disputasRealizadas;
	private EnumPuesto puesto;
	
	public Lateral(String nombre, int dorsal, Equipo equipo) {
		super(nombre,dorsal,equipo);
		setDisputasRealizadas(disputasRealizadas);
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		setDisputasRealizadas(disputasRealizadas);
	}
	public int getDisputasRealizadas() {
		return this.disputasRealizadas;
	}

	public EnumPuesto getPuesto() {
		return puesto;
	}

	public void setPuesto(EnumPuesto puesto) {
		this.puesto = puesto;
	}
	
	public void mostraDatos(){
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		String result = "Lateral \n";
		result +="Nombre = "+ this.getNombre() 
		+ " Dorsal= " + this.getDorsal()
		+" Equipo =" + this.getEquipo();
		return result;
	}
}
