package Örnek_Cözumu05;

import java.util.Scanner;

public class while_Loop02 {

	public static void main(String[] args) {
		 /*
        Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        tamkare ise true  değilse false yazdırınız.
         Not: sqrt gibi fonksiyonları  kullanmayın.
         Example 1:
         Input: 16
         Output: true
         Not: bu sayı tamkare çünkü 4*4 = 16
         Example 2:
         Input: 25
         Output: true
         Note: bu sayı tamkare çünkü 5*5=25
         Example 3:
         Input: 14
         Output: false
      */

     Scanner scan = new Scanner(System.in);
     System.out.print("bir sayı giriniz : ");
     int sayi = scan.nextInt();
     
     int count=1;
     
     boolean b=false;
     
     while (count*count<=sayi) {
		
    	 if (count*count==sayi) {
    		 b=true;
    		 System.out.println(b);
			
		}
    	 count++;
    	 
    	 
	}if (b==false)System.out.println("false");
	
	scan.close();

	}

}
