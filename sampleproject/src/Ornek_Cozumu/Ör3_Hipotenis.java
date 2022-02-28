package Ornek_Cozumu;

import java.util.Scanner;

public class Ör3_Hipotenis {

	public static void main(String[] args) {
		
		    
		    /*  Problem Tanımı
		        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
		        Örnek Ekran Çıktısı
		        birinci kenar: 12
		        ikinci kenar: 5
		        hipotenus: 13    
		       kök almak için Math.sqrt(sayi) metodunu kullanınız 
		         */
		Scanner scanner=new Scanner(System.in);
		System.out.print("a dik kenarını  giriniz : ");
		int a=scanner.nextInt();
		       
		System.out.print("b dik kenarını  giriniz : ");
		int b=scanner.nextInt();
		double h =Math.sqrt((a*a)+(b*b));
		System.out.println("ücgeninizin hipotenusu :"+h);
		
		
		scanner.close();
		
		
		    }
		}
