package FinalCalisma;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> liste = Arrays.asList(2,3,4,5,6,7,8);
		List<Integer> l = liste.stream().map(p -> p+3).collect(Collectors.toList());
		System.out.println(l);
		
		List<Integer> l1 = liste.stream().map(p-> p%3>=2?p+1:p-1).collect(Collectors.toList());
		System.out.println(l1);
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
