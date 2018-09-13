package com.java.exercise.ejerciciosbasicos3;

public class ReemplazarCaracteres {
	/*
	 * Reemplaza todas las a de un String por una e.
	 */

	public static void main(String[] args) {

		String frase = "Vamos a operar a una gata.";

		// en este caso usamos el metoddo replace de la clase String, el primer
		// parametro es el que queremos reemplazar, el segundo por el que queremos
		// reemplazar. También podríamos usar un if como en el contador de vocales, pero
		// esto nos ahorra codigo
		System.out.println(frase.replace('a', 'e'));

	}
}