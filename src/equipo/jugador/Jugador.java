package equipo.jugador;

public abstract class Jugador {

	private String nombre;
	private int dorsal;
	private String equipo;

	public Jugador(String nombre, int dorsal, String equipo) {
		setNombre(nombre);
		setDorsal(dorsal);
		setEquipo(equipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public abstract void mostrarDatos();
	

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
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        
	        Jugador jugador = (Jugador) obj;
	        return dorsal == jugador.dorsal && 
	               nombre.equals(jugador.nombre) && 
	               equipo.equals(jugador.equipo);
	    }




}
