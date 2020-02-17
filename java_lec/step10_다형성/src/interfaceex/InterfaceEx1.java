package interfaceex;
//----------------------------------------인터페이스
//클래스 생성
//pm이 abstract class 만들어서 배포
//
interface Shape{
	//인터페이스에선 final이나 abstract가 있으나 마나 결과적으로 상관이 없다.
	/* final */ int r=10;
	/* abstract */ public void draw();//미완성 상태의 클래스
	/* abstract */ public void erase();
}
//메서드에 오버라이드가 안되면 에러 메세지가 뜬다
//인터페이스는 상속이라고 표현 안하고 구현이라고 표현한다.
class Circle implements Shape{
	@Override
	public void draw() { //강제 오버라이딩(재정의)
		System.out.println("반지름이 "+r+"인 원을 그린다");
	}
	@Override
	public void erase() { //강제 오버라이딩
		System.out.println("원을 지운다");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		//객체 생성
		Circle cir=new Circle(); 
		cir.draw();
		cir.erase();
		
	}

}
//---------------------------------------추상(미완성)클래스
/*
//클래스 생성
//pm이 abstract class 만들어서 배포
//
abstract class Shape{
	final int r=10;
	abstract public void draw();//미완성 상태의 클래스
	abstract public void erase();
}
//메서드에 오버라이드가 안되면 에러 메세지가 뜬다
class Circle extends Shape{
	@Override
	public void draw() { //강제 오버라이딩(재정의)
		System.out.println("반지름이 "+r+"인 원을 그린다");
	}
	@Override
	public void erase() { //강제 오버라이딩
		System.out.println("원을 지운다");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		//객체 생성
		Circle cir=new Circle(); 
		cir.draw();
		cir.erase();
		
	}

}
*/
//---------------------------------------일반 클래스
/*
//클래스 생성
class Shape{
	final int r=10;
	public void draw() {}
	public void erase() {}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("반지름이 "+r+"인 원을 그린다");
	}
	@Override
	public void erase() {
		System.out.println("원을 지운다");
	}
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		//객체 생성
		Circle cir=new Circle(); 
		cir.draw();
		cir.erase();
		
	}

}
*/