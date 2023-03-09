package com.yglz.clases;

public class Suma implements OperacionesAritmeticas, Mensajes{
	private double a;
	private double b;
	
	
	public Suma(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double sumar() {
		return this.a + this.b;
	}

	@Override
	public double restar() {
	    return this.a - this.b;
	}

	@Override
	public double multiplicacion() {
		return this.a * this.b;
	}
	
	@Override
	public double division() {
		return this.a / this.b;
	}
	
	@Override
	public void mensaje() {
		System.out.println("Hey, wake up!");
	}

	public Suma() {
	}

}