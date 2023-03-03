package colecciones.yagm;

import java.util.*;


public class MisCollection {

	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		//wrapperClass();
		//MisCollection c = new MisCollection();
		//imprimir(c.listaCollections());
		//imprimir(c.setCollections());
		mapCollection();
	}
	
	private static void mapCollection() {
		Map miMap = new HashMap();
		miMap.put("valor1", "Yael");
		miMap.put("valor2", "Abraham");
		miMap.put("valor3", "Molly");
		miMap.put("valor4", "Nictes");
		
		//miMap.clear();
		miMap.remove("valor3");
		imprimir(miMap.values());
		imprimir(miMap.keySet());
		//return miMap;
		
	}
	

	
	
	Set setCollections() {
		Set miSet = new HashSet();
		System.out.println("---->" + miSet.isEmpty());
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		System.out.println("->" + miSet.hashCode());
		
		return miSet;
	}
	
	private List listaCollections() {
		List miLista = new ArrayList();
		System.out.println(miLista + " Tamaño de la lista antes - " + miLista.size());
		System.out.println("¿Está vacia? " + miLista.isEmpty());
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(0,"Nictes");
		
		miLista.set(0,miLista);
		miLista.remove(0);
		System.out.println(miLista + " Tamaño de la lista despues - " + miLista.size());
		System.out.println("¿Está vacia? " + miLista.isEmpty());
		boolean z = miLista.contains(2);
		System.out.println("--->" + z);
		return miLista;
	}
	
	public static void imprimir(Collection collection) {
		for(Object elementos : collection) {
			System.out.println("Elemento " + elementos);
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
