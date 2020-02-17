package exercise;
/*
 [문제3] 다음 값을 각각 대입하여 출력하시오
           (name : 민들래 / kor : 90  / eng : 70 / mat : 75)

[출력화면]
이름 : 민들래
합계점수 : 235점
평균점수 :  78.3   <-- 소수 1자리까지출력하시오

 */
public class Exercise03 {

	public static void main(String[] args) {
		String name;
		name="민들래";
		int kor, eng, mat, tot;
		kor=90;
		eng=70;
		mat=75;
		tot=kor+eng+mat;
		double av=tot/3.0;
		
		System.out.println("이름 : "+name);
		System.out.println("합계점수 : "+tot);
		System.out.println("평균점수 : "+String.format("%.1f",av));
		//System.out.printf("평균점수 : %.1f", av);
	}

}
