package com.java.exercise.ejerciciosbasicos3;

import java.util.Scanner;

public class ConcatenarString {

	public static void main(String[] args) {

		/*
		 * 29) Pedir al usuario que nos escriba frases de forma infinita hasta
		 * que insertemos una cadena vacia. Mostrar la cadena resultante
		 */

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String frases;
		String allFrases = "";
		do {
			System.out.println("Escribe frases:");
			frases = sc.nextLine();
			// usamos el metodo concat de la clase String para concatenar todas las frases introducidas
			allFrases = allFrases.concat(" " + frases + " ");
		} while (!frases.isEmpty());

		System.out.println("Resultado: " + allFrases);

	}

}
