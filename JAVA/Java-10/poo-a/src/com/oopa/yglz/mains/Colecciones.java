package com.oopa.yglz.mains;

import java.util.*;

public class Colecciones {

	public static void main(String[] args) {

		ArrayList <String> coleccion = new ArrayList<String>();
		coleccion.add("Colecciones");
		coleccion.add("Slys");
		/*coleccion.add(13);
		coleccion.add(15.15);
		coleccion.add('a');*/

		for (int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));

		}
	}
}
