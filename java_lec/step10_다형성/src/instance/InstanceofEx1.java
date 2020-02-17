package instance;

//class 생성
//부모클래스
class A{}
//자식클래스 B,C / 부모클래스 A 상속
class B extends A{}
class C extends A{}
class D extends B{}
public class InstanceofEx1 {

	public static void main(String[] args) {
		//Object 생성
		A a=new A();
		B b=new B();
		D d=new D();
		
		//참조변수가 참조하는 인스턴스의 실체 타입을 알아보기 위한 연산자
		System.out.println(b instanceof A);//true / 참조변수로 출력 / 참조하고 있는 b가 인스턴스 A에 속해있는가? 
		System.out.println(a instanceof C);//false
		System.out.println(d instanceof A); //true 손자인데도 불구하고 부모클래스에 상속되어서 출력
//		System.out.println(b instanceof C); //error / 동등한 레벨이여서 관계가 없어서 에러 / 검사 조차 할 수 없다.
	}

}
