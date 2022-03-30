package MapSetVeKume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetKume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
