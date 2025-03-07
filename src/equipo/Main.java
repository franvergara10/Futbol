package equipo;

import java.util.ArrayList;
import java.util.List;
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

		String nombre;
		int dorsal;
		int opcion;
		Equipo equipo = new Equipo("Sevilla FC");

		do {
			System.out.println("\n--- Menú principal ---");
			System.out.println("1. Crear jugadores");
			System.out.println("2. Mostrar jugadores");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:

				System.out.print("Ingrese el nombre del jugador: ");
				nombre = scanner.next();
				System.out.print("Ingrese el dorsal del jugador: ");
				dorsal = scanner.nextInt();

				System.out.println("Elija el puesto del jugador:");
				System.out.println("1. Portero");
				System.out.println("2. Defensa Central");
				System.out.println("3. Lateral");
				System.out.println("5. Pivote");
				System.out.println("6. Mediapunta");
				System.out.println("7. Extremo");
				System.out.println("8. Delantero Centro");
				System.out.print("Seleccione una opción: ");
				int tipoJugador = scanner.nextInt();
				scanner.nextLine();

				switch (tipoJugador) {
				case 1:
					System.out.print("Ingrese el número de paradas del portero: ");
					int paradas = scanner.nextInt();
					Portero portero = new Portero(nombre, dorsal, equipo, paradas);
					equipo.anadirJugador(portero, 0);
					break;

				case 2:

					break;

				default:
					System.out.println("Opción no válida.");
					break;
				}

				break;
			case 2:

				if (!equipo.completo()) {
					System.out.println("No hay jugadores en el equipo.");
				} else {
					System.out.println("Jugadores del equipo " + equipo.getNombre() + ":");
					for (Jugador j : equipo.getAlineacion()) {
						j.mostrarDatos();
					}
				}
				break;

			case 3:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 3);

		scanner.close();
	}
}
