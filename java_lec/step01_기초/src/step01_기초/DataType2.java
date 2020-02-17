package step01_기초;
//System.out.printf("메시지 or 제어문자", 변수1, 변수2, 변수3...);
//printf는 소수점 아래 표현하기 위해 / 실수를 잘라서 사용하기 위해서 많이 사용한다.
//응용프로그램, 웹쪽에서는 printf는 거의 사용안한다.
/* 제어문자
 * %s : String 문자열, char
 * %c : char 문자 1개
 * %f : float, double 실수
 * %d : int byte 정수
 * */

public class DataType2 {

	public static void main(String[] args) {
		String name="홍길동";
		char gender='남';
		double score=85.3;
		int age=25;
		double tall=183.4;
		
		//printf에서는 +사용안하고 ,사용
		//제어문자 서식문자를 사용해줘야 함
		//%s를 넣으면 함수를 넣으겠거니..?
		System.out.printf("이름: %s\n", name);
		System.out.printf("성별: %c\n", gender);
		System.out.printf("점수: %-10.1f\n", score); //-10 10자리로 표현하는데 왼쪽 정렬 //-10.1소수점 아래 1자리
		System.out.printf("나이: %10d\n", age); //+10 10자리 오른쪽 정렬
		System.out.printf("신장: %.2f\n", tall); //소수점 아래 2자리만 표현
		System.out.println("------------------------");
		System.out.println("total : " +String.format("%.1f",score));
	}

}
