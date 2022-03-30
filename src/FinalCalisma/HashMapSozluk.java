package FinalCalisma;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapSozluk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer , String > sozluk = new HashMap<>();
		sozluk.put(1, "bir");
		sozluk.put(2, "iki");
		sozluk.put(3, "uc");
		sozluk.put(4, "dort");
		sozluk.put(5, "bes");
		sozluk.put(6, "alti");
		sozluk.put(7, "yedi");
		sozluk.put(8, "sekiz");
		sozluk.put(9, "dokuz");
		sozluk.put(0, "");
		
		HashMap<Integer, String> sozluk2 = new HashMap<>();
		sozluk2.put(1, "on");
		sozluk2.put(2, "yirmi");
		sozluk2.put(3, "otuz");
		sozluk2.put(4, "kirk");
		sozluk2.put(5, "elli");
		sozluk2.put(6, "altmis");
		sozluk2.put(7, "yetmis");
		sozluk2.put(8, "seksen");
		sozluk2.put(9, "doksan");
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		String sayi = scan.nextLine();
		String sonuc="";
		sonuc+= sozluk2.get(Integer.parseInt(Character.toString(sayi.charAt(0)))) +" "+  sozluk.get(Integer.parseInt(Character.toString(sayi.charAt(1))));
		System.out.println(sonuc);
		
		
		
		
		
	}

}
