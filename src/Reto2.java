import java.util.Scanner;

public class Reto2 {

	// Constantes
	static final double COMISION = 10; // porcentaje
	static final double IMPUESTOS = 14; // porcentaje
	static final double PAGA_EXTRA = 700;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Datos del trabajador (null = no introducido)
		String nombre = null;
		String apellidos = null;
		String nif = null;
		String movil = null;
		String email = null;
		String cuenta = null;
		double saldo = 0;

		String opcion;
		String subopcion;
		String texto;

		do {
			System.out.println();
			System.out.println("===== MENU PRINCIPAL =====");
			System.out.println("1. Introducir datos");
			System.out.println("2. Mostrar datos");
			System.out.println("3. Gestion del saldo");
			System.out.println("4. Calculo de la nomina mensual");
			System.out.println("5. Salir");
			System.out.print("Elige una opcion: ");
			opcion = entrada.nextLine();

			switch (opcion) {
			case "1":
				// ----- SUBMENU INTRODUCIR DATOS -----
				do {
					System.out.println();
					System.out.println("--- INTRODUCIR DATOS ---");
					System.out.println("1. Nombre");
					System.out.println("2. Apellidos");
					System.out.println("3. NIF");
					System.out.println("4. Movil");
					System.out.println("5. Email");
					System.out.println("6. Cuenta bancaria");
					System.out.println("7. Volver al menu principal");
					System.out.print("Elige una opcion: ");
					subopcion = entrada.nextLine();

					switch (subopcion) {
					case "1":
						System.out.print("Nombre: ");
						texto = entrada.nextLine();
						while (!texto.matches("[a-zA-Z]+")) {
							System.out.print("Formato incorrecto (solo letras). Nombre: ");
							texto = entrada.nextLine();
						}
						nombre = texto;
						break;
					case "2":
						System.out.print("Apellidos (dos apellidos separados por un espacio): ");
						texto = entrada.nextLine();
						while (!texto.matches("[a-zA-Z]+\\s[a-zA-Z]+")) {
							System.out.print("Formato incorrecto. Apellidos: ");
							texto = entrada.nextLine();
						}
						apellidos = texto;
						break;
					case "3":
						System.out.print("NIF (8 cifras y una letra mayuscula): ");
						texto = entrada.nextLine();
						while (!texto.matches("\\d{8}[A-Z]")) {
							System.out.print("Formato incorrecto. NIF: ");
							texto = entrada.nextLine();
						}
						nif = texto;
						break;
					case "4":
						System.out.print("Movil (9 cifras, empieza por 6 o 7): ");
						texto = entrada.nextLine();
						while (!texto.matches("[67]\\d{8}")) {
							System.out.print("Formato incorrecto. Movil: ");
							texto = entrada.nextLine();
						}
						movil = texto;
						break;
					case "5":
						System.out.print("Email: ");
						texto = entrada.nextLine();
						while (!texto.matches("\\w+@\\w+\\.[a-z]{2,3}")) {
							System.out.print("Formato incorrecto. Email: ");
							texto = entrada.nextLine();
						}
						email = texto;
						break;
					case "6":
						System.out.print("Cuenta bancaria (ES y 22 cifras): ");
						texto = entrada.nextLine();
						while (!texto.matches("ES\\d{22}")) {
							System.out.print("Formato incorrecto. Cuenta bancaria: ");
							texto = entrada.nextLine();
						}
						cuenta = texto;
						break;
					case "7":
						System.out.println("Volviendo al menu principal...");
						break;
					default:
						System.out.println("Opcion no valida");
					}
				} while (!subopcion.matches("7"));
				break;

			case "2":
				// ----- MOSTRAR DATOS -----
				System.out.println();
				System.out.println("--- DATOS DISPONIBLES ---");
				if (nombre == null && apellidos == null && nif == null
						&& movil == null && email == null && cuenta == null) {
					System.out.println("No hay datos introducidos");
				}
				if (nombre != null) {
					System.out.println("Nombre: " + nombre);
				}
				if (apellidos != null) {
					System.out.println("Apellidos: " + apellidos);
				}
				if (nif != null) {
					System.out.println("NIF: " + nif);
				}
				if (movil != null) {
					System.out.println("Movil: " + movil);
				}
				if (email != null) {
					System.out.println("Email: " + email);
				}
				if (cuenta != null) {
					System.out.println("Cuenta bancaria: " + cuenta);
				}
				break;

			case "3":
				// ----- GESTION DEL SALDO -----
				System.out.println();
				System.out.println("--- GESTION DEL SALDO ---");
				System.out.println("1. Consultar saldo");
				System.out.println("2. Ingresar saldo");
				System.out.println("3. Extraer saldo");
				System.out.print("Elige una opcion: ");
				subopcion = entrada.nextLine();

				switch (subopcion) {
				case "1":
					System.out.println("Saldo actual: " + saldo + " euros");
					break;
				case "2":
					System.out.print("Cantidad a ingresar: ");
					texto = entrada.nextLine();
					while (!texto.matches("\\d+\\.?\\d*")) {
						System.out.print("Cantidad incorrecta. Cantidad a ingresar: ");
						texto = entrada.nextLine();
					}
					saldo += Double.valueOf(texto);
					System.out.println("Nuevo saldo: " + saldo + " euros");
					break;
				case "3":
					System.out.print("Cantidad a extraer: ");
					texto = entrada.nextLine();
					while (!texto.matches("\\d+\\.?\\d*")) {
						System.out.print("Cantidad incorrecta. Cantidad a extraer: ");
						texto = entrada.nextLine();
					}
					if (Double.valueOf(texto) <= saldo) {
						saldo -= Double.valueOf(texto);
						System.out.println("Nuevo saldo: " + saldo + " euros");
					} else {
						System.out.println("Saldo insuficiente. Saldo actual: " + saldo + " euros");
					}
					break;
				default:
					System.out.println("Opcion no valida");
				}
				break;

			case "4":
				// ----- CALCULO DE LA NOMINA -----
				int mes;
				int productos100, productos300, productos500;
				double ventas, comisiones, extra, sueldoBruto, impuestos, sueldoNeto;

				System.out.println();
				System.out.println("--- CALCULO DE LA NOMINA ---");

				System.out.print("Mes (1-12): ");
				texto = entrada.nextLine();
				while (!texto.matches("\\d{1,2}") || Integer.valueOf(texto) < 1 || Integer.valueOf(texto) > 12) {
					System.out.print("Mes incorrecto. Mes (1-12): ");
					texto = entrada.nextLine();
				}
				mes = Integer.valueOf(texto);

				System.out.print("Productos de 100 euros vendidos: ");
				texto = entrada.nextLine();
				while (!texto.matches("\\d+")) {
					System.out.print("Numero incorrecto. Productos de 100 euros vendidos: ");
					texto = entrada.nextLine();
				}
				productos100 = Integer.valueOf(texto);

				System.out.print("Productos de 300 euros vendidos: ");
				texto = entrada.nextLine();
				while (!texto.matches("\\d+")) {
					System.out.print("Numero incorrecto. Productos de 300 euros vendidos: ");
					texto = entrada.nextLine();
				}
				productos300 = Integer.valueOf(texto);

				System.out.print("Productos de 500 euros vendidos: ");
				texto = entrada.nextLine();
				while (!texto.matches("\\d+")) {
					System.out.print("Numero incorrecto. Productos de 500 euros vendidos: ");
					texto = entrada.nextLine();
				}
				productos500 = Integer.valueOf(texto);

				ventas = productos100 * 100 + productos300 * 300 + productos500 * 500;
				comisiones = ventas * COMISION / 100;

				if (mes == 6 || mes == 12) {
					extra = PAGA_EXTRA;
				} else {
					extra = 0;
				}

				sueldoBruto = comisiones + extra;
				impuestos = sueldoBruto * IMPUESTOS / 100;
				sueldoNeto = sueldoBruto - impuestos;

				System.out.println();
				System.out.println("Total vendido: " + ventas + " euros");
				System.out.println("Comisiones (10%): " + comisiones + " euros");
				System.out.println("Paga extra: " + extra + " euros");
				System.out.println("Sueldo bruto: " + sueldoBruto + " euros");
				System.out.println("Impuestos (14%): " + impuestos + " euros");
				System.out.println("Sueldo neto: " + sueldoNeto + " euros");
				break;

			case "5":
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("Opcion no valida");
			}
		} while (!opcion.matches("5"));
	}
}
