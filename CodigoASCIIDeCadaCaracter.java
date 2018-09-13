package com.java.exercise.ejerciciosbasicos3;

public class CodigoASCIIDeCadaCaracter {
	/*
	 * 24) Recorre el String del ejercicio 22 y transforma cada carácter a su código
	 * ASCII. Muestralos en linea recta, separados por un espacio entre cada
	 * carácter.
	 */

	public static void main(String[] args) {

		String frase = "Vamos a calcular el código ASCII de cada caracter.";

		// recorremos el string, codePointAt nos devuelve el codigo en la tabla ASCII
		// del caracter pasado por parametro, en este caso queremos todos
		for (int i = 0; i < frase.length(); i++) {
			System.out.print(frase.charAt(i) + "" + frase.codePointAt(i) + " ");

		}
	}

}
