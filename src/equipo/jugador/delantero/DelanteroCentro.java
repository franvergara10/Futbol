package equipo.jugador.delantero;

public class DelanteroCentro extends Delantero{
	
	private int golesDePenalti;
	
	
	public DelanteroCentro(String nombre, int dorsal, String equipo, int goles) {
		super(nombre, dorsal, equipo,goles);
		setGolesDePenalti(golesDePenalti);
	}
	
	public int getGolesDePenalti() {
		return golesDePenalti;
	}
	
	public void setGolesDePenalti(int golesDePeanlti) {
		this.golesDePenalti = golesDePeanlti;
	}
	
	public void mostrarDatos() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		String result = "Delantero Centro \n";
		result +="Nombre = "+ this.getNombre() 
		+ " Dorsal= " + this.getDorsal()
		+" Equipo =" + this.getEquipo();
		return result;
	}
	public boolean equals(Object obj) {
		if(obj ==null) {
			return false;
		}
		if(!this.getClass().equals(obj.getClass())) {
			return false;
		}
		boolean iguales=false;
		DelanteroCentro otroJugador = (DelanteroCentro)obj;
		if(super.equals(obj) && this.golesDePenalti == otroJugador.golesDePenalti) {
		iguales = true;
		}
		return iguales;
		}
		
}
