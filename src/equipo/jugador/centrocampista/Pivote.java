package equipo.jugador.centrocampista;


public class Pivote extends Centrocampista {

	private int intercepciones;

	public Pivote(String nombre, int dorsal, String equipo, int pasesCompletados, int intercepciones) {
		super(nombre, dorsal, equipo, pasesCompletados);
		setIntercepciones(intercepciones);
	}

	public int getIntercepciones() {
		return intercepciones;
	}

	public void setIntercepciones(int intercepciones) {
		this.intercepciones = intercepciones;
	}

	@Override
	public void mostrarDatos() {  
		System.out.println(this);
		}
	
	@Override
	public String toString() {
		String result = "Centrocampista \n";
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
		Pivote otroJugador = (Pivote) obj;
		if(super.equals(obj) && this.intercepciones == otroJugador.intercepciones) {
			iguales = true;
		}
		return iguales;
	
		
	}
		
	}
	

		

	


