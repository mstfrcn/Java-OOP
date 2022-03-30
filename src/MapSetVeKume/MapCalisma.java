package MapSetVeKume;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MapCalisma {
	
	static String yaziyaCevir(String sayi) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0,"");
		hm.put(1, "bir");
		hm.put(2, "iki");
		hm.put(3, "uc");
		hm.put(4, "dort");
		hm.put(5, "bes");
		hm.put(6, "alti");
		hm.put(7, "yedi");
		hm.put(8, "sekiz");
		hm.put(9, "dokuz");
		
		HashMap<Integer,String> hm2 = new HashMap<>();
		hm2.put(1, "on");
		hm2.put(2, "yirmi");
		hm2.put(3, "otuz");
		hm2.put(4, "kirk");
		hm2.put(5, "elli");
		hm2.put(6, "altmis");
		hm2.put(7, "yetmis");
		hm2.put(8, "seksen");
		hm2.put(9, "doksan");
		int ob = Integer.parseInt(Character.toString(sayi.charAt(0)));
		int bb = Integer.parseInt(Character.toString(sayi.charAt(1)));
		String sonuc = hm2.get(ob)+" " + hm.get(bb);
		return sonuc;
	}

	public static void main(String[] args) {
		
		
		HashSet<Integer> aKumesi = new HashSet<>(Arrays.asList(1,3,4,8,9));
		HashSet<Integer> bKumesi = new HashSet<>(Arrays.asList(2,4,6,7,8));
		
		/*  BIRLESIM
		aKumesi.addAll(bKumesi);
		System.out.println(aKumesi);
		*/
		/*  KESISIM
		aKumesi.retainAll(bKumesi);
		System.out.println(aKumesi);
		*/
		aKumesi.removeAll(bKumesi);
		System.out.println(aKumesi);
		
		
		
		
	}

}
