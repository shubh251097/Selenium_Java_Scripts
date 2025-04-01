package inheritance;

public class Method_Overloading {

	public void add() {
		System.out.println('a');
	}
		public void add(int a,int b) {
		System.out.println(a+b);
		}
		
		public void add(int a, int b, int c) {
			System.out.println(a*b*c);
		}
			public void add(String s) {
				System.out.println("String");
			}
		
	
	public static void main(String[] args) {
		Method_Overloading ov=new Method_Overloading();
		ov.add();
		ov.add(5, 10);
		ov.add(3, 2, 2);
		ov.add("Shuham");

	}

}
 