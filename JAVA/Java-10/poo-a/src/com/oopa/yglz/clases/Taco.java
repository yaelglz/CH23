package com.oopa.yglz.clases;

public class Taco {
	public String tipoDeTortilla;
    public String guisado;
    public int numeroDeTortilla;
    public String tamañoDeTortilla;
    public float precio;
    
	public Taco() {
	}
	
	public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamañoDeTortilla, float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamañoDeTortilla = tamañoDeTortilla;
		this.precio = precio;
	}

	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public String getGuisado() {
		return guisado;
	}
	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}
	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}
	public String getTamañoDeTortilla() {
		return tamañoDeTortilla;
	}
	public void setTamañoDeTortilla(String tamañoDeTortilla) {
		this.tamañoDeTortilla = tamañoDeTortilla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
