package ifEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 중첩 if문 사용
 * 3개 과목의 점수를 입력 받아 합격 불합격 출력하기
 * 3개 과목이 전부 40 이상이어야 하고 평균이 60이상이어야 "합격"
 * 평균이 60이 넘지만 1개의 과목이라도 40미만이라면 과락으로 "불합격"
 * 평균이 60 미만이면 "불합격" 출력
 * 
 * --결과
 * 국어 점수 입력 : 75
 * 영어 점수 입력 : 80
 * 수학 점수 입력 : 100
 * 결과 = 합격
 * 결과 = 과락으로 불합격
 */
public class ifEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int kor, eng, mat, tot;
		double avg;
		
		//40이하 or..?
		System.out.print("국어 점수 입력 : ");
		kor=Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력 : ");
		eng=Integer.parseInt(br.readLine());
		System.out.print("수학 점수 입력 : ");
		mat=Integer.parseInt(br.readLine());
		
		tot=kor+eng+mat;
		avg=tot/3.0;
		
		// || or, && and
		/*
		//내 코드
		if(kor>=40 && eng>=40 && mat>=40 || avg>=60) {
			System.out.println("합격");
			if(avg<=60) {
				System.out.println("불합격");
			}else {
				
			}
		}else {
			System.out.println("과락으로 불합격");
		}
		*/
		
		//강사님 코드
		if(avg>=60) {
			if(kor<40 || eng<40 || mat<40) {
				System.out.println("과락으로 불합격");
			}else {
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격");
		}
		
		
	}

}
