package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Kitapci {
	static Integer kitapNo = 1000;
	String kitapAdi;
	String yazarAdi;
	String yayinYili;
	Integer fiyat;

	static Scanner scan = new Scanner (System.in);
	static HashMap <Integer, List <Kitapci>> kitapListe = new HashMap<>();
	
	
	
	public Kitapci(String kitapAdi, String yazarAdi, String yayinYili, Integer fiyat) {
	
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
	}

	public static void main(String[] args) {
		/* Bir kitapci icin program yapalim
	     *
	     * Kitap no 1000'den baslayarak sirali no olsun
	     * Her kitap icin kitapAdi, yazarAdi,yayinYili,fiyati bilgilerini girelim
	     *
	     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini sorsun
	     * 1- kitap ekle
	     * 2- numara ile kitap goruntule
	     * 3- bilgi ile kitap goruntule
	     * 4- numara ile kitap sil
	     * 5- Tum kitaplari listele
	     * 6- Bitir
	     */
		
		String islem = "";
		do {
		System.out.println("1- Kitap Ekle \n2- Numara Ile Kitap Goruntule\n3- Bilgi Ile Kitap Goruntule"
				+ "\n4- Numara Ile Kitap Sil\n5- Tum Kitaplari Listele\n6- Cikis");
		
		islem = scan.next();
		scan.nextLine();
		
		switch (islem) {
		case "1":
			kitapEkle();
			break;
		case "2":
			noIleGoruntule();
			break;

		case "3":
			bilgiIleKitapGoruntule();
			break;

		case "4":
			numaraIleKitapSil();
			break;
		case "5":
			kitaplariListele();
			break;
		case "6":
			System.out.println("Gorusmek Uzere!");
			break;


		default:
			System.out.println("Gecerli bir islem seciniz!");
			break;
		}
		
		}while(!islem.equals("6"));
	}

	private static void kitaplariListele() {

for (Map.Entry<Integer, List <Kitapci>> w : kitapListe.entrySet()) {
			
			
	System.out.println(w.getKey() + " " + w.getValue());
			
		}
		

		
	}

	private static void numaraIleKitapSil() {
		
		System.out.println("Silmek istediginiz kitabin numarasini giriniz: ");
		int sil = scan.nextInt();
		
		
		List<Kitapci> sonuc= kitapListe.remove(sil);
		
		if (sonuc==null) {
			
			System.out.println("Boyle bir kitap bulunamadi");
		} else {
			
			System.out.println(sonuc + "bilgiler silindi");
		}
		
	}

	private static void bilgiIleKitapGoruntule() {

        System.out.println("Goruntulemek istediginiz kitabin adini ya da yazarini giriniz: ");
        Object bilgi = scan.nextLine();
        boolean flag = true;
        for (Map.Entry<Integer, List<Kitapci>> w : kitapListe.entrySet()) {
            List<Kitapci> kitapBilgi = w.getValue();
            for (Kitapci s : kitapBilgi) {
                if (s.kitapAdi.equals(bilgi) || s.yazarAdi.equals(bilgi)) {
                    System.out.println(w);
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("Bu bilgilerle eslesen bir kitap bulunamadi.");
        }
    }
	

	private static void noIleGoruntule() {
		
		System.out.println("Goruntulemek istediginiz kitabin numarasini giriniz:");
		int kitapNo = scan.nextInt();
		
		System.out.println(kitapListe.get(kitapNo));
		
	}

	private static void kitapEkle() {
		
		System.out.println("Lutfen kitabin adini giriniz: ");
		String kitapIsim = scan.nextLine();
		System.out.println("Lutfen yazarin adini giriniz: ");
		String yazarAdi = scan.nextLine();
		System.out.println("Kitabin yayin yilini giriniz: ");
		String yayin = scan.next();
		System.out.println("Kitabin satis fiyatini giriniz: ");
		int fiyat = scan.nextInt();
		
		Kitapci k = new Kitapci(kitapIsim, yazarAdi, yayin, fiyat);
		
		List <Kitapci> kk = new ArrayList<>();
		
		kk.add(k);
		
		kitapListe.put(++kitapNo, kk);
	}

	@Override
	public String toString() {
		
		return kitapAdi + " " + yazarAdi + " " + yayinYili + " " + fiyat;
	
}
}
