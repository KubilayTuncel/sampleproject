package sampleproject;

public class Counter1 {
	int count;
	static int stCount;
	public Counter1 () {
		count++;
		stCount++;
		
	}
	public int getCount() {
		return count;
	}
	public static int getStCount() {
		return stCount;
	}
	
	public static void main(String[] args) {
		
		Counter cs1=new Counter ();
		Counter cs2=new Counter ();
		Counter cs3=new Counter ();
		Counter cs4=new Counter ();
		Counter cs5=new Counter ();
		Counter cs6=new Counter ();
		
		System.out.println("count is : "+cs1.getCount());
		System.out.println("stCount is : "+cs1.getStCount());
			
	}
}
