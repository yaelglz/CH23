package tiposDeDatosYVariable;

public class TiposDeDatosYVarible {
	  public static void main(String[] args) {
		    
		  byte centigrados = 1;
		  double fahrenheit = (centigrados * 1.8) + 32;
	      double kelvin = centigrados + 273.15;

	      System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

	      System.out.println("1 centigrado a kelvin es" + kelvin);

	      /*
	         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
	         * ºC + 273.15
	         */
	      
	      byte horasTrabajadas = 8;
	      byte pago = 10;
	      int multiplicacion = horasTrabajadas * pago;
	      
	      System.out.println(multiplicacion);
	      
	      double num = 1.73;
	      System.out.println(num);
	      int numInt = (int)num;
	      System.out.println(numInt);
	      long numLong = (long)num;
	      System.out.println(numLong);
	      
	    //string

	      String cantidad = "15";
	      String precio = "115.20";


	      int cantEntero = Integer.parseInt(cantidad);  
	      double precioDouble = Double.parseDouble(precio);


	      System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

	       

	      int edad = 30;
	      double estatura = 1.61;
	       

	      String edadString = String.valueOf (edad);
	      String estaturaString = String.valueOf (estatura); 

	      System.out.println("Edad: " + edadString + estatura + estaturaString);
	      
	      int numero1 = 5;
	      int numero2 = 7;
	      int numero3 =12;
	        
	      int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
	      int resta = numero1 - numero2 - numero3; //esperamos -14
	      int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
	      int división = numero2 / numero1; //operador /, esperamos 1,4
	      int modulo = numero2 % numero1; //operador %, esperamos un 2
	      int incremento = ++numero3;
	      int decremento= --numero2;
	        
	      System.out.println("La suma es: "+ suma);
	      System.out.println("La resta es: "+ resta);
	      System.out.println("La multiplicación es: "+ multiplicación);
	      System.out.println("La división es: "+ división);
	      System.out.println("La modulo es: "+ modulo);
	      System.out.println("El incremento es: "+ incremento);
	      System.out.println("El decremento: "+ decremento);
	      
	      float num1 = 3;
	      float num2 = 2;
	      float num3 = 2;
	      float num4 = 5;
	      float sumaf = num1 + num2;
	      float multiplicaciónf = num3 * num4;
	      float divisiónf = sumaf / multiplicaciónf;

	      System.out.println(sumaf);
	      System.out.println(multiplicaciónf);
	      System.out.println(divisiónf);
	      
	      

	  }
}
