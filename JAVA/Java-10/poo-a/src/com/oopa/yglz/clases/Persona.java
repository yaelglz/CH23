package com.oopa.yglz.clases;

public class Persona {
	String nombre;
	int edad;
	int nss;
	//Atributos
	
	public Persona() {
	}//Constructor Vacio
	
	public Persona(String nombre, int edad, int nss) {
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}//Constructor Sobrecargado

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
}
