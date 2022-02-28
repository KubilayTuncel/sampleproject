package Ornek_Cozumu;

import java.util.Scanner;

public class Ör7_StringMethod {

	public static void main(String[] args) {
		/* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
      */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime=scan.nextLine().toLowerCase();
		
		  if (kelime.startsWith("gh")) {
	            System.out.println(kelime);
	            
	        }else if (kelime.startsWith("g")) {
	            //System.out.println(kelime.replace("o",""));
	            System.out.println(kelime.charAt(0)+kelime.substring(2));
	            
	        }
	        
	        else if (kelime.charAt(1)=='h') {
	            System.out.println(kelime.substring(1));
	            
	        }
	        else {
	            System.out.println(kelime.substring(2));
	        }{
	            
	        }{
	            
	        }
	        scan.close();
	}

}
