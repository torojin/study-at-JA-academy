package methodex;
//call by reference : 참조에 의한 전달, 주소 전달
// 객체 자료형에서 사용, 클래스, 열거형, 배열, 인터페이스
// 매개변수를 전달할 때 참조에 의한 전달을 사용한다.
//참조 자료형은 전체영역에 영향을 미친다.

public class MethodEx7 {
	
	//원본데이터에 엑세스 할 수 있다
	public static void view1(String str) {
		System.out.println("view1 변경전 str : "+str);
		str="가나다";
		System.out.println("view1 변경후 str : "+str);
	}
	
	public static void view2(int[] num) {
		for (int n:num) {
			System.out.println("변경전 view2의 num : "+n);
		}
//		System.out.println();//줄바꿈
		num[2]=300;
		for(int n:num) {
			System.out.println("변경후 view2의 num : "+n);
		}
	}
	//c언어 배열--> 포인터, 포인터 --> 배열
	// char* test[] --> 배열 포인터
	// char** tset --> 2차원 배열
	public static void main(String[] args) {
		//str이라는 기억공간이 있으면 happy라는 문자열을 가르키고 있는것
		String str="happy";
		System.out.println("호출전 str : "+str);
		view1(str); //함수 호출
		System.out.println("호출후 str : "+str);
		System.out.println("----------------------------");
		
		int [] num= {10,20,30,40,50};
		for(int i:num)
		System.out.println("호출전 메인의 num : "+i);
		
		view2(num);
		for(int i:num)
		System.out.println("호출후 메인의 num : "+i);
	}

}
