package sampleproject;

import java.util.Scanner;

public class Replitt01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Lutfen isminizi giriniz: ");
		String name=scan.nextLine();

		System.out.println("Lutfen bir harf giriniz: ");
		char ch1=scan.next().charAt(0);
		int count=0;

		for (int i=0; i<name.length();i++) {
			
			
			if (name.charAt(i)==ch1) {
				
				count++;
				
			}
			
		}
			System.out.println(count);
			
			scan.close();

	}

}
