package oyun;

import java.util.ArrayList;
import java.util.List;

public class Kutular {
	
	List<Kutu> kutuListesi= new ArrayList<>();

	  public void KutuEkle(Kutu kutu) {
		  kutuListesi.add(kutu);
		  
	  }
	  public void kutuActir (int kutuNumarasi) {
		  
		 for (Kutu each : kutuListesi) {
			
			 if (kutuNumarasi==each.getKutuNumarasi()) {
				System.out.println("kutudaki miktar = "+ each.getParaMiktari());
				kutuListesi.remove(each);
				break;
			}
		}
	  }
	  public int kalanKutuSayisi() {
		  
		  
		  return kutuListesi.size();
	  }
	  public int kalanKutulardakiTopMikPara() {
		  int toplamPara=0;
		  for (Kutu each : kutuListesi) {
			toplamPara+=each.getParaMiktari();
		}
		  
		  return toplamPara;
	  }
	  public void secilenKutuyuKutListKaldir(int kutuNumarasi) {
		  
		  for (Kutu each : kutuListesi) {
			
			  if (kutuNumarasi==each.getKutuNumarasi()) {
				  kutuListesi.remove(each);
				  break;
				
			}
		}
		  
	  }
	  public int yapimcininTekAl(int oyuncununKutusubdakiPara){
		  
		  int teklif=(kalanKutulardakiTopMikPara()+oyuncununKutusubdakiPara)/3;
		  
		  return teklif;
	  }
	  public String acilmamisKutuGos() {
		  
		  String acilmaisKutular="";
		  
		  for (Kutu each : kutuListesi) {
			acilmaisKutular=acilmaisKutular+" "+ each.getKutuNumarasi();
		}
		  
		  return acilmaisKutular;
	  }

}
