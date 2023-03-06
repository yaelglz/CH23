package testers;

import oop.clases.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println(p.nombre);
		p.setNombre("Nictes");
		System.out.println("--->" + p.getNombre());
		
		Persona p0 = new Persona("Nictez");
		System.out.println("->>>"+p0.getNombre());
		
		Persona p1 = new Persona("Abraham", 25, 1.75, 85, "Libra");
		System.out.println("->" + p1.datosPerson());
		
	}
}
