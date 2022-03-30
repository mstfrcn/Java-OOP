package AbstractFormApp;

public class Kategoriler extends Urun {
	
	float indirim = 0.20f;

	@Override
	float fatura(float fiyat, float kdv, float otv) {
		kdv = kdv/100;
		otv = otv/100;
		fiyat += fiyat*otv;
		fiyat += fiyat*kdv;
		return fiyat ;
	}

}
