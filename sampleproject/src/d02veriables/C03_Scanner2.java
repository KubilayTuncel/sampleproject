package d02veriables;

import java.util.Scanner;

public class C03_Scanner2 {

	public static void main(String[] args) {
		
            Scanner scan = new Scanner (System.in);
            System.out.println("Lutfen isminizi giriniz ");
            
            String name=scan.next();
            
            System.out.println("Lutfen soyisminizi giriniz : ");
            
            String surname=scan.next();
            
            //Isim - soyisim : +Kubilay+ +Tuncel
            System.out.println("Isim - soyisim : "+name+" "+surname);
       scan.close();     
		
	}

}
