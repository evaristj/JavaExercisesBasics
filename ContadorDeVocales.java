package com.java.exercise.ejerciciosbasicos3;

public class ContadorDeVocales {

	public static void main(String[] args) {

		/*
		 * 22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta
		 * cuantas vocales hay en total (recorre el String con charAt).
		 */

		String frase = "Esto es un ejercicio basico de java para aprender conceptos basicos.";

		int vocales = 0;

		// utilizamos el metodo charAt de la clase String, para sacar el caracter deseado
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
					|| frase.charAt(i) == 'u') {

				vocales++;
			}
		}
		// le sumamos 1 al resultado final porque java cuenta el cero.
		System.out.println("La frase tiene " + (vocales+1) + " vocales.");

	}

}
