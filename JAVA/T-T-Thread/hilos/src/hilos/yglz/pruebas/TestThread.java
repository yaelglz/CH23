package hilos.yglz.pruebas;

import hilos.yglz.formathread.Hilo1;

public class TestThread {

	public static void main(String[] args) {
		Thread h = new Hilo1("Yael");
		h.start();
		Thread h0 = new Hilo1("Nictes");
		h0.start();
		Thread h1 = new Hilo1("Abraham");
		h1.start();
		
		
		System.out.println(h.getState());
	}

}
