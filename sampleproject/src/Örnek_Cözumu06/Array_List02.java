package Örnek_Cözumu06;

public class Array_List02 {

	public static void main(String[] args) {
		/*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7} 
         * Output : 4
         */
        
        int arr[]= {1,2,-10,4,8,56,3} ;
        double toplam=0;
        double ort=0;
        
        for (int each : arr) {
			
        	toplam+=each;
        	
		}
        ort=toplam/(arr.length);
        System.out.println("Array in ortalama degeri : "+ort);
        
        for (int i : arr) {
			
        	if (i>=ort) {
				
        		System.out.print("Arrayin ortalamadan buyuk elemanlari "+i+" ");
        		
			}
        	
		}
        
	}

}
