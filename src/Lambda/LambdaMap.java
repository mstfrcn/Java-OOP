package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = Arrays.asList(0,2,3,8,5,1,2,7);
		System.out.println(liste);
		
		List<Integer> l1 = liste.stream().map(p->p+3).collect(Collectors.toList());
		System.out.println(l1);
		
		//map þart ifadesi
		List<Integer> l = liste.stream().map(p->p%2==0?p/2:p+1).collect(Collectors.toList());
		System.out.println(l);
		
		
		

	}

}
	