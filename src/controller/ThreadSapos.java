package controller;
public class ThreadSapos extends Thread{
	
	int i;
	int tamanhoSalto=0;
	int distanciaAtual=0;
	public static final int percurso = 500; // Tamanho máximo do percurso, em metros
	
	public ThreadSapos(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		iniciarCorrida();
	}
	
	public void iniciarCorrida() {
		
		long tempo = System.currentTimeMillis();
		
		do{
			tamanhoSalto = (int) (Math.random()*26); 
			distanciaAtual += tamanhoSalto;
			System.out.println("Distancia do sapo ("+Thread.currentThread().getId()+") = "+distanciaAtual);
			System.out.println("Tamanho do salto = "+tamanhoSalto);
			try {
				Thread.sleep(i*500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		while(distanciaAtual < percurso);
		
		long tempoFinal = System.currentTimeMillis();
		tempoFinal = tempoFinal - tempo;
		System.out.println("Sapo "+Thread.currentThread().getId()+" finalizou a corrida em :"+tempoFinal/1000+"s");
	}
}
