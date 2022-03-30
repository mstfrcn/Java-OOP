package FinalCalisma;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> liste = Arrays.asList(3,5,7,9,1,2,4,8);
		Optional<Integer> l = liste.stream().reduce((p1,p2) -> p1>p2 ? p1 : p2);
		System.out.println(l);
		Optional<Integer> l1 = liste.stream().reduce((p1,p2) -> p1>p2 ? p1-p2 : p1-p2);
		System.out.println(l1);
		
		
		
		
	}

}
