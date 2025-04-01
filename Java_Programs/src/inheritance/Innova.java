package inheritance;

public class Innova extends Maruti{
	
	public void color(){
		System.out.println("White");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Innova in =new Innova();
in.speed();  //child class method
in.model();  //parent class method
in.variant();  //parent class method
in.color();     //sub-child class method

	}

}
