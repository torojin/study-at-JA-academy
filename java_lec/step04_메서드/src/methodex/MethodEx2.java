package methodex;

public class MethodEx2 {

	//정수 타입 함수 생성
	public static int view1() {
		return 10;
	}
	//리턴 타입이 char..?
	public static char view2() {
		return 'A';
	}
	
	public static float view3() {
		return 50.3f;
		//50.3으로만 쓰면 double형으로 인식
	}
	
	public static String view4() {
		return "Hello";
	}
	
	public static double view5() {
		return 100.4;
	}
	
	public static boolean view6() {
		return true; //or false
	}
	public static void main(String[] args) {
		int a=view1(); System.out.println(a);//변수에 함수를 대입
		char b=view2(); System.out.println(b);
		float c=view3(); System.out.println(c);
		
		System.out.println(view3()); //형태가 맞으면 이런 식으로 출력도 가능함 ex.float=float, String=String
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
		
	}

}
