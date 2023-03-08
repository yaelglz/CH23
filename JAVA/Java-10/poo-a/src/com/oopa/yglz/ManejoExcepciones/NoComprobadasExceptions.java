package com.oopa.yglz.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.print("Ingresa un valor");
		int divisor;
		try {
			divisor = Integer.parseInt(dato.next());
			int division = 10 / divisor;
			System.out.println("--->" + division);

		} catch (ArithmeticException e) {
			System.out.println("Capturano la exception" + e.getMessage());
		} catch (NumberFormatException nfe) {
			System.out.println("El dato es un caracter - " + nfe.getMessage());
		} finally {
			System.out.println("Este bloque es opcional y se va a ejecutar con o sin la exception");
		}
		
		System.out.println("Continuamos con el flujo de la aplicación");
	}
}
