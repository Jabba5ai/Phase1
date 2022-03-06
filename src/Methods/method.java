package Methods;

public class method {
	public int addnumbers(int a, int b) {
		int z = a + b;
		return z;
	}

	public static void main(String[] args) {
		method b = new method();
		int ans = b.addnumbers(10, 3);
		System.out.println("Addition is :" + ans);
	}
}
