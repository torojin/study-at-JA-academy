package inputex;
//printf출력
public class InputTest5 {

	public static void main(String[] args) {
		int eno=101;
		String ename="홍길동";		
		char dept='A';//아스키 코드 체계 영어같은경우 1byte로 처리 하지만 나라마다 언어 체계가 유니코드이거나.. 사용하면 2byte or 3byte사용
		double score=85.9;
		
		System.out.printf("사원번호 : %d\n", eno);
		System.out.printf("사원이름 : %s\n", ename);
		System.out.printf("부서코드 : %c\n", dept);
		System.out.printf("입사성적 : %.2f\n", score);
		
		//부동소수점수
	}

}
