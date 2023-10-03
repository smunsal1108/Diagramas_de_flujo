import java.util.Scanner;

public class EC_Secuencial {

	public static void main(String[] args) {
		/*
		 * Desarrolla un programa en Java que solicite al usuario su nombre y apellido
		 * por separado. A continuación, el programa debe mostrar un mensaje que diga
		 * "¡Hola [nombre] [apellido]!".
		 */

		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;

		System.out.print("Introduzca su nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Introduzca su apellido: ");
		apellido = teclado.nextLine();

		System.out.print("Hola " + nombre + " " + apellido);
	}

}
