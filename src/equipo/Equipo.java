package equipo;


import equipo.jugador.Jugador;


public class Equipo {

	private String nombre;
    private Jugador[] alineacion;
    
    

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.alineacion = new Jugador[11];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void anadirJugador(Jugador jugador, int posicion) {
        if (posicion < 0 || posicion >= 11) {
            throw new IllegalArgumentException("La posición debe estar entre 0 y 10.");
        }
        alineacion[posicion] = jugador;
    }

    public void mostrarAlineacion() {
        for (int i = 0; i < alineacion.length; i++) {
            if (alineacion[i] == null) {
                throw new IllegalStateException("No están cubiertos todos los puestos de la alineación.");
       
            }
        for (int j = 0; j < alineacion.length; j++) {
        	  String[] posiciones = {"Portero", "Lateral izquierdo", "Central", "Central", "Lateral derecho",
                      "Pivote", "Pivote", "Mediapunta", "Extremo izquierdo", "Extremo derecho", "Delantero centro"};
        	  
            System.out.println(posiciones[j] + ": " + 
            					alineacion[j].getNombre() + 
            					" (Dorsal: " + alineacion[i].getDorsal() + ")");
        }
            }
        }
    }


    