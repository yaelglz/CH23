package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	public void controlIF() {
		/*
		if (condition) {
			
		}*/
	//Primer IF
		long nota = 5;
		if(nota > 5){
			System.out.println("Nota aprobada " + nota);
		}
		System.out.println("Continua el control de flujo...");
	//Segundo IF
		if (nota >= 5) {
			System.out.println("Nota aprobada " + nota);
		} else {
			System.out.println("Nota no aprobada " + nota);
		}
	}
	public void divisible() {
		System.out.print("Verificar si el primer valor es divisible entre el segundo\nIngresa el primer valor: ");
		int dato1 = entrada.nextInt();
		System.out.print("Ingresa el segundo valor: ");
		int dato2 = entrada.nextInt();
		 if (dato1 % dato2 == 0) {
	            System.out.println(dato1 + " - El primer valor es divisible entre el segundo - " + dato2);
		 } else {
	            System.out.println(dato1 + " - El primer valor no es divisible entre el segundo - " + dato2);
		 }

	}
	public void compara() {
		System.out.print("Ingresa el primer valor: ");
		int valor1 = entrada.nextInt();
		System.out.print("Ingresa el segundo valor: ");
		int valor2 = entrada.nextInt();
		if (valor1 > valor2) {
            System.out.println("El primer valor es mayor que el segundo");
        } else {
            System.out.println("El segundo valor es mayor que el primero");
        }
	}
	
	public void anidado() {
		System.out.println("Introduzca un primer numero: ");
		int mayor1 = entrada.nextInt();
		if (mayor1 > 0) {
			System.out.println("Numero postivo " + mayor1);
		} else if (mayor1 < 0) {
			System.out.println("Numero negativo " + mayor1);
		} else {
			System.out.println("Numero igual a cero");
		}
	}
}
