package equipo.jugador.defensa;

import equipo.Equipo;
import equipo.jugador.enums.EnumPuesto;

public  class Lateral extends Defensa {

	private EnumPuesto puesto;
	
	public Lateral(String nombre, int dorsal, Equipo equipo, int disputasRealizadas, EnumPuesto puesto) {
		super(nombre,dorsal,equipo,disputasRealizadas);
		 setPuesto(puesto);
	}
	


	public EnumPuesto getPuesto() {
		return puesto;
	}

	public void setPuesto(EnumPuesto puesto) {
		this.puesto = puesto;
	}
	
	public void mostrarDatos(){
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		String result = "Lateral \n";
		result +="Nombre = "+ this.getNombre() 
		+ " Dorsal = " + this.getDorsal()
		+" Equipo = " + this.getEquipo().getNombre()
		+ " Posición = Lateral "+ this.getPuesto()
		+ " Disputas realizadas = " + this.getDisputasRealizadas();
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
		Lateral otroJugador = (Lateral) obj;
		if(super.equals(obj) && this.puesto == otroJugador.puesto) {
			iguales = true;
		}
		return iguales;

	}

}
