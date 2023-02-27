package tiposDeDatosYVariable;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//Conversion de fahrenheit a kelvin y celsius
		double fahrenheit = 50;
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
        System.out.println("Celsius: " + celsius);
        
        //Verificar si un numero es par o impar
        int num;
        Scanner sc = new Scanner(System.in); //Para leer datos por teclado
        System.out.println("Introduce un numero");
        num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
	}
}