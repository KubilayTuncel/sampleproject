package Örnek_Cozumu03;

import java.util.Scanner;

public class Ör_04SubstringManipulation {

	public static void main(String[] args) {
		/*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir kelime yaziniz:");
		
		String kelime=scan.nextLine();
		
		if (kelime.length()>=3) {
			
			int kelimeuz=kelime.length();
			
			String kelime1=kelime.substring(kelimeuz-2,kelimeuz-1)+kelime.substring(kelimeuz-1)+
					kelime.substring(kelimeuz-2,kelimeuz-1)+kelime.substring(kelimeuz-1)
					+kelime.substring(kelimeuz-2,kelimeuz-1)+kelime.substring(kelimeuz-1);
			
			System.out.println(kelime1);
			
		}else {
			
			System.out.println(kelime);
			
		}
		
		scan.close();

	}

}
