package control;

import java.util.Scanner;

public class OrdenTres {
	public void MayorAMenor() {
		Scanner dato = new Scanner(System.in);
		System.out.println("Ordenar de mayor a menor\nIngresa el primer valor");
		int num1 = dato.nextInt();
		System.out.println("Ingresa el segundo valor");
		int num2 = dato.nextInt();
		System.out.println("Ingresa el tercer valor");
		int num3 = dato.nextInt();
		if (num1 > num2 && num1 > num3) { // Si num1 es mayor que num2 y num3, entonces num1 es el mayor, se comparan num2 y num3 para saber cual es el segundo y tercero.
			if (num2 > num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			} else {
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println(num2 + " " + num1 + " " + num3);
			} else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				System.out.println(num3 + " " + num1 + " " + num2);
			} else {
				System.out.println(num3 + " " + num2 + " " + num1);
			}
		}
	}
}
