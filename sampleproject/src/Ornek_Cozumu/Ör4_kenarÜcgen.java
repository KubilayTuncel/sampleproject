package Ornek_Cozumu;

import java.util.Scanner;

public class Ör4_kenarÜcgen {

	public static void main(String[] args) {

		/*
		 * Kullanicidan 3 tene pozitif tam sayi alniz. bu uc sayinin ucgen olusturma
		 * durumunu kontrol ediniz eger ucgen olabiliyor ise, es kenar ucgen olma
		 * durumunu da kontrol edniz
		 * 
		 * üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi
		 * iki kenar farkı diger kenardan büyük olmali a+b>c>a-b a+c>b>a-c b+c>a>b-c
		 * a=b=c ise es kenar ucgen
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 3 tam sayi giriniz");

		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		int kenar3 = scan.nextInt();

		if (kenar1 + kenar2 > kenar3 && kenar1 - kenar2 < kenar3 && 
				kenar1 + kenar3 > kenar2 && kenar2 > kenar3 - kenar1
				&& kenar2 + kenar3 > kenar1 && kenar1 > kenar3 - kenar2) {
			if (kenar1 == kenar2 && kenar2 == kenar3) {
				System.out.println("Girdiginiz sayilar es kenar ucgen olusturur");
			} else {
				System.out.println("Girdiginiz sayilar es kenar ucgen olusturmaz");
			}

		} else {
			System.out.println("Girdiginiz sayilar ucgen olusturmaz");
		}
scan.close();
	}

}
