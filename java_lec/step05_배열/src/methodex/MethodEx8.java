package methodex;

public class MethodEx8 {
	
	public static void view1() {
		System.out.println("static method");
	}
	
	//static 키워드가 빠진 메서드 instance method
	public void view2() {
		System.out.println("non-static method");
	}
		
	public static void main(String[] args) {
		//클래스 메서드 (class method) : 객체 없이 호출 가능
		MethodEx8.view1();
		view1();//자기 자신의 메서드에 접근할 때는 클래스 이름 생략 가능
		
		//클래스의 오브젝트는 인스턴스, 클래스 인스턴스가 오브젝트
		
//		Math.random();//이것도 클래스 메서드
		
		MethodEx8 ob=new MethodEx8(); //클래스 이름 / 객체 생성
		ob.view2(); //인스턴스 메서드 (instance method)
		//인스턴스 메서드는 반드시 객체를 생성하고 메서드를 호출해야 함
		
	}

}
