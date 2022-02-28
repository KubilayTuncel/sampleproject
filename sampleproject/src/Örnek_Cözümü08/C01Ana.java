package Örnek_Cözümü08;

public class C01Ana {
	private String ad="Ahmet";
	private int yas=40;
	String adres="Ankara";
	
		
	public C01Ana() {
		
	}

	
	public C01Ana(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
		
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public String getAd() {
		return ad;
	}
	public int getYas() {
		return yas;
	}


	public String toString() {
		return "ad=" + ad + "\n, yas=" + yas + "\n, adres=" + adres ;
	}
}

