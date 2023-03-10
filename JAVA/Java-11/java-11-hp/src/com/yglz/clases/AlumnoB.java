package com.yglz.clases;

public class AlumnoB extends PersonaP {
	private int matriucula;
	private double promedio;

	public AlumnoB(int matriucula, double promedio, String nombre, int edad) {
		super(nombre, edad);
		this.matriucula = matriucula;
		this.promedio = promedio;
	}

	public int getMatriucula() {
		return matriucula;
	}

	public void setMatriucula(int matriucula) {
		this.matriucula = matriucula;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "AlumnoB [matriucula=" + matriucula + ", promedio=" + promedio + "]";
	}
	
	public void mostrarDatos() {
		System.out.println(this.getNombre() + " " + this.getEdad() + " " + this.matriucula + " " + this.promedio);

	}

	public void mostrarDatos(String apellido) {
		System.out.println(this.getNombre() + " " + apellido + " " + this.getEdad() + " " + this.matriucula + " " + this.promedio);

	}
}
