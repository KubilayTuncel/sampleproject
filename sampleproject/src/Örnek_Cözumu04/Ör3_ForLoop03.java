package Örnek_Cözumu04;

import java.util.Scanner;



public class Ör3_ForLoop03 {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Matrisin boyutunu kullanıcıdan okuyup.
        Sadece diyagonu (köşegeni) 1 olan ve
        diğer elemanları 0 olan bir kare matrisi ekrana bastırın.
       Ekran Çıktısı
        Bir sayı giriniz: 7
        1000000
        0100000
        0010000
        0001000
        0000100
        0000010
        0000001
        Bir sayi giriniz: 5
        10000
        01000
        00100
        00010
        00001
   */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lutfen olusturmak istediginiz matris genisligini giriniz: ");
		
		int sayi=scanner.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			
			for (int j = 1; j <= sayi; j++) {
				
				if (i==j) {
				
				System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
		scanner.close();
	}

}
