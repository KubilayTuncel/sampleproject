package map_collections_ornekcozum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HashMap02 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm3 = new HashMap<>();
		hm3.put(101, "Kerim Yeter-11/A");
		hm3.put(104, "Sukru Aydinlik-11/A");
		hm3.put(103, "Canan Kose-11/C");
		hm3.put(105, "Ali Cin-11/C");
		hm3.put(102, "Veli Kul-11/E");
		hm3.put(102, "Memduh Saduh-11/E");
		Scanner scanner = new Scanner(System.in);
		/*
		 * System.out.println("ogrenci numarasini giriniz : ");
		 * 
		 * int yenikayitnum=scanner.nextInt(); scanner.nextLine();
		 * 
		 * System.out.println("ogrenci bilgilerini giriniz : ");
		 * 
		 * String yeniKayit=scanner.nextLine();
		 * 
		 * if (hm3.putIfAbsent(yenikayitnum, yeniKayit)==null) {
		 * System.out.println("kaydiniz eklenmistir : "+ hm3.get(yenikayitnum));
		 * 
		 * }else { System.out.println("Boyle bir kayit mevcuttur : "+
		 * hm3.putIfAbsent(yenikayitnum, yeniKayit)); }
		 */
		/*
		 * Object bilgi = scan.nextLine(); boolean flag = true; for (Map.Entry<Integer,
		 * List<Kitapci>> w : kitapListe.entrySet()) { List<Kitapci> kitapBilgi =
		 * w.getValue(); for (Kitapci s : kitapBilgi) { if (s.kitapAdi.equals(bilgi) ||
		 * s.yazarAdi.equals(bilgi)) { System.out.println(w); flag = false; } } } if
		 * (flag) { System.out.println("Bu bilgilerle eslesen bir kitap bulunamadi."); }
		 * 
		 */
		List<String> list = new ArrayList<>();
		for (String each : hm3.values()) {
			list.add(each);

		}
		System.out.println("Lutfen sinif ismi giriniz : ");
		String bilgi = scanner.nextLine();
		int i = 0;
		boolean flag = true;
		List<String> sinif = new ArrayList<>();
		do {

			String isim = list.get(i);

			String arr[] = isim.split("-");

			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equalsIgnoreCase(bilgi)) {
					sinif.add(list.get(i));
					System.out.println("Aradiginiz siniftaki ogrenciler : " + sinif);
					flag = false;
				}

			}

			i++;
		} while (i < list.size());
		if (flag) {
			System.out.println("Aradiginiz bilgide sinif mevcut degildir.");
		}

	}

}
