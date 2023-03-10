package hilos.yglz.pruebas;

import hilos.yglz.formarunnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		Hilo2 h2 = new Hilo2("Yael");
		Thread st = new Thread(h2);
		
		
		st.start();
		
		new Thread(new Hilo2("Nictes")).start();
	}

}