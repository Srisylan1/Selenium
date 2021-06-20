package commonMethod;

public class AddSub {
	public int c;

	public void addition(int a, int b) {
		c = a + b;
		System.out.println("After adding a+b c =" +c);
	}
	public void subtraction(int a, int b) {
		c = b - a;
		System.out.println("After subtracting b-a c =" +c);
	}

}
