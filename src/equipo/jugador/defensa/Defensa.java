package equipo.jugador.defensa;

import equipo.jugador.Jugador;
import equipo.jugador.enums.EnumPuesto;

public abstract class Defensa extends Jugador {
	
	private int disputasRealizadas;
	private EnumPuesto puesto;
	
	public Defensa(String nombre, int dorsal, String equipo,int disputasRealizadas) {
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
	
	public void mostrarDatos(){
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
	 @Override
	    public boolean equals(Object obj) {
	        if (!super.equals(obj)) return false;
	        Defensa defensa = (Defensa) obj;
	        return disputasRealizadas == defensa.disputasRealizadas;
	    }


}
