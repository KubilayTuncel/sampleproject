package Örnek_Cözümü08;

import java.util.Scanner;

public class C01Örnek {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		C01Ana obj=new C01Ana();
		System.out.println(obj.getAd());//ahmet
		
		System.out.println(obj.getYas());//40
		System.out.println(obj.adres);
		
		/*
		System.out.println("ad giriniz: ");  //ayse
		obj.setAd(scan.nextLine());
		
		System.out.println("yas giriniz");
		obj.setYas(scan.nextInt());//10
		
		Ana obj2=new Ana("ali",25);
		
		System.out.println(obj2.getAd()); //ali
		System.out.println(obj2.getYas());//25
		//System.out.println(obj2.adres); */
		
		System.out.println(obj.getAd()); 
		System.out.println(obj.getYas());
		
		System.out.println(obj);
		

	}
}
