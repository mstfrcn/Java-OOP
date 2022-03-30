package AbstractFormApp;

public abstract class Urun {
	String urun;
	float fiyat;
	float kdv;
	float otv;
	
	abstract float fatura(float fiyat, float kdv, float otv);
	
}
