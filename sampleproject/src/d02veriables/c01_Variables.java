package d02veriables;

public class c01_Variables {

	public static void main(String[] args) {
		//1- Farkli 3 data turunden veriables olusturun ve bunlari yazdirin
		
		String kelime = "Merhaba"; //Satirdaki kod sonunda mutlaka ; kullanilmalidir.
		System.out.println(kelime);
		int sayi =1000;
		System.out.println(sayi);
		System.out.println("girilen sayi : " + sayi);
		boolean tatildeMi = true ;
		System.out.println(tatildeMi);
		System.out.println("bu sene tatile gittiniz mi?="+ tatildeMi);
		
		/*
		 * 2- isim ve soyisim icin iki variable olusturun ve bunlari
		 * isminiz : kubilay
		 * soyisminiz : Tuncel
		 * seklinde yazdirin
		 */
	
		String name="Kubilay";
		String surname="Tuncel";
		System.out.println("isminiz : " +name);
		System.out.println("soyisminiz : " +surname);
		
		//3 iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
		
		int sayi1=10;
		byte sayi2=5;
		System.out.println(sayi1 + sayi2);
		
		//toplama isleminin basina aciklama yazmak istersek
		
		//iki sayinin toplami = 15
		
		System.out.println("iki sayinin toplami = "+ (sayi1 + sayi2));
		
		//string ve sayisal islemleri birlikte yaptirdigimizda matematiksel islemi parantez icine alin
		
		//4 Bir tamsayi ve bir ondalikli variable olusturun ve bunlari toplamini yazdirin
		
		int sayi3=15;
		double sayi4 = 3.14;
		
		
		System.out.println(sayi3 + sayi4);
		
		// toplam : 18.14 
		
		System.out.println("toplam : "+ (sayi3 + sayi4));
		
		//5- char data turunde bir variable olusturun ve yazdirin
		
		char karakter='?';
		
		System.out.println(karakter);
		System.out.println("Girilen karakter : " + karakter);
		
		
		
		//6- bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
		
		int sayi5=20;
		char harf='M';
		
		System.out.println(sayi5 + harf); //20M
		
		//char data turundeki degiskenler matematiksel islemlerde kullanilirsa ASCII tablosu devrye girer.
		//Java o karakter yerine ASCII tablosundaki degeri kullanir.
		
		
		

	}

}
