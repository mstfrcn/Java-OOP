package FinalCalisma;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class HashSetCalisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>(Arrays.asList(3,4,6,7,8,9));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		/* Birlesim
		set.addAll(set2);
		System.out.println(set);
		*/
		
		
		
		/*  KESISIM
		set.retainAll(set2);
		System.out.println(set);
		*/
		
		
		// FARK
		set2.removeAll(set);
		System.out.println(set2);
		
		
	}

}
