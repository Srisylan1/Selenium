package commonMethod;

public class InheritanceChild extends InheritanceParent {
	public int cx = 20;
	public String cs = "TestNG";

	public void cmethod1() {
		System.out.println("cmethod1");
	}
	public void cmethod2() {
		System.out.println("cmethod2");
	}
	public void cmethod3() {
		System.out.println("cmethod3");
	}

	public static void main(String[] args) {
		InheritanceChild child = new InheritanceChild();
		child.pmethod1();
		child.pmethod2();
		System.out.println(child.ps);
		System.out.println(child.px);
		System.out.println(child.cs);
	}	

}

