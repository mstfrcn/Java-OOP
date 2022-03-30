package FinalCalisma;

import java.util.Timer;
import java.util.TimerTask;

public class thread {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				int sayac = 0;
				while(1000>sayac)
					System.out.println("A");
				sayac++;
					
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				int sayac = 0;
				while(1000>sayac)
					System.out.println("B");
				sayac++;
			}
		});
		
		t.start();
		t2.start();
	}

}
