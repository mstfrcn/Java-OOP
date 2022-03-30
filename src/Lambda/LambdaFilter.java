package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = Arrays.asList(20,35,63,27,47,82,99);
		
		List<Integer> l1 = liste.stream().filter(p->p%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		List<Integer> l2 = liste.stream().filter(p->p%2==1).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> l3 = liste.stream().filter(p-> p>30).collect(Collectors.toList());
		System.out.println(l3);
		
		List<Integer> l4 = liste.stream().filter(p -> p>20 && p<50).collect(Collectors.toList());
		System.out.println(l4);

	}

}
