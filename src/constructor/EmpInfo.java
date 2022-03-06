package constructor;

class Define {
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}
}

public class EmpInfo {

	public static void main(String[] args) {

		Define emp1 = new Define();
		Define emp2 = new Define();
		emp1.display();
		emp2.display();
	}
}
