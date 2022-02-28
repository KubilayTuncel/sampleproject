package Örnek_Cözumu07;

public class C2_Runner2 extends C2_SubClass {

	public static void main(String[] args) {

		my_Method();
		
	}
	public static void my_Method() {
		
		C2_SuperClass obj = new C2_SuperClass();
		obj.goster();
		System.out.println(obj.num);
		C2_SubClass obj2 = new C2_SubClass();
		obj2.goster();
		System.out.println(obj2.num);
		
	}

}
