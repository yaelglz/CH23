package colecciones.yagm;

import java.util.*;


public class MisCollection {

	public static void main(String[] args) {
		wrapperClass();

	}
	
	public void listasCollections() {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		

	}
	
	public void imprimir(Collection collection) {
		for(Objet elementos : collection) {
			
		}
	}
	
	
	static void wrapperClass() {
		System.out.println("Byte");
		byte numeroB = -128;
		System.out.println("Tamaño de un byte: " + Byte.SIZE);
		System.out.println("Valor Max: " + Byte.MAX_VALUE);
		System.out.println("Valor Min: " + Byte.MIN_VALUE);
		System.out.println("---> " + numeroB);

		System.out.println("Integer");
		int numeroI = -2147483648;
		System.out.println("Tamaño de un entero bytes: " + Integer.BYTES);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Max: " + Integer.MAX_VALUE);
		System.out.println("Valor Min: " + Integer.MIN_VALUE);
		System.out.println("---> " + numeroI);

		System.out.println("Short");
		short numeroS = 32767;
		System.out.println("Tamaño de un entero bytes: " + Short.BYTES);
		System.out.println("Tamaño de un entero: " + Short.SIZE);
		System.out.println("Valor Max: " + Short.MAX_VALUE);
		System.out.println("Valor Min: " + Short.MIN_VALUE);
		System.out.println("---> " + numeroS);

		System.out.println("Long");
		long numeroL = 922337203;
		System.out.println("Tamaño de un entero bytes: " + Long.BYTES);
		System.out.println("Tamaño de un entero: " + Long.SIZE);
		System.out.println("Valor Max: " + Long.MAX_VALUE);
		System.out.println("Valor Min: " + Long.MIN_VALUE);
		System.out.println("---> " + numeroL);

		System.out.println("Float");
		float numeroF = 1111111111;
		System.out.println("Tamaño de un entero bytes: " + Float.BYTES);
		System.out.println("Tamaño de un entero: " + Float.SIZE);
		System.out.println("Valor Max: " + Float.MAX_VALUE);
		System.out.println("Valor Min: " + Float.MIN_VALUE);
		System.out.println("---> " + numeroF);

	}

}
