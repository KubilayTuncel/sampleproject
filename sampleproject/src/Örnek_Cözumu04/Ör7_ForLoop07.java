package Örnek_Cözumu04;

public class Ör7_ForLoop07 {

	public static void main(String[] args) {
//      1
//      2 3
//      4 5 6
//      7 8 9 10
//      11 12 13 14 15
//      16 17 18 19 20 21
//      22 23 24 25 26 27 28
//      29 30 31 32 33 34 35 36
		
		int sayi=1;
		
		for (int i = 1; i <=8; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(sayi++ + " ");
			}
			System.out.println("");
		}

	}

}
