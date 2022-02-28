package Ornek_Cozumu;

import java.util.Scanner;

public class Ör6_ucgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ücgeninizin kenar uzunluklarini giriniz: ");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if (a>b ? (a-b)<c : b-a<c  && a>c ? a-c<b : c-a<b && b>c ?  b-c<a : c-b<a) {
			if ((a*a)+(b*b)==(c*c)||(a*a)+(c*c)==b*b||(b*b)+(c*c)==a*a) {
			System.out.println("Girdiginiz deger ücgen dik ucgendir");
		    }else
			System.out.println("Ücgeniniz dik ücgen degildir");
	   }else {
		   System.out.println("Girdiginiz degerler ucgen olusturmaz");
	   }
	scan.close();		
	}

}
