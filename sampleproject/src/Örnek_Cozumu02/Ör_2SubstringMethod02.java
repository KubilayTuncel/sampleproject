package Örnek_Cozumu02;

import java.util.Scanner;

public class Ör_2SubstringMethod02 {

	public static void main(String[] args) {
		/*
        name1 ve name2 degiskenlerini olusturun.
        name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik"
         yazdirinan bir method oluşturun
                  e.g:
                 name1= mehmet
                 name2= ahmet
                 Print ==> mehahmetmet
        */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime1=scan.nextLine().toLowerCase();

		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime2=scan.nextLine().toLowerCase();
		
		int kelime1uz=kelime1.length();
		
		if (kelime1uz%2==0) {
			
			System.out.println(kelime1.substring(0,kelime1uz/2)+kelime2+kelime1.substring(kelime1uz/2));
			
		}else {
			
			System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
			
		}
		
		scan.close();
	}

}
