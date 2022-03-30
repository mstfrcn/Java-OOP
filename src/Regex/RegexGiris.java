package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGiris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "Ben bir denizim demedim mi sana? Sen bir balýksýn demedim mi? Demedim mi o kuru yerlere gitme sakýn, senin duru denizin ben'im demedim mi?";
		
		Pattern p = Pattern.compile("[\\s]..na[\\s]");
		Matcher m = p.matcher(s);
		
		int sayac = 0;
		while(m.find()) {
			sayac++;
		}
		System.out.println(sayac);
		
		/*
		 * "[abc]?" abc birkere mi kullanilmis
		 * "[abc]+" bir veya birden fazla kezmi kullanilmis
		 * "[abc]*" hic kullanilmamis veya birden fazla kez kullanilmis
		 * [^"abc"] bu harflarden hicbiri kullanilmamis olsun
		 * [A-Za-z] buyuk ve kucuk a dan z ye kadar harflerden biri kullanilmis
		 * ["a...b"] nokta jokerdir yerine her harf gelebilir. a ile baslayip b ile biten 5 harfli kelime
		 * \d 0-9 arasinda sayilar
		 * \D 0-9 arasinda sayi olmayanlar
		 * \w a-zA-z0-9 arasinda butun karakterler
		 * \W a-zA-z0-9 arasinda olmayan butun karakterler
		 * 
		 * 
		 * 
		 * ("k.r") 3 harfli baslangic k bitis r noktali yere gelen harfin onemi yok joker gibi orn("k..t")
		 */
		// true degerini verir cunku kelimenin uzunlugu ile (k..t) ifadesinin uzunlugu ayni ve k ile baslar t ile biter
		System.out.println(Pattern.matches("k..t", "kart")); // true
		System.out.println(Pattern.matches(".i.", "bir")); // mantik usttekiyle ayni
		
		// string bir harf uzunlugunda ve icinde a olacak. Stringde a olmasina ragmen 3 harf uzunlugunda oldugu icin false dondurur
		System.out.println(Pattern.matches("[a]", "abc" )); // false
		// [azd] karakterlerinden birisi stringte bir kere geciyormu diye kontrol eder true dondurcek
		System.out.println(Pattern.matches("[azd]", "a")); // true
		// Stringde azd harflerinden birisi birer defa geciyormu diye kontrol edecek z kelimesi birden fazla kez gectigi icin false
		System.out.println(Pattern.matches("[azd]", "azd")); // false
		
		// azn harflerinden biri verilen stringde birkere kullanilmismi
		System.out.println(Pattern.matches("[azn]?","a")); // true
		// false cunku azn kelimlerinden biri birkere degil birden fazla kez tekrar etmis
		System.out.println(Pattern.matches("[azn]?", "azn")); // false
		
		// azn harfleri stringde bir veya daha fazla kez kullanildigi icin true
		System.out.println(Pattern.matches("[azn]+","azzznnn")); // true
		System.out.println(Pattern.matches("[azn]+","a")); // true
		
		// \\d tekbir rakamdan olusan sayiyi arar harf oldugu icin false sayi olsa bile 3 tane degil birtane olmali
		System.out.println(Pattern.matches("\\d", "abc")); // false
		System.out.println(Pattern.matches("\\d", "23")); // false
		// uzunlugunu vererek istedidigimiz uzunlukta sayiyi da aratibiliriz
		System.out.println(Pattern.matches("\\d{2}", "23")); // true
		
		// \\D sayi olmayanlari arar o yuzden true
		System.out.println(Pattern.matches("\\D", "a")); // true
		// \\D bir karakter icin calisir. Daha uzun karakterler icin "\\D{String uzunlugu verilir}"
		System.out.println(Pattern.matches("\\D", "abc")); // false
		
		// [a-zA-Z0-9]{6} tanima uyan 6 harfli stringi ariyoruz
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aJAx06" )); // true
		// diger bir yontemle bu sekilde de yapilabilir
		System.out.println(Pattern.matches("\\w{6}", "ajax06")); // true 
		// aradigimiz karakter araligi uysada string 6 harf biz 5 harf diye belirttigimiz icin false
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","ajax06")); // false
		// Stringin uzunlugu uysa da aradgimiz karakter araligina uymuyor
		System.out.println(Pattern.matches("\"[a-zA-Z0-9]{5}\"", "as$12"));
		
		// ilk karakteri 2 veya 3 ile baslayan sonraki 6 karakteri 0-9 arasinda olan toplam 7 karakterli sayi oldugu icin true
		System.out.println(Pattern.matches("[23][0-9]{6}", "2567851")); // true
		System.out.println(Pattern.matches("[23][0-9]{6}", "3564213")); // true
		// ilk karakteri 2 veya 3 ile baslayip sonraki 6 karakteri 0-9 arasinda olsada toplam uzunlugu 7 karakterli olmadigi icin false
		System.out.println(Pattern.matches("[23][0-9]{6}", "3564213123")); // false
		
		
		
		
	}

}
