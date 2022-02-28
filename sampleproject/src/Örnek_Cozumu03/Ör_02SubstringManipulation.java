package Örnek_Cozumu03;

import java.util.Scanner;

public class Ör_02SubstringManipulation {

	public static void main(String[] args) {
		//Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.


		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz:");
		
		String isim=scan.nextLine();
		
		String isim1=isim.substring(0,1).toUpperCase();
		String isim2=isim.substring(isim.indexOf(" ")+1,isim.indexOf(" ")+2).toUpperCase();
		String soyisim=isim.substring(isim.lastIndexOf(" ")+1,isim.lastIndexOf(" ")+2).toUpperCase();
		
		System.out.println(isim1+"."+isim2+"."+soyisim+".");
		
		scan.close();
	}

}
