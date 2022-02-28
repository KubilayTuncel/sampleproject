package Ornek_Cozumu;

import java.util.Scanner;

public class Ör2_CezaParasi {

	public static void main(String[] args) {
		   /*
        Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;
            sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;
            sonuç 300 olmalıdır.
     */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Hizinizi giriniz:");
		
		int hiz=scan.nextInt();
		
		System.out.println("Ehliyetiniz var ise 1 yoksa 0 yaziniz");
		
		int Ehliyet=scan.nextInt();
		
		if (Ehliyet==1) {
			
			if (hiz<55) {
				System.out.println("Para cezaniz yok");
			}else if (54<hiz && hiz<=74) {
			
			System.out.println("Para cezaniz 100 $'dir");
			
			}else if (74<hiz && hiz<=84){
				
				System.out.println("Para Cezaniz 150 $'dir");
				
			}else if (85<=hiz && hiz<95) {
				
				System.out.println("Para CEzaniz 320 $'dir");
				
			}else  {
				
				System.out.println("para cezaniz 500 $'dir");
			}
			
			
		}else if(Ehliyet==0) {
			
			if (hiz<55) {
				System.out.println("Para cezaniz 200 $'dir");
			}else if (54<hiz && hiz<=74) {
				
			System.out.println("Para cezaniz 300 $'dir");
			
			}else if (74<hiz && hiz<=84){
					
					System.out.println("Para Cezaniz 350 $'dir");
					
			}else if (85<=hiz && hiz<95) {
				
					System.out.println("Para CEzaniz 520 $'dir");
					
			}else   {
				
					System.out.println("para cezaniz 700 $'dir");
			}
		}


		scan.close();

	}

}
