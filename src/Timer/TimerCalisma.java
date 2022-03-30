package Timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;

public class TimerCalisma {
	static int sayac = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			public void run() {
				if (sayac==10)
					t.cancel();
				System.out.println(sayac);
				sayac++;
			}
		};
		
		t.schedule(tt, 0,600);
	}

}
