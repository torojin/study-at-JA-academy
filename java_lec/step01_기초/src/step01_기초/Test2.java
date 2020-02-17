package step01_기초;
/* 변수 4개(이름, 국어, 영어, 수학)를 만들고
 * 대입 후 결과와 같이 완성하세요
 * --결과
 * 이름 : 강호동
 * 국어 : 85
 * 영어 : 73
 * 수학 : 68
 * 총점 : 226점
 * 
 */

public class Test2 {

	public static void main(String[] args) {
		String name="강호동";
		int kor,eng,mat;
		kor=85;
		eng=73;
		mat=68;
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("총점 : "+(kor+eng+mat)+"점");

	}

}
