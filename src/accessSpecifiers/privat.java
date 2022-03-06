package accessSpecifiers;

public class privat {
	private int age = 23;
	private void display() {
		System.out.println("Hi ra mowa bro");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		privat o = new privat();
		o.display();
		
		
		
	}

}