package FinalCalisma;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = Arrays.asList(3,6,5,1,9,4);
		
		List<Integer> l = liste.parallelStream().filter(p -> p%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		List<Integer> liste2 = Arrays.asList(60,70,12,34,56,86,90,62);
		List<Integer> l1 = liste2.stream().filter(p -> p>40 && p<90).collect(Collectors.toList());
		System.out.println(l1);
		
		
	}

}
