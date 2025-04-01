package exception_handling;

public class Exception1 {
 
 
 
	public static void main(String[] args) {
		String str="Shubham";
		
	
	try {

		System.out.println(str.charAt(7));
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	finally {
		System.out.println("This block will always execute");
	}
	
			
	
	
	
}
	}


