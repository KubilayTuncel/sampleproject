package Ornek_Cozumu;

import java.util.Scanner;

public class Ör1_kutleEndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("kilonuzu giriniz");
		double kilo = scan.nextDouble();

		System.out.println("boyunuzu cm giriniz");
		double boy = scan.nextDouble();

		boy /= 100;

		double vki = (kilo / (boy * boy));

		System.out.println("vucut kitle endeksiniz" + vki);

		scan.close();

	}

}
