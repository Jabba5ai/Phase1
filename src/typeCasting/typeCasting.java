package typeCasting;

public class typeCasting {
	
	public static void main (String[] args) {
		
		char a = 'A';
		
		//Implicit
		
		double d1 = a;
		System.out.println("The value of d1 is "+d1);
		
		// Explicit
		
		double d = (int)a;
		System.out.println("The value of d is "+ d);
	}
}