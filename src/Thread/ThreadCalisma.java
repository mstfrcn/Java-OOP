package Thread;

public class ThreadCalisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<1000; i++)
					System.out.print("A"+" ");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<1000; i++)
					System.out.print("B"+" ");
			}
		});
		
		t1.start();
		t2.start();
	}

}
