package Timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerCalisma2 {
	
	static TimerTask g1;
	static TimerTask g2;
	static int sayac = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		
		g1 = new TimerTask() {
			public void run() {
				if (sayac == 15) {
					t.schedule(g2, 0,500);
					g1.cancel();
				}
				sayac++;
				System.out.println("G1");
			}
		};
		
		g2 = new TimerTask() {
			public void run() {
				if (sayac == 30) {
					g2.cancel();
				}
				sayac++;
				System.out.println("G2");
			}
		};
		
		t.schedule(g1, 0,500);
	}

}
