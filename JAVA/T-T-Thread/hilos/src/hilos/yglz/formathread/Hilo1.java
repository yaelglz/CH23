package hilos.yglz.formathread;

import java.util.Iterator;

public class Hilo1 extends Thread{
	
	public Hilo1(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Se inicia el Thread o Hilo" + this.getName());
		
		for(int i = 0; i< 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("Termina en Hilo o Thread" + this.getName());
	}
}
