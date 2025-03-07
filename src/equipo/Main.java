package equipo;

import java.util.Scanner;

import equipo.jugador.Jugador;
import equipo.jugador.centrocampista.Centrocampista;
import equipo.jugador.centrocampista.Mediapunta;
import equipo.jugador.centrocampista.Pivote;
import equipo.jugador.defensa.Central;
import equipo.jugador.defensa.Lateral;
import equipo.jugador.delantero.DelanteroCentro;
import equipo.jugador.delantero.Extremo;
import equipo.jugador.enums.EnumPuesto;
import equipo.jugador.portero.Portero;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Equipo equipo = null;
        Jugador[] jugadores = new Jugador[11];
        Equipo[] equipos = new Equipo[3];
        equipos[0] = new Equipo("Real Madrid");
        equipos[1] = new Equipo("FC Barcelona");
        equipos[2] = new Equipo("Manchester City");
        
        
        
        int opcion;
        do {
            System.out.println("\n--- Menú de Gestión de Equipo ---");
            System.out.println("1. Crear equipo");
            System.out.println("2. Agregar jugadores");
            System.out.println("3. Mostrar datos de los jugadores");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del equipo: ");
                    String nombreEquipo = scanner.nextLine();
                    equipo = new Equipo(nombreEquipo);
                    System.out.println("Equipo creado: " + nombreEquipo);
                    break;

                case 2:
                    if (equipo == null) {
                        System.out.println("¡Primero debes crear un equipo!");
                        break;
                    }
                    agregarJugadores(jugadores, scanner, equipo.getNombre());
                    break;

                case 3:
                    if (equipo == null) {
                        System.out.println("¡Crea un equipo primero!");
                        break;
                    }
                    mostrarJugadores(jugadores);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    public static void agregarJugadores(Jugador[] jugadores, Scanner scanner, String equipo) {
        System.out.println("Agregando jugadores al equipo " + equipo + "...");

        jugadores[0] = new Portero("Courtois", 1, equipo, 50);
        jugadores[1] = new Lateral("Carvajal", 2, equipo, 100, EnumPuesto.DERECHO);
        jugadores[2] = new Central("Rüdiger", 3, equipo, 90, 30);
        jugadores[3] = new Central("Alaba", 4, equipo, 85, 25);
        jugadores[4] = new Lateral("Mendy", 23, equipo, 110, EnumPuesto.IZQUIERDO);
        jugadores[5] = new Pivote("Tchouaméni", 18, equipo, 500, 80);
        jugadores[6] = new Centrocampista("Modric", 10, equipo, 700);
        jugadores[7] = new Mediapunta("Bellingham", 5, equipo, 600, 15);
        jugadores[8] = new Extremo("Vinicius", 7, equipo, 20, EnumPuesto.IZQUIERDO);
        jugadores[9] = new Extremo("Rodrygo", 11, equipo, 15, EnumPuesto.DERECHO);
        jugadores[10] = new DelanteroCentro("Benzema", 9, equipo, 25);

        System.out.println("Jugadores agregados al equipo.");
    }

    public static void mostrarJugadores(Jugador[] jugadores) {
        System.out.println("\n--- Datos de los jugadores ---");
        for (Jugador jugador : jugadores) {
            if (jugador != null) {
                jugador.mostrarDatos(); 
            }
        }
    }


	}


