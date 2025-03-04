package equipo.jugador.defensa;

import equipo.Equipo;
import equipo.jugador.Jugador;
import equipo.jugador.enums.EnumPuesto;

public abstract class Lateral extends Jugador {
	private int disputasRealizadas;
	private EnumPuesto puesto;
	
	public Lateral(String nombre, int dorsal, Equipo equipo) {
		super(nombre,dorsal,equipo);
		setDisputasRealizadas(disputasRealizadas);
	}

	public void setDisputasRealizadas(int disputasRealizadas) {
		setDisputasRealizadas(disputasRealizadas);
	}
	public int getDisputasRealizadas() {
		return this.disputasRealizadas;
	}

	public EnumPuesto getPuesto() {
		return puesto;
	}

	public void setPuesto(EnumPuesto puesto) {
		this.puesto = puesto;
	}
	
}
