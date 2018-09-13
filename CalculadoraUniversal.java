package com.java.exercise.ejerciciosbasicos3;

import java.util.Scanner;

public class CalculadoraUniversal {

	public static void main(String[] args) {

		/*
		 * 25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2
		 * operandos (int) y un signo aritmético (String), según este último se
		 * realizara la operación correspondiente. Al final mostrara el resultado en un
		 * cuadro de dialogo. Los signos aritméticos disponibles son: +: suma los dos
		 * operandos. -: resta los operandos. : multiplica los operandos. /: divide los
		 * operandos, este debe dar un resultado con decimales (double) ^: 1º operando
		 * como base y 2º como exponente. %: módulo, resto de la división entre
		 * operando1 y operando2.
		 */

		System.out.println("Calculadora Universal");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double resultado = 0;

		// capturamos los posibles errores en caso de no introducir el caracter correcto
		// en cada momento
		try {
			System.out.println("Escribe el primer numero.");
			double numeroA = sc.nextDouble();

			System.out.println("Escribe el operando: +, -, *, /, %, ^.");
			String operacion = sc.next();

			if (operacion.equals("+") | operacion.equals("-") | operacion.equals("*") | operacion.equals("/")
					| operacion.equals("%") | operacion.equals("^")) {
				System.out.println("Escribe el segundo numero.");
				double numeroB = sc.nextDouble();

				switch (operacion) {
				case "+":
					resultado = numeroA + numeroB;
					break;
				case "-":
					resultado = numeroA - numeroB;
					break;
				case "*":
					resultado = numeroA * numeroB;
					break;
				case "/":
					resultado = numeroA / numeroB;
					break;
				case "%":
					resultado = numeroA % numeroB;
					break;
				case "^":
					resultado = (int) Math.pow(numeroA, numeroB);
					break;
				}

				System.out.println(numeroA + " " + operacion + " " + numeroB + " = " + resultado);

			} else {
				System.out.println("No has introducido un operando correcto.");
			}

		} catch (

		Exception e) {
			System.out.println("No has introducido un carácter válido: " + e.getMessage());
		}
	}
}
