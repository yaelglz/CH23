package ciclos.forwhiledo;

public class UsoFor {
	
	public void cicloFor() {
		System.out.println("Uso del ciclo For");
		for (int i = 0; i < 10; i++) {
			System.out.println("El iterador --->" + i);	
		}
	}
	
	public void letrasFor() {
		System.out.println("Uso del ciclo For letras");
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print("Soy -->" + i + ", ");
			char letra = (char) i;
			System.out.println("");
			System.out.print("Soy --->" + letra + ", ");
		}

	}
	
}
