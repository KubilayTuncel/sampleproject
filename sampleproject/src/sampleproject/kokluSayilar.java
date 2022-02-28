package sampleproject;

import java.util.Scanner;

public class kokluSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("denklemin 1. katsayısı:"); int ksayi1= scan.nextInt();
		System.out.print("denklemin 2. katsayısı:"); int ksayi2= scan.nextInt();
		System.out.print("denklemin 3. katsayısı:"); int ksayi3= scan.nextInt();

		int delta= (ksayi2*ksayi2) -4*ksayi1*ksayi3;

		if (delta>0) {
		   System.out.println("iki kök vardır");
		   System.out.println("x1=" + ((-ksayi2) + Math.sqrt(delta)/2*ksayi1) );
		   System.out.println("x2=" + ((-ksayi2) - Math.sqrt(delta)/2*ksayi1));
		}else if (delta==0) {
		   System.out.println("bir kök vardır");
		   System.out.println("x=" + (-ksayi2/2*ksayi1));
		}else
		   System.out.println("kök yoktur");

		scan.close();

	}

}
