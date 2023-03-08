package com.oopa.yglz.mains;

import com.oopa.yglz.clases.AreaPerimetro;
import com.oopa.yglz.clases.FigurasGeometricas;

public class testAreaPerimetro {

	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("El area cuadrado: " + fg.getArea());
		
		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("El perimetro del cuadrado es: " + fg.getPerimetro());
		
		fg.setPerimetro(ap.perimetroCirculo(5));
		System.out.println("El perimetro del circulo es: " + fg.getPerimetro());
		
		fg.setArea(ap.areaCirculo(5));
		System.out.println("El area del circulo es: " + fg.getArea());
	}

}