package equipo.jugador.delantero;

import equipo.Equipo;
import equipo.jugador.enums.EnumPuesto;

public class Extremo extends Delantero {
	private EnumPuesto puesto;

	public Extremo(String nombre,int dorsal,Equipo equipo,int goles, EnumPuesto puesto) {
		super(nombre,dorsal,equipo,goles);
		setPuesto(puesto);
	}
	
	public EnumPuesto getPuesto() {
		return puesto;
	}
	
	public void setPuesto(EnumPuesto puesto) {
		this.puesto=puesto;
	}
	public void mostrarDatos(){
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		String result= "Extremo: "+ puesto+"\n";
		result += "Nombre: "+ this.getNombre()
		+ " Dorsal: "+ this.getDorsal()
		+ " Equipo: "+this.getEquipo().getNombre()
		+" Goles = " + this.getGoles();
		return result;
		
		
	}
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!this.getClass().equals(obj.getClass())) {
			return false;
		}
		boolean iguales = false;
		Extremo otroJugador= (Extremo)obj;
		if(super.equals(obj) && this.puesto == otroJugador.puesto) {
			iguales = true;
		}
			return iguales;
	}

}
