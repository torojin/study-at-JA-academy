package methodex;
// call by name
public class MethodEx1 {

	//멤버 함수(메서드)
	//void가 나오면 가서 무언가 출력하고 끝난다.
	
	//public이 붙어있어야 외부에서 접근이 가능하다.
	//이벤트 리스너? 마우스 클릭 이동 등 그런 것들을 하드웨어 쪽에선 이벤트라고 표현한다. 
	//함수의 형태로... 있을때..? 
	
	//주의 사항
	//원칙적으론 함수안에 함수를 선언하지 않는다.
	//클래스 안에 클래스를 선언하지 않는다.
	//중첩클래스는 성능적으로 안좋다.
	
	
	public static void view() {
		System.out.println("Hello");
//		return; //생략가능, void일 때, 제어의 이동
		
	}
	
	public static void star() {
		System.out.println("******");
	}
	
	//메인 함수(메서드)
	
	public static void main(String[] args) {
		view();// call by name
		star();
		
		view();
		star();
	}

}
