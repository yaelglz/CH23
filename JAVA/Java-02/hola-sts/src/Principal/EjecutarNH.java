package Principal;
import java.util.Scanner;
import Clases.NuevoHola;

public class EjecutarNH {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		NuevoHola nh = new NuevoHola("Yael");
		nh.saludo();
		
		String nombre;
		System.out.println("Ingresa tu nombre: ");
		nombre = sn.next();
		NuevoHola nh1 = new NuevoHola("");
		nh1.saludoConNombre(nombre);
	}
	
}