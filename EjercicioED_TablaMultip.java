package Ejercicios;

import java.util.Scanner;

public class EjercicioED_TablaMultip {

	public static void main(String[] args) {
		/* Escribe un programa que solicite al usuario un número entre 1 y 10 y 
		 * muestre la tabla de multiplicar de ese número. */
		
		Scanner teclado=new Scanner(System.in);
		int numero, resultado;
		
		System.out.println("Introduzca un número entre 1 y 10: ");
		numero=teclado.nextInt();
		
			while (numero<1 || numero>10) {
				System.out.println("Numero introducido fuera del rango.");
				System.out.println("Introduzca un número entre 1 y 10: ");
				numero=teclado.nextInt();		
			}
			for (int i=0; i<=10; i++) {
				resultado=numero*i;
				System.out.println(numero + " x " + i + " = "+resultado);
			}
	}

}
