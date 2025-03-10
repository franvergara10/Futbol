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

	
				System.out.println("Elija el puesto del jugador:");
				System.out.println("1. Portero");
				System.out.println("2. Defensa Central");
				System.out.println("3. Lateral");
				System.out.println("4. Pivote");
				System.out.println("5. Mediapunta");
				System.out.println("6. Extremo");
				System.out.println("7. Delantero Centro");
				System.out.println("8. Crea un equipo por defecto");
				System.out.print("Seleccione una opción: ");
				int tipoJugador = scanner.nextInt();
				scanner.nextLine();

				switch (tipoJugador) {
				case 1:
					System.out.print("Ingrese el nombre del jugador: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese el dorsal del jugador: ");
					dorsal = scanner.nextInt();

					System.out.print("Ingrese el número de paradas del portero: ");
					int paradas = scanner.nextInt();
					Portero portero = new Portero(nombre, dorsal, equipo, paradas);
					equipo.anadirJugador(portero, 0);
					break;

				case 2:
					System.out.print("Ingrese el nombre del jugador: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese el dorsal del jugador: ");
					dorsal = scanner.nextInt();

					System.out.println("Introduce el numero de entradas: ");
					int entradas = scanner.nextInt();
					System.out.println("Introduce el numero de disputas realizadas: ");
					int disputasRealizadas = scanner.nextInt();

					System.out.println("1. Central derecho");
					System.out.println("2. Central izquierdo");
					int opcionCentral = scanner.nextInt();

					if (opcionCentral == 1) {
						Central central = new Central(nombre, dorsal, equipo, disputasRealizadas, entradas);
						equipo.anadirJugador(central, 2);
					} else if (opcionCentral == 2) {
						Central central = new Central(nombre, dorsal, equipo, disputasRealizadas, entradas);
						equipo.anadirJugador(central, 3);
					} else {
						System.out.println("Opción incorrecta. Vuelva a empezar.");
					}

					break;

				case 3:
					System.out.print("Ingrese el nombre del jugador: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese el dorsal del jugador: ");
					dorsal = scanner.nextInt();

					System.out.println("Introduce el numero de disputas realizadas: ");
					disputasRealizadas = scanner.nextInt();

					System.out.println("1. Lateral derecho");
					System.out.println("2. Lateral izquierdo");
					int opcionLateral = scanner.nextInt();

					if (opcionLateral == 1) {
						Lateral lateralDerecho = new Lateral(nombre, dorsal, equipo, disputasRealizadas,
								EnumPuesto.DERECHO);
						equipo.anadirJugador(lateralDerecho, 4);
					} else if (opcionLateral == 2) {
						Lateral lateralIzquierdo = new Lateral(nombre, dorsal, equipo, disputasRealizadas,
								EnumPuesto.IZQUIERDO);
						equipo.anadirJugador(lateralIzquierdo, 1);
					} else {
						System.out.println("Opción incorrecta. Vuelva a empezar.");
					}

					break;

				case 4:
					System.out.print("Ingrese el nombre del jugador: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese el dorsal del jugador: ");
					dorsal = scanner.nextInt();

					System.out.println("Introduce el numero de pases completados: ");
					int pasesCompletados = scanner.nextInt();
					System.out.println("Introduce el numero de intercepciones: ");
					int intercepciones = scanner.nextInt();

					System.out.println("1. Pivote derecho");
					System.out.println("2. Pivote izquierdo");
					int opcionPivote = scanner.nextInt();

					if (opcionPivote == 1) {
						Pivote pivoteDerecho = new Pivote(nombre, dorsal, equipo, pasesCompletados, intercepciones);
						equipo.anadirJugador(pivoteDerecho, 5);
					} else if (opcionPivote == 2) {
						Pivote pivoteDerecho = new Pivote(nombre, dorsal, equipo, pasesCompletados, intercepciones);
						equipo.anadirJugador(pivoteDerecho, 6);
					} else {
						System.out.println("Opción incorrecta. Vuelva a empezar.");
					}

					break;

				case 5:
					System.out.print("Ingrese el nombre del jugador: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese el dorsal del jugador: ");
					dorsal = scanner.nextInt();

					System.out.println("Introduce el numero de pases completados: ");
					pasesCompletados = scanner.nextInt();
					System.out.println("Introduce el numero de asistencias: ");
					int asistencias = scanner.nextInt();

					Mediapunta mediapunta = new Mediapunta(nombre, dorsal, equipo, pasesCompletados, asistencias);
					equipo.anadirJugador(mediapunta, 7);

					break;

				case 6:
					System.out.print("Ingrese el nombre del jugador: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese el dorsal del jugador: ");
					dorsal = scanner.nextInt();

					System.out.println("Introduce el numero de goles: ");
					int goles = scanner.nextInt();

					System.out.println("1. Extremo derecho");
					System.out.println("2. Extremo izquierdo");
					int opcionExtremo = scanner.nextInt();

					if (opcionExtremo == 1) {
						Extremo extremoDerecho = new Extremo(nombre, dorsal, equipo, goles, EnumPuesto.DERECHO);
						equipo.anadirJugador(extremoDerecho, 8);
					} else if (opcionExtremo == 2) {
						Extremo extremoIzquierdo = new Extremo(nombre, dorsal, equipo, goles, EnumPuesto.IZQUIERDO);
						equipo.anadirJugador(extremoIzquierdo, 9);
					} else {
						System.out.println("Opción incorrecta. Vuelva a empezar.");
					}

					break;

				case 7:
					System.out.print("Ingrese el nombre del jugador: ");
					nombre = scanner.nextLine();
					System.out.print("Ingrese el dorsal del jugador: ");
					dorsal = scanner.nextInt();

					System.out.println("Introduce los goles del delantero centro: ");
					goles = scanner.nextInt();
					System.err.println("Introduce los goles de penalti del delantero: ");
					int golesPenalti = scanner.nextInt();

					DelanteroCentro delanteroCentro = new DelanteroCentro(nombre, dorsal, equipo, goles, golesPenalti);
					equipo.anadirJugador(delanteroCentro, 10);

				case 8:

					System.out.println("Creando equipo por defecto...");

					Portero portero0 = new Portero("Kameni", 1, equipo, 150);
					Central central1 = new Central("Pablo Alfaro", 2, equipo, 200, 300);
					Central central2 = new Central("Javi Navarro", 3, equipo, 250, 400);
					Lateral lateralDerecho = new Lateral("Jesús Navas", 4, equipo, 150, EnumPuesto.DERECHO);
					Lateral lateralIzquierdo = new Lateral("Dani Alves", 5, equipo, 120, EnumPuesto.IZQUIERDO);
					Pivote pivote = new Pivote("Ordaz", 6, equipo, 50, 80);
					Pivote pivote2 = new Pivote("Manolo", 23, equipo, 50, 80);
					Mediapunta mediapunta0 = new Mediapunta("Maradona", 7, equipo, 100, 30);
					Extremo extremoDerecho = new Extremo("Ronaldinho", 8, equipo, 50, EnumPuesto.DERECHO);
					Extremo extremoIzquierdo = new Extremo("Mágico González", 9, equipo, 60, EnumPuesto.IZQUIERDO);
					DelanteroCentro delanteroCentro0 = new DelanteroCentro("Castolo", 10, equipo, 25, 5);

					equipo.anadirJugador(portero0, 0);
					equipo.anadirJugador(central1, 2);
					equipo.anadirJugador(central2, 3);
					equipo.anadirJugador(lateralDerecho, 4);
					equipo.anadirJugador(lateralIzquierdo, 1);
					equipo.anadirJugador(pivote, 5);
					equipo.anadirJugador(pivote2, 6);
					equipo.anadirJugador(mediapunta0, 7);
					equipo.anadirJugador(extremoDerecho, 8);
					equipo.anadirJugador(extremoIzquierdo, 9);
					equipo.anadirJugador(delanteroCentro0, 10);

					System.out.println("Equipo por defecto creado con éxito.");
					break;

				default:
					System.out.println("Opción no válida.");
					break;
				}

				break;
			case 2:

				if (!equipo.completo()) {
					System.out.println("El equipo no está completo.");
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
