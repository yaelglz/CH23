package com.yglz.clases;

public class AlumnoB extends PersonaP{
	private int matriucula;
	private double promedio;

	public AlumnoB(int matriucula, double promedio) {
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

}
