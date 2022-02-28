package Örnek_Cozumu02;

import java.util.Scanner;

public class Ör_7SubstringMethod4 {

	public static void main(String[] args) {
		// Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen birseyler yaziniz");
		
		String cumle=scan.nextLine();
		
		
		
		if (cumle.contains(" ")) {
			
			System.out.println("cumle bosluk vardir");
			
		}else {
			
			System.out.println("Cumlede bosluk yoktur");
			
		}
			
		scan.close();
	}

}
