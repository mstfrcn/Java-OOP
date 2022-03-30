package FinalCalisma;

import java.util.Scanner;

public class TryCatchFinallyThrowException {
	
	int topla(int a, int b) {
		
		try {
			int bSayi = a+b;
			if(bSayi <20) {
				throw new ArithmeticException("hata sayi 20 den kucuk olmali");
			}
			Scanner scan = new Scanner(System.in);
			System.out.println("Sayi giriniz");
			int iSayi = scan.nextInt();
			
			System.out.println("Sonuc: "+(bSayi+iSayi));
			
			
		} catch (Exception e) {
			System.out.println(e+"Hata oldu");
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchFinallyThrowException t = new TryCatchFinallyThrowException();
		System.out.println(t.topla(15,5));
		

	}

}
