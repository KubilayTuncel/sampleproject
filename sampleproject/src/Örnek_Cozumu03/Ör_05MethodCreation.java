package Örnek_Cozumu03;

import java.util.Scanner;

public class Ör_05MethodCreation {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen saati giriniz:");
		
		double saat=scan.nextDouble();
		
		System.out.println("Lutfen mil'i giriniz:");
		
		double mil=scan.nextDouble();
		
		System.out.println("Lutfen kilogrami giriniz:");
		
		double kilo=scan.nextDouble();
		
		
		double saniye=Saniye(saat);
		
		double kilometre=Kilometre(mil);
		
		double gram=Gram(kilo);
		
		
		System.out.println("Girdiginiz saat: "+saniye+" saniyedir"+
		"\nGirdiginiz Mil: "+kilometre+ " kilometredir"+
				"\nGirdiginiz kilogram: "+gram+" gramdir");
		
		scan.close();

	}

	public static Double Gram(double kilo) {
		
		double gram=kilo*1000;
		
		return gram;
		
		
	}

	public static Double Kilometre(double mil) {
		
		double kilometre=mil*1.65;
		
		return kilometre;
		
	}

	public static Double Saniye(double saat) {
		
		double saniye=saat*60*60;
		
		
		return saniye;
		
		
	}

}
