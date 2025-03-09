package equipo.jugador.defensa;

import equipo.Equipo;

public  class Central extends Defensa {

	private int entradas;
	
	public Central(String nombre, int dorsal, Equipo equipo,int disputasRealizadas,int entradas) {
         super(nombre,dorsal,equipo,disputasRealizadas);
         setEntradas(entradas);
	}
	
	public int getEntradas() {
		return entradas;
	}
	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	
	public void mostrarDatos(){
		System.out.println(this);
	}
	@Override
	public String toString() {
		String result = "Central \n";
		result +="Nombre = "+ this.getNombre() 
		+ " Dorsal= " + this.getDorsal()
		+" Equipo =" + this.getEquipo().getNombre()
		+ " Disputas realizadas = " + this.getDisputasRealizadas()
		+ " Entradas = " + this.getEntradas();
		return result;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (!super.equals(obj)) return false;
	        Central central = (Central) obj;
	        return entradas == central.entradas;
	    }

	

}
