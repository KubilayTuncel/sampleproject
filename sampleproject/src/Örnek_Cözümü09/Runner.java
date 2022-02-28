package Örnek_Cözümü09;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Musteri musteri = new Musteri();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Marketten ekmek almak istiyorsaniz (1) \nHalk ekmekten ekmek almak istiyorsaniz (2) 'ye basiniz");
		int t = scanner.nextInt();

		if (t == 1) {
			musteri.anaabstrack = new Market();

		} else if (t == 2) {
			musteri.anaabstrack = new HalkEkmek();

		}
		musteri.alisveris();

	}

}
