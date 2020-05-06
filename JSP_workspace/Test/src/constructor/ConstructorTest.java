package constructor;

public class ConstructorTest {
	public ConstructorTest() {
		System.out.println("Call Main Class Constructor");
	}
	
	public static void main (String[] args) {
		ConstructorTest A = new ConstructorTest();
		
		SubClass subClass = new SubClass();
		new SubClass("테스트");
	}
}




class SubClass {
	public SubClass() {
		System.out.println("Call Constructor");
	}
	public SubClass(String a) {
		System.out.println(a+" Check");
	}
}