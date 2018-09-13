package com.java.exercise.ejerciciosbasicos3;

import java.util.Scanner;

public class ContadorNumeros {

	public static void main(String[] args) {

		/*
		 * 27) Crear una aplicación que nos permite insertar números hasta que
		 * insertemos un -1. Calcular el numero de números introducidos.
		 */

		System.out.println("Calculo de numeros introducidos. Para terminar introduce -1:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double numero;
		// inicializamos la variable numbers en -1 porque no queremos que cuente cuando
		// introducimos el -1 para detener la app
		double numbers = -1;

		do {
			System.out.println("Introduce un número positivo.");
			numero = sc.nextInt();
			// por cada numero introducido, el contador llamado numbers, sumara uno
			numbers++;
		} while (numero != -1);

		System.out.println("Los numeros introducidos son: " + numbers);

	}

}
