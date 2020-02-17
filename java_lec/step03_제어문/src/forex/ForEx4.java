package forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader를 이용하여 작성
 * 
 * 1. 문자를 입력받기(대문자)
 * 2. 랜덤하게 대문자 30개를 발생하여 화면에 출력
 * 3. 발생한 문자 중 입력한 문자가 몇개인지 출력하기
 * 
 * --결과
 * 문자 입력 : K
 * X H G D H I U D R ... K W E R
 * 
 * K의 개수 : 5
 * 
 */
//TIP
//아스키코드 사용
//for문이 돌아가는 흐름만 파악하면 k의 개수 구할 수 있다
public class ForEx4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char cap; //입력값 변수
		char x; //랜덤값 변수
		int test=0; //비교값 증가를 위한 변수
		
		//1. 값을 입력 받기 위한 코드
		System.out.print("문자 입력 : ");
		cap=br.readLine().charAt(0); //입력 받기 위해 사용
		
		//2. 램덤 문자를 30개 출력하기 위한 반복문
		for(int i=1;i<30;i++) {
			x=(char)(Math.random()*26+65);//65~91 //실수형을 정수형으로 형변환/char은 정수형 내뱉는 값을 문자값으로 내뱉는다
			System.out.print(x+" ");
			//test는 char형이 아니다
			//3.입력값 K을 개수를 증가시키기 위한 비교 조건
			if(cap==x) {
				++test;
			}
		}
		//4.입력받은 개수를 출력하기 위한 print문
		System.out.println("\n"+cap+"의 개수 : "+test);
		
	}

}
