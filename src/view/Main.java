package view;
import controller.ThreadSapos;

public class Main {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			Thread t = new ThreadSapos(i);
			t.start();
		}
		
	}
}
