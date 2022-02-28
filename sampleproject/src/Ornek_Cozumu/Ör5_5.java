package Ornek_Cozumu;

import java.util.Scanner;

public class Ör5_5 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan vize ve final notlarını alınız. Kullanıcın istediği oranlarda
		 * vize ve final yüzdeleri not ile not ortalamasını hesaplayıp not ortalamasını
		 * yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
		 * "Malesef dersten kaldınız..." yazdırınız
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("vize notlarinizi giriniz");
		double vize1 = scan.nextDouble();
		double vize2 = scan.nextDouble();
		System.out.println("final notunuzu giriniz");
		double final2 = scan.nextDouble();
		System.out.println("vize oranini giriniz");
		double oranvize = scan.nextDouble();
		System.out.println("final oranini giriniz");

		double final2oran = scan.nextDouble();

		double sonuc = ((vize1 + vize2)/2) * (oranvize / 100) + final2 * (final2oran / 100);

		if (sonuc < 50) {
			System.out.println("Malesef dersten kaldiniz" + sonuc);
		} else {
			System.out.println("Tebrikler dersi basari ile gectiniz" + sonuc);
		}

		scan.close();

	}

}
