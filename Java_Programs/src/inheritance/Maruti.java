package inheritance;

public class Maruti extends Car {
	public void speed() {
		System.out.println("Speed=100kmpl");
	}

	public static void main(String[] args) {
		
Maruti m =new Maruti();
m.model();
m.variant();
m.speed();

	}

}

