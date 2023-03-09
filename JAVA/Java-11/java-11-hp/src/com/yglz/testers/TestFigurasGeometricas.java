package com.yglz.testers;

import com.yglz.clases.Circulo;
import com.yglz.clases.Cuadrado;
import com.yglz.clases.FigurasGeometricas;
import com.yglz.clases.Rectangulo;
import com.yglz.clases.Triangulo;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		FigurasGeometricas rectangulo = new Rectangulo(10, 2);
		FigurasGeometricas circulo = new Circulo(2);
		FigurasGeometricas triangulo = new Triangulo(5, 2);
		FigurasGeometricas cuadrado = new Cuadrado(5);

		// FigurasGeometricas obj = new FigurasGeometricas();

		System.out.println(rectangulo.areas());
		System.out.println(circulo.areas());
		System.out.println(triangulo.areas());
		System.out.println(cuadrado.areas());

		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		System.out.println(triangulo.toString());
		System.out.println(cuadrado.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());
	}

}