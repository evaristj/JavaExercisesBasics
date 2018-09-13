package com.java.exercise.ejerciciosbasicos3;

import java.util.Scanner;

public class CalcularNumerosPrimos {
	/*
	 * 20) Pide un numero por teclado e indica si es un numero primo o no. Un buen
	 * truco para calcular la raiz cuadrada del numero es ir comprobando que si es
	 * divisible desde ese numero hasta 1. NOTA: Si se introduce un numero menor o
	 * igual que 1, directamente es no primo.
	 */

	public static void main(String[] args) {

		System.out.println("Vamos a ver si un nº es primo o no.\nIntroduce un nº:");

		// creamos la variable con la que contaremos las veces que el numero ha sido
		// divisible entre 2, desde 1, hasta el numero introducido
		int contador = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int primo = sc.nextInt();

		// recorremos todos los numeros desde 1 hasta el nº introducido
		for (int i = 1; i <= primo; i++) {
			if (primo % i == 0) {
				// si el numero es divisible por un numero desde 1 hasta el nº introducido, y el
				// resto es cero, el contador suma
				contador++;
			}
		}

		// siguiendo la regla matemática de numeros primos, si el numero introducido
		// solo es divisible entre 1 y el propio numero, es primo, si no, no es primo
		if (contador <= 2) {
			System.out.println(primo + " Es un numero primo.");
		} else {
			System.out.println(primo + " No es un numero primo.");
		}

	}
}
