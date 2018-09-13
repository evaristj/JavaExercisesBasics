package com.java.exercise.ejerciciosbasicos3;

import java.util.Scanner;

public class SumaNumerosSeguidos {

	public static void main(String[] args) {

		/*
		 * 26) Realizar la suma desde el 1 hasta el numero que indiquemos, este debe ser
		 * mayor que 1.
		 */

		System.out
				.println("Vamos a sumar todos los numeros desde el 1 hasta el numero que introduzcas, incluido este ultimo:");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double suma = 0;
		double numero = sc.nextDouble();

		if (numero < 1) {
			System.out.println("Numero no valido.");
			
		} else if (numero >= 1) {
			
			for (double i = 1; i <= numero; i++) {
				suma += i;
			}

			System.out.println("La suma es: " + suma);
		}

	}

}
