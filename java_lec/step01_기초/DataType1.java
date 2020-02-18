package step01_기초;

public class DataType1 {

	public static void main(String[] args) {
		String name="홍길동"; //문자열 자료형
		int age=23; //4바이트 정수 자료형 +2147483647 ~ -2147483648
		char gender='남'; // 문자 1개는 '' 안에 사용 //파이선에서는 글자 한 자를 구분 안하고 사용
		float weight=63.4f; // 4바이트 실수 자료형 불럿자료형으로 만들기 위해 끝에 f넣음 //실무에서는 잘 사용 안함 
		double tall=175.5; // 8바이트 실수 자료형 기본적으로 사용하는 실수자료형
		
		//보통 이런 형식으로 사용
		System.out.println("이름: "+name); 
		System.out.println("나이: "+age+" 세");
		System.out.println("성별: "+gender+"자");
		System.out.println("체중: "+weight+"kg");
		System.out.println("신장: "+tall+"cm");
		
		//이와 같은 방식은 정리하기 힘들어서 잘 안사용..
		System.out.println("이름: "+name+
							"\n나이: "+age+" 세"+
							"\n성별: "+gender+"자"+
							"\n체중: "+weight+"kg"+
							"\n신장: "+tall+"cm");		 		
		
//		System.out.println("이름: 홍길동");
//		System.out.println("나이: 23");
//		System.out.println("성별: 남");
//		System.out.println("체중: 63.4kg");
//		System.out.println("신장: 175.5cm");
		
		// 범위 지정 주석 지정 Ctrl + Shift + /
		//        주석 해제 Ctrl + Shift + \
		// 인덴테이션(정렬): Ctrl + Shift + f
	}

}
