package com.java.exercise.ejerciciosbasicos3;

public class CalcularNumerosPrimosBis {

	public static void main(String[] args) {
		/*
		 * Otra forma de calcular los numeros primos en java, tanto esta como la otra,
		 * van a dar los mismos resultados. La que quieras utilizar ya depende de lo
		 * optimizado que quieras tu aplicación, seguramente te convenga utilizar esta
		 * que consume menos memoria.
		 */

		System.out.println("Muestra los números primos entre 1 y 100.");

		for (int i = 1; i <= 1000; i++) {
			// calculamos la raiz cuadrada del numero que toque recorrer de i
			// redondeamos con el casting a (int) para quitar decimales
			int raiz = (int) Math.sqrt(i);
			int contador = 0;
			// con el resultado de la raiz cuadrada, la recorremos hasta que valga menos que
			// 1
			// y con el siguiente if vamos calculando si el resto da cero
			for (int j = raiz; j > 1; j--) {
				// si el resto da cero más de una vez, quiere decir que ese número no es primo
				// al no cumplir la regla de numeros primos (un numero es primo si solo es
				// divisible por 1 y por si mismo)
				if (i % j == 0) {
					contador++;
				}
			}
			// si el contador no ha sumado más de 1, ese numero es primo
			if (contador < 1) {
				System.out.println(i);
			}

		}
	}
}
