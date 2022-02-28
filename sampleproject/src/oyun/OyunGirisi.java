package oyun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunGirisi {

	static List<Integer> paraListesi = new ArrayList<>();
	static Kutular kutular = new Kutular();
	static Scanner scanner = new Scanner(System.in);
	static int kutuNumaram;
	static int paraMiktarim;

	public static void main(String[] args) {
		/*
		 * 1. adim 10 farkli para miktari iceren kutular olsun ve  para listesi isminde bir
		 * liste olusturalim 2. adim 10 tane kutu olusturacagim. Bu kutalarin icerisine
		 * Listte olusturdugum para miktarlarini rastgele bir sekilde atacagim. Kutu
		 * isminde bir class olusturalim. Olusturdugumuz bu calssta kutuNumarasi ve
		 * paraMiktari adinda iki int. tipinde degisken olmali 3. adim yeni bir class
		 * olusturalim. Kutular ismini verelim. Kullanacagimiz methodlari burada
		 * olusturalim 4. adim oyunu baslatalim, kullanicidan secmek istedigi kutu
		 * numarisini alalim, secilen kutuyu var olan kutularin icerisinden kaldirmamiz
		 * gerek 
		 * public void KutuEkle(Kutu kutu) 
		 * public void kutuActir (int kutuNumarasi) 
		 * public int kalanKutuSayisi() 
		 * public int kalanKutulardakiTopMikPara() 
		 * public void secilenKutuyuKutListKaldir() 
		 * public void yapimcininTek.Al() 
		 * public String acilmamisKutuGos() 
		 * public void kaybedilenTutarlar()
		 */

		paraListesi.addAll(Arrays.asList(1, 10, 500, 1000, 5000, 10000, 50000, 100000, 250000, 500000));

		Collections.shuffle(paraListesi); // belirtilen listedeki elemanlarin yerini rastgele degistirir.

		for (int i = 0; i < 10; i++) {

			int kutuNo = i + 1;
			Kutu kutu = new Kutu(kutuNo, paraListesi.get(i));
			kutular.KutuEkle(kutu);

		}
		System.out.println("Oyunumuza hos geldiniz Lutfen bir kutu secin");
		kutuNumaram = scanner.nextInt();
		paraMiktarim = paraListesi.get(kutuNumaram - 1);

		kutular.secilenKutuyuKutListKaldir(kutuNumaram);
		kutuSecmeActirma();
	}

	public static void kutuSecmeActirma() {
		System.out.println("kalan kutular : " + kutular.acilmamisKutuGos());
		System.out.println("hangi kutuyu acmak istersiniz :");
		int secim = scanner.nextInt();
		kutular.kutuActir(secim);

		if (kutular.kalanKutuSayisi() == 7 || kutular.kalanKutuSayisi() == 4 || kutular.kalanKutuSayisi() == 1) {
			System.out.println("Teklifiniz : " + kutular.yapimcininTekAl(paraMiktarim));
			System.out.println("teklifi kabul ediyor musun(1-Evet 2-Hayir)");
			int yanit = scanner.nextInt();
			if (yanit == 1) {
				System.out.println("oyun bitti");
				System.out.println("kazanilan miktar : " + kutular.yapimcininTekAl(paraMiktarim));
				System.out.println("kendi kutunuzdaki miktar : " + paraMiktarim);
			} else {
				kutuSecmeActirma();
			}
		} else {
			if (kutular.kalanKutuSayisi() > 0) {
				kutuSecmeActirma();
			} else {
				System.out.println("oyun bitti");
				System.out.println("Kutunuzdaki miktar : " + paraMiktarim);
			}

		}
	}

}
