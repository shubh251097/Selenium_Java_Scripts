package inheritance;

public class B extends A {
	
	public void car() {
		System.out.println("New Car");
	}
	public void m3() {
		System.out.println("This is m3 method");
	}
		
	public static void main(String[] args) {
		B obj = new B();
	obj.parent();
	obj.car();
	obj.m3();

	
}
}