package Örnek_Cözümü08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02Kayit {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		C02Ögrenci obj1 = new C02Ögrenci();

		List<C02Ögrenci> list=new ArrayList<>();
		
		for (int i = 1; i < 3; i++) {

			System.out.println("Lutfen ogrencinin ismini giriniz");
			String isim=scanner.nextLine();
			System.out.println("Lutfen ogrencinin telefon numarasini giriniz : ");
			String telefon=scanner.nextLine();
			System.out.println("Lutfen ogrenciye bir kayit numarasi veriniz : ");
			String numara=scanner.nextLine();
			C02Ögrenci obj2= new C02Ögrenci(isim, telefon, numara);
			list.add(obj2);
			
		
		}
		System.out.println(list);
	}

}
