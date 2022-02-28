package Örnek_Cözumu04;

import java.util.Scanner;

public class Ör5_ForLoop05 {

	public static void main(String[] args) {
		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lutfen kac harf dizisi yazmak istiyorsaniz ona gore sayi giriniz: ");
		
		int sayi=scanner.nextInt();
		
		for (int i = 1; i <=sayi; i++) {
			
			for (int j = 65; j <65+i ; j++) {
				
				System.out.print((char)j+" ");
				
			}
			System.out.println("");
		}
		scanner.close();
	}

}
