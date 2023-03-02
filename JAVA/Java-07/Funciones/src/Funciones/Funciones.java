package Funciones;

public class Funciones {

	// Las funciones se pueden declarar en cualquier lugar de la clase (si retorna algo)
	public static int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}//cierre sumar
	
	public static int resta(int num1, int num2) {
		int resultado2 = num1 - num2;
		return resultado2;
	}//cierre resta
	
	public static int multiplicacion(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}//cierre multiplicacion
	
	public static float dividir(int num1, int num2) {
		float resultado = (num1 / num2);
		return resultado;
	}//cierre dividir

	// Funcion para imprimir astericos(void)
	public static void imprimirAsteriscos() {
		System.out.println("*************************");
	}//cierre imprimirAsteriscos
	
	
	//Funcion de combina distintos tipos de valores
	public static float sumaDecimal(float valor1, int valor2) {
		int resultadoDecimal = (int) (valor1 + valor2);
		return resultadoDecimal;
		
	}
	
	//Funcion que uso Strings como argumentos
	public static String awitaDeLimon(String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
		return recetaCompletada;
	}
	
	public static void calcularAltura() {
        // Definir las variables
        double distancia = 100.0; // en metros
        double angulo = 30.0; // en grados

        // Convertir el ángulo a radianes
        double anguloRadianes = Math.toRadians(angulo);

        // Calcular la altura de la torre usando la tangente del ángulo
        double altura = distancia * Math.tan(anguloRadianes);

        // Imprimir los resultados
        System.out.println("Distancia de la torre: " + distancia + " metros");
        System.out.println("Angulo de: " + angulo + " grados");
        System.out.println("Altura de la torre: " + altura + " metros");
    }

	
	// Este motodo tiene como función, ejecutar cosas.
	public static void main(String[] args){
		
		// Las invocaciones de la funciones se hace generalmente dentro del metodo principal o main
		System.out.println("El resultado de la suma es: " + sumar(5, 8));

		imprimirAsteriscos();
		
		System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f, 5));
		
		imprimirAsteriscos();
		
		System.out.println("Estos son los pasos  para preparar aguita de limon: " + awitaDeLimon("agua ", "limon ", "azucar "));
		
		//Funciones de la biblioteca de matematicas (Math)
		
		double valorEjemplo = 7.6549784d;
		System.out.println("La raiz  cuadrada de mi valor es: " + Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de mi valor es: " + Math.sin(valorEjemplo));
		
		System.out.println("La potencia de mi valor es: " + Math.pow(valorEjemplo, 2));
		imprimirAsteriscos();
		imprimirAsteriscos();
		imprimirAsteriscos();
		imprimirAsteriscos();
		imprimirAsteriscos();
		
		calcularAltura();
		
	}//cierre metodo main

}//cierre de clase funciones

/*
Funciones:
 	-No retornan valores: No devuelve nada, no especifica nada y no usamos la palabra return 
 
 	-Si retornan valores: Se especifica el tipo de dato, el tipo de valor que regresa y se usa return para esto
  
  	- Sintaxis de las funciones que si retornan valores
    	tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  			// Cuerpo de la función
		}

    - Sintaxis de las funciones que no retornan valores
    	palabraReservada nombreDeLaFuncion(){
    		//cuerpo de la funcion
     	}
     	

 */