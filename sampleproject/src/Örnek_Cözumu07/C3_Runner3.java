package Örnek_Cözumu07;

public class C3_Runner3 {
	/*-Hayvanların beslenme,barınma, boyut ve solunum özellikleri  ile ilgili methodlar barınıran Hayvan isminde bir class oluşturalım

	-Hayvan sınıfının SubClassı bir Kuş Classı oluşturalım ve bu class ucma ve barınma methodlarını içersin

	-Hayvan sınıfının SubClassı bir Balık Classı oluşturalım ve bu class yuzme ve Solunum methodlarını içersin

	-kuş sınıfının SubClassı bir Güvercin Classı oluşturalım ve bu class beslenme ve boyut methodlarını içersin

	-Balık sınıfının SubCLassı bir JaponBaligi classı oluşturalım ve bu class solunum methodu içersin ve bu methodu Superclasstan alsın

	--Runner class oluşturalım ve oluşturduğumuz methoları çağıralım.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C3_Hayvanlar h=new C3_Hayvanlar();
		h.barinma();
		h.beslenme();
		h.boyut();
		h.solunum();
		C3_Kus k=new C3_Kus();
		k.barinma();
		k.ucma();
		C3_Guvercinler g=new C3_Guvercinler();
		g.boyut();
		g.beslenme();
		C3_Balik b=new C3_Balik();
		b.solunum();
		b.yuzme();
		C3_JaponBaligi j=new C3_JaponBaligi();
		j.solunum();

	}

}
