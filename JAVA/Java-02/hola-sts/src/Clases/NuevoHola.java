package Clases;
public class NuevoHola {
			
	private String nombre;
	/*Para inicializar la variable (objeto de tipo String)
	 usamos en metodo constructor*/

	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludo() {
		System.out.println("Hola nuevamente desde STS " + this.nombre);
	}
	
	public void saludoConNombre(String nombre) {
		System.out.print("Hola tu eres: " + nombre);
	}
	
}
