package equipo;

import java.util.ArrayList;
import java.util.List;
import equipo.jugador.Jugador;

public class Equipo {
	private String nombre;
	private List<Jugador> jugadores;
	
	public Equipo() {
		this.jugadores =  new ArrayList<Jugador>();
	}
	public void setNombre(String nombre) {
		setNombre(nombre);
	}
	public String getNombre() {
		return nombre;
	}
	
	public List<Jugador> getJugador() {
		return jugadores;
		
	}
	public void mostrarAlineacion() {
		if(jugadores == null) {
			System.out.println("Alineacion vacia");
		}
		else {
			for(Jugador jugador:this.jugadores) {
				jugador.mostrarDatos();
				
			}
		}
	}
	
		
}
