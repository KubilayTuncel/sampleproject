package Örnek_Cözumu04;

import java.util.Scanner;

public class Ör4_ForLoop04 {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.
        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****
        */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz: ");
		
		int sayi=scanner.nextInt();
		
		for (int i = 1; i <= sayi; i++) {

			
			for (int j = 1; j <= sayi-i; j++) {
				
				System.out.print(" ");
			}
			
			
			
			for (int t = 1; t <= i; t++) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
			
		}
		scanner.close();
	}

}
