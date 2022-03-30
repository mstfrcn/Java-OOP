package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = Arrays.asList(0,2,3,5,0,2);
		System.out.println(liste);
		
		Optional<Integer> l1 = liste.stream().reduce((p1,p2) -> p1+p2);
		System.out.println(l1);
		
		Optional<Integer> l2 = liste.stream().reduce((p1,p2) -> p1>p2? p1-p2 : p2-p1);
		System.out.println(l2);
		
	}

}
