package Örnek_Cözümü09;

import java.util.Scanner;

public class Musteri {

	AnaAbstrack anaabstrack;
	Scanner scanner=new Scanner (System.in);
	
	public void alisveris() {
		System.out.println("Ekmek Hesaplaması");
		System.out.println("kaç adet ekmek almak istiyorsunuz");
		int x=scanner.nextInt();
		
		System.out.println("Ekmek fiyatı : " + anaabstrack.ekmekAl(x)/x+"TL" );
		System.out.println("Odeyeceğiniz miktar : "+anaabstrack.ekmekAl(x) + " TL");
		
		
	}
}
