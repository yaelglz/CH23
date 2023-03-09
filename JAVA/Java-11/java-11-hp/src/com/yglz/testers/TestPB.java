package com.yglz.testers;

import com.yglz.clases.AlumnoB;
import com.yglz.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		AlumnoB a = new AlumnoB(123, 8.5, "Yael", 25);
		PersonaP b = new PersonaP("Yael", 25);

		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.getMatriucula());
		System.out.println(a.getEdad());
		System.out.println(a.toString());

		System.out.println(b.toString());
		a.mostrarDatos();
		a.mostrarDatos("Nictes");
	}

}
