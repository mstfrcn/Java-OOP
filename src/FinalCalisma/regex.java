package FinalCalisma;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Neden, Bay Anderson neden? Neden, neden, neden? Bunu neden yapýyorsun? "
				+ "Niye? Ayaða kalkmak niye? Kavga etmek niye? Ýnandýðýn þeyler için kavga ettiðini mi sanýyorsun? "
				+ "Sað kalmadan öte bir þeyler için mi? Bana söyleyebilir misin, biliyor musun? Özgürlük mü? Gerçek mi? "
				+ "Belki de barýþ ya da sevgi olabilir mi? Yanýlsamalar Bay Anderson, algýlamada aldanmalar… "
				+ "Herhangi bir anlama ya da amacý olmayan bir varoluþu ümitsizce haklý göstermeye uðraþan zayýf insan zekasýnýn"
				+ " ürettiði geçici kuruntular ve bunlarýn hepsi de Matrix kadar yapay. "
				+ "Zaten, sevgi gibi zavallý bir kavramý insan zekasý icat edebilirdi. Bunu görebilirsin Bay Anderson, "
				+ "artýk bunu anlaman gerek! Kazanamazsýn! Kavga etmen boþuna! neden? "
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
		Pattern p1 = Pattern.compile("[þçöüð]");
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
		Pattern p1 = Pattern.compile("[^A-Za-zþçöüð]");
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
		
		Pattern p1 = Pattern.compile("[a-zA-þçöðü]{12}");
		Matcher m1 = p1.matcher(s);
		int sayac = 0;
		while(m1.find())
			sayac++;
		System.out.println(sayac);
		int a = 0 % 2;
		System.out.println(a);
		
		
		
		
	}

}
