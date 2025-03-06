package equipo.jugador.defensa;

import equipo.Equipo;

public abstract class Central extends Defensa {
	private int disputasRealizadas;
	private int entradas;
	
	public Central(String nombre, int dorsal, Equipo equipo) {
         super(nombre,dorsal,equipo);
         setEntradas(entradas);
	}
	public void setDisputasRealizadas(int disputasRealizadas) {
		
	}
	public int getDisputasRealizadas() {
		return this.disputasRealizadas;
	}
	public void setEntradas(int entradas) {
		
	}
	public int getEntradas() {
		return this.entradas;
	}
	public void mostraDatos(){
		System.out.println(this);
	}
	@Override
	public String toString() {
		String result = "Central \n";
		result +="Nombre = "+ this.getNombre() 
		+ " Dorsal= " + this.getDorsal()
		+" Equipo =" + this.getEquipo();
		return result;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (!super.equals(obj)) return false;
	        Central central = (Central) obj;
	        return entradas == central.entradas;
	    }

	

}
