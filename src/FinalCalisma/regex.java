package FinalCalisma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Neden, Bay Anderson neden? Neden, neden, neden? Bunu neden yap�yorsun? "
				+ "Niye? Aya�a kalkmak niye? Kavga etmek niye? �nand���n �eyler i�in kavga etti�ini mi san�yorsun? "
				+ "Sa� kalmadan �te bir �eyler i�in mi? Bana s�yleyebilir misin, biliyor musun? �zg�rl�k m�? Ger�ek mi? "
				+ "Belki de bar�� ya da sevgi olabilir mi? Yan�lsamalar Bay Anderson, alg�lamada aldanmalar� "
				+ "Herhangi bir anlama ya da amac� olmayan bir varolu�u �mitsizce hakl� g�stermeye u�ra�an zay�f insan zekas�n�n"
				+ " �retti�i ge�ici kuruntular ve bunlar�n hepsi de Matrix kadar yapay. "
				+ "Zaten, sevgi gibi zavall� bir kavram� insan zekas� icat edebilirdi. Bunu g�rebilirsin Bay Anderson, "
				+ "art�k bunu anlaman gerek! Kazanamazs�n! Kavga etmen bo�una! neden? "
				+ " Bay Anderson neden? Niye inat ediyorsun?";
		/*
		Pattern p1 = Pattern.compile(".eden");
		Matcher m1 = p1.matcher(s);
		*/
		/*
		Pattern p1 = Pattern.compile("[.,?!]");
		Matcher m1 = p1.matcher(s);
		*/
		/*
		Pattern p1 = Pattern.compile("[�����]");
		Matcher m1 = p1.matcher(s);
		*/
		
		/*
		Pattern p1 = Pattern.compile("e");
		Pattern p2 = Pattern.compile("a");
		Matcher m1 = p1.matcher(s);
		Matcher m2 = p2.matcher(s);
		
		int esayac = 0;
		while(m1.find())
			esayac++;
		System.out.println(esayac);
		
		int asayac = 0;
		while(m2.find())
			asayac++;
		System.out.println(asayac);
		System.out.println(esayac - asayac);
		*/
		
		/*
		Pattern p1 = Pattern.compile("[^A-Za-z�����]");
		Matcher m1 = p1.matcher(s);
		*/
		
		/*
		Pattern p1 = Pattern.compile("....n");
		Matcher m1 = p1.matcher(s);
		*/
		
		/*
		Pattern p1 = Pattern.compile("\\s");
		Matcher m1 = p1.matcher(s);
		int sayac = 0;
		while(m1.find())
			sayac++;
		System.out.println(sayac+1);
		*/
		
		/*
		Pattern p1 = Pattern.compile("zeka");
		Matcher m1 = p1.matcher(s);
		*/
		
		Pattern p1 = Pattern.compile("[a-zA-�����]{12}");
		Matcher m1 = p1.matcher(s);
		int sayac = 0;
		while(m1.find())
			sayac++;
		System.out.println(sayac);
		int a = 0 % 2;
		System.out.println(a);
		
		
		
		
	}

}
