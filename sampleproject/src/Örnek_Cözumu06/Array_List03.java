package Örnek_Cözumu06;

import java.util.Arrays;

public class Array_List03 {

	public static void main(String[] args) {
		 // multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
        // birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
        // yazdıran programı yaziniz.
        // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
        int arr[][] = { { 10, 20, 30 }, { 4 }, { 6, 7, 20 } };
        
        int sonuc[]=new int[arr.length];
        
       
        
        for (int i = 0; i < arr.length; i++) {
        	
        	 int toplam=0;
			
        	for (int j = 0; j < arr[i].length; j++) {
				
        		toplam+=arr[i][j];

			}
        	
        	sonuc[i]+=toplam;
        	
		}

        System.out.println(Arrays.toString(sonuc));
        
	}

}
