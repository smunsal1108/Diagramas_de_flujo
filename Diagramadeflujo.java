package Condicionales;

import java.util.Scanner;

public class Diagramadeflujo {

	public static void main(String[] args) {
		/* Día de la Semana: Desarrolla un programa que pida al usuario un número del 1 al 7 y 
		 * retorne el día de la semana correspondiente (ejemplo: 1 = Lunes, 2 = Martes, etc.). 
		 * Si el número está fuera de ese rango, muestra un mensaje de error. */ 
		Scanner teclado = new Scanner(System.in);
		int n1;
		
		System.out.print("Introduzca un número del 1 al 7: ");
		n1 = teclado.nextInt();
		
		switch (n1) {
		case 1: System.out.print("Lunes");break;
		case 2: System.out.print("Martes");break;
		case 3: System.out.print("Miercoles");break;
		case 4: System.out.print("Jueves");break;
		case 5: System.out.print("Viernes");break;
		case 6: System.out.print("Sábado");break;
		case 7: System.out.print("Domingo");break;
		default: System.out.print("ERROR.No existe ningún día con ese número."); break;
	}

}
}