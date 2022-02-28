package Örnek_Cözümü08;

public class C02Ögrenci {
	private String isim;
	private String telefon;
	private String numara;
	
	public String getIsim() {
		return isim;
	}
	public C02Ögrenci(String isim, String telefon, String numara) {
		super();
		this.isim = isim;
		this.telefon = telefon;
		this.numara = numara;
	}
	public C02Ögrenci() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getNumara() {
		return numara;
	}
	public void setNumara(String numara) {
		this.numara = numara;
	}
	public String toString() {
		return "ad= " + isim + " tel=" + telefon  + " no = " + numara ;
	}
	
	

}
