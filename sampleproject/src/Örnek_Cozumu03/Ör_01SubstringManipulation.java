package Örnek_Cozumu03;

import java.util.Scanner;

public class Ör_01SubstringManipulation {

	public static void main(String[] args) {
		// /kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz
		// ad ayri soyad ayri sekilde ekrana yaziniz

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz:");
		
		String isim=scan.nextLine();
		
		String isim1=isim.substring(0,isim.indexOf(" "));
		String soyisim=isim.substring(isim.indexOf(" "),isim.length());
		
		System.out.println("adiniz: " +isim1+" "+ "soyisminiz: "+soyisim);
		
		scan.close();
	}

}
