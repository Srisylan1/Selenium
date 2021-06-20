package commonMethod;

public class MulDiv extends AddSub {

	public void multiplication(int a, int b) {
		c = a*b;
		System.out.println("After multiplying a*b c=" +c);
	}
	public void division(int a, int b) {
		c = b/a;
		System.out.println("After dividing b/a c=" +c);
	}

	public static void main(String[] args) {
		MulDiv Total = new MulDiv();
		Total.addition(43, 56);
		Total.subtraction(105, 568);
		Total.multiplication(34, 67);
		Total.division(68, 89);
	}

}
