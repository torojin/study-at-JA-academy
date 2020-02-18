package step01_기초;

/*
 * float 변수를 만들고 75.3
 * double 변수를 만들고 89.53을 각각 대입한 후 
 * 
 * System.out.print();를 한번만 사용하여 출력하세요
 * 
 * --결과
 * 국어 점수는 75.3점이고
 * 수학 점수는 89.53점입니다.
 */
public class Test3 {

	public static void main(String[] args) {
		float kor=75.3f;
		double mat=89.53;
		
		System.out.print("국어 점수는 "+kor+"점이고\n"+"수학 점수는 "+mat+"점입니다.\n");
		System.out.println("국어 점수는 "+kor+"점이고\n"+"수학 점수는 "+mat+"점입니다.");
		System.out.printf("국어 점수는 %.1f 점이고 \n수학 점수는 %.2f점입니다.\n",kor,mat);
	}

}
