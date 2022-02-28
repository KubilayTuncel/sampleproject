package Örnek_Cozumu02;

import java.util.Scanner;

public class Ör_6SwitchCase {

	public static void main(String[] args) {
		 // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D   
        // 2. 50(dahil) ile 60 arası - C   
        // 3. 60(dahil) ile 80 arası - B  
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.
        
        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("litfen notunuzu giriniz : ");
        int not=scanner.nextInt();
        String note=scanner.nextLine();
        
        if (not>=0 && not<50) {
            //not=50;
            note="kaldınız";
        } else if(not>=50 && not<60){
            //not=60;
            note="ucuz yırttınız";
        }else if (not>=60 && not<80) {
            //not=80;
            note="başarılı";
        }else if (not>=80 && not<=100) {
            //not=100;
            note="gayet başarılı";
        }
        
        switch (note) {
        case "kaldınız": {
            System.out.println("notunuz : D");
            break;
        }
        case "ucuz yırttınız":{
            System.out.println("notunuz : C");
            break;
        }case "başarılı": {
            System.out.println("notunuz : B");
            break;
        }
        case "gayet başarılı":{
            System.out.println("notunuz : A");
            break;
        }default:
            System.out.println("geçerli not giriniz");
        break;
    }

        scanner.close();
        
	}

}
