package FinalCalisma;

import java.util.Timer;
import java.util.TimerTask;

public class timer {
static Timer t; 
static TimerTask t1;
static TimerTask t2;
static int sayac;
	public static void main(String[] args) {
		t = new Timer();
		t1 = new TimerTask() {
			public void run() {
				System.out.println(" G1 ");
				sayac++;
				if(sayac>=5) {
					t1.cancel();
					t.schedule(t2, 0,400);
				}
			}
		};
		
		t2 = new TimerTask() {
			public void run() {
				System.out.println(" G2 ");
				sayac++;
				if(sayac>=10) {
					t.cancel();
				}
			}
		};
		t.schedule(t1, 0,400);
		
		
		
		
		
		
		TimerTask tt1 = new TimerTask() {
			public void run() {
				
			}
		};
		
		
		Thread thread = new Thread(new Runnable() {
			public void run() {
				
			}
		});
		
		System.out.println(1%4);
		
		
		
	}

}
