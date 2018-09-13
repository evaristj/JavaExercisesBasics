package com.java.exercise.ejerciciosbasicos3;

import java.util.Scanner;

public class ReemplazaEspacios {

	public static void main(String[] args) {
		/*
		 * 28) Eliminar los espacios de una frase pasada por consola por el usuario.
		 */

		System.out.println("Vamos a eliminar los espacios en blanco de la frase que introduzcas: ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();

		// el metodo replace ya es algo que hemos utilizado antes, reemplaza lo que le
		// indiquemos por parametro
		System.out.println(frase.replace(" ", ""));
	}

}
