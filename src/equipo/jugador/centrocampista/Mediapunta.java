package equipo.jugador.centrocampista;

public class Mediapunta extends Centrocampista{
	
	private int asistencia;
	
	public Mediapunta(String nombre,int dorsal, String equipo,int pasesCompletados, int asistencia) {
		super(nombre,dorsal,equipo,pasesCompletados);
			setAsistencias(asistencia);
	}
	
	public int getAsistencias() {
		return asistencia;
	}
	
	public void setAsistencias(int asistencia) {
		
	}
	public void mostrarDatos() {
		System.out.println(this);
	}
	@Override
	public String  toString() {
		String result= "Mediapunta:\n";
		result += "Nombre= "+ getNombre()
		+ "Dorsal: "+ getDorsal()
		+"Equipo: "+ getEquipo();
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
		boolean iguales=false;
		Mediapunta otroJugador= (Mediapunta)obj;
		if(super.equals(obj)&& this.asistencia== otroJugador.asistencia) {
			iguales=true;
		}
		return iguales;
		
	}

}
