package view;
import java.util.concurrent.Semaphore;

import controller.SistemaCompra;

public class Bilheteria {
	public static void main(String[] args) {
		int compradores = 300;
		Semaphore semaforo_validacao = new Semaphore(1);
		for(int i=0; i < compradores; i++) {
			int numero_ingressos = (int) ((Math.random() * 4) + 1);
			new SistemaCompra(numero_ingressos, semaforo_validacao).start();
		}
	}
}
