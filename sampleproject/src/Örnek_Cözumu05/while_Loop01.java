package Örnek_Cözumu05;

import java.util.Scanner;

public class while_Loop01 {

	public static void main(String[] args) {

		// belirli bir(kullanıcı girecek) yükseklikten bir top serbest dusme ile
		// bırakilımaktadir.
		// top serbest bırakıldıktan sonra sürekli birakildigi yüksekliğin ¾ 75 'İ kadar
		// zeminden yukarı doğru zıplamaktadır
		// Top zıplama yüksekliği 1 metrenin altına indiğinde olay sonlandirilmaktadir.
		// Bu ana kadar topun toplam aldığı yolu ve topun zemine vurma sayısını bulunuz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen topun yuksekligini giriniz: ");
		
		double yukseklik=scan.nextDouble();
		int count=0;
		double yol=yukseklik;
		
		while (yukseklik>=1) {
		
			
			yukseklik=yukseklik*3/4;
			
			yol+=yukseklik*2;
			
			count++;
			
		}
		
		System.out.println("Toplam alinan yol = "+yol);
		System.out.println("topunuz "+count+" kez zipladi");
		scan.close();
	}

}
