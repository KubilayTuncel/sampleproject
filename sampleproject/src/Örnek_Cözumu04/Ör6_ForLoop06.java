package Örnek_Cözumu04;

import java.util.Scanner;

public class Ör6_ForLoop06 {

	public static void main(String[] args) {
		
		/*
		 A
		 B B
		 C C C
		 D D D D 
		 E E E E E
		 SEKLINDE YAZDIRINIZ
		 */

Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lutfen kac harf dizisi yazmak istiyorsaniz ona gore sayi giriniz: ");
		
		int sayi=scanner.nextInt();
		int harf=65;
		
		for (int i = 0; i <=sayi; i++) {
			
			for (int j = 0; j <=i ; j++) {
				
				System.out.print((char)(i+harf)+" ");
				
			}
			System.out.println("");
		}
		scanner.close();

	}

}
