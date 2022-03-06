package inner_class;

public class InnerClass {
	private String msg = "Hey Buddie :-}";

	class Inner {
		void hello() {
			System.out.println(msg + " What's Up....!!!");
		}
	}

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		InnerClass.Inner in = obj.new Inner();
		in.hello();
	}
}
