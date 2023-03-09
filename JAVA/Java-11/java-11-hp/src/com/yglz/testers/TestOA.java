package com.yglz.testers;

import com.yglz.clases.Mensajes;
import com.yglz.clases.OperacionesAritmeticas;
import com.yglz.clases.Suma;

public class TestOA {

	public static void main(String[] args) {
		Suma s = new Suma(5, 2);
		OperacionesAritmeticas ss = new Suma(10,3);
		Mensajes sss = new Suma();
		
		System.out.println("Suma: " + s.sumar());
		System.out.println("Operaciones Aritmeticas Suma  - " + ss.sumar());
		System.out.println("Resta: " + s.restar());
		System.out.println("Operaciones Aritmeticas Resta - " + ss.restar());
		System.out.println("Multitplicacion: " + s.multiplicacion());
		System.out.println("Operaciones Aritmeticas Multiplicacion - " + ss.multiplicacion());
		System.out.println("Division: " + s.division());
		System.out.println("Operaciones Aritmeticas Division - " + ss.division());
		s.mensaje();
		sss.mensaje();
	}

}
