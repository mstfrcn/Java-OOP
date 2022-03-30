package Lambda;


interface lmbd{
	void yaz();
}

interface lmbd2{
	int topla(int a, int b);
}

public class LambdaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lmbd l = new lmbd() {
			
			@Override
			public void yaz() {
				// TODO Auto-generated method stub
				System.out.println("hello world");
				
			}
		};
		
		l.yaz();
		
		
		lmbd l2 = ()-> System.out.println("lambda hello world");
		l2.yaz();
		
		lmbd2 l3 =(int a, int b)-> a+b;
		System.out.println(l3.topla(3, 5));

	}

}
