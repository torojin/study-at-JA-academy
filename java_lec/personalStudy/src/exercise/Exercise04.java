package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제4] 다음을 입력받아 계산하시오

[입력화면]
Input name : 민들래
kor : 90 
eng : 70 
mat : 75

[출력화면]
이름 : 민들래
합계점수 : 235점
평균점수 :  78.3   <-- 소수 1자리까지출력하시오
 */
public class Exercise04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat;
		
		System.out.print("Input name : ");
		name=br.readLine();
		
		System.out.print("kor : ");
		kor=Integer.parseInt(br.readLine());
		
		System.out.println("eng : ");
		eng=Integer.parseInt(br.readLine());
		
		System.out.println("mat : ");
		mat=Integer.parseInt(br.readLine());
		
		int tot;
		tot=kor+eng+mat;
		double avg=tot/3.0;
		System.out.println("이름 : "+name);
		System.out.println("합계점수 : "+tot+"점");
		System.out.println("평균점수 : "+String.format("%.1f",avg));

	}

}
