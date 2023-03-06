package testers;

import oop.clases.Fecha;

public class TestFecha {
	public static void main(String[] args) {
		Fecha f = new Fecha();
		f.setDia(06);
		f.setMes(03);
		f.setAño(2023);
		
		System.out.println(f.diaMesAño());
		System.out.println("-->" + f.toString());
	}
}
