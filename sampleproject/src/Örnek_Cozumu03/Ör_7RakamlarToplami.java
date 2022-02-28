package Örnek_Cozumu03;

import java.util.Scanner;

public class Ör_7RakamlarToplami {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int sayi = scan.nextInt();
		if (sayi > 0) {
			
			int basamakSay = basamakSayisi(sayi);
			System.out.println("Girdiginiz sayi : " + basamakSay + " basamaklidir.");
			int rakamlarTop = rakamTop(sayi, basamakSay);
			System.out.println("Sayi degerleri toplami: " + rakamlarTop);
		} else if (sayi == 0) {
			System.out.println("Girdiginiz sayi sifirdir.");
		} else {
			int basamakSay = negatifBasSay(sayi);
			int rakamlarTop = rakamTop(sayi, basamakSay);
			System.out.println("Girdiginiz sayi : " + basamakSay + " basamaklidir.");
			System.out.println("Sayi degerleri toplami: " + rakamlarTop);
		}
		scan.close();
	}
	private static int negatifBasSay(int sayi) {
		int basamakSay = 0;
		for (int i = -1; i >= sayi; i *= 10) {
			basamakSay++;
		}
		return basamakSay;
	}
	private static int rakamTop(int sayi, int basamakSay) {
		int rakamlarTop = 0;
		int rakam = 0;
		for (int i = 1; i <= basamakSay; i++) {
			rakam = sayi % 10;
			sayi /= 10;
			rakamlarTop += rakam;
		}
		return rakamlarTop;
	}
	private static int basamakSayisi(int sayi) {
		int basamakSay = 0;
		for (int i = 1; i <= sayi; i *= 10) {
			basamakSay++;
		}
		return basamakSay;
	}

}
