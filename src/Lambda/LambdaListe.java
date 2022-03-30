package Lambda;

import java.util.ArrayList;
import java.util.Random;

public class LambdaListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0; i<10; i++)
			array.add(r.nextInt(10));
		System.out.println(array);
		
		array.forEach(p->System.out.println(p.intValue()+3));
	}

}
