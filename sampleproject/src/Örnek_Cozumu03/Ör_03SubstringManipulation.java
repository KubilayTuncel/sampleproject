package Örnek_Cozumu03;

import java.util.Scanner;

public class Ör_03SubstringManipulation {

	public static void main(String[] args) {
		/*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
         * 
         * input : ali 
         * output: girdiğiniz kelime 3 harfli ve unique karaktere sahip
         * 
         * input : ece
         * output: girdiğiniz kelime 3 harfli ve unique karaktere sahip değil
         */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Isminizi yaziniz:");
		
		String isim=scan.nextLine();
		
		String kontrol=(isim.length()==3 ? 
				(isim.charAt(0)==isim.charAt(1)
				|| isim.charAt(0)==isim.charAt(2) 
				|| isim.charAt(1)==isim.charAt(2) ? 
						"Girdiginiz isim ayni karakter icerir" : "Girdiginiz isim de ayni karakter yoktur") : 
							"Girdiginiz isim 3 karakterden olusmuyor");
		
				System.out.println(kontrol);
		
		scan.close();
		
	}

}
