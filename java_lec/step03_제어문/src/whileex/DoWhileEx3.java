package whileex;
//do~while을 이용하여 65~90 사이의 난수 10개 생성하기

import java.util.Random;

//78 66 ... 88
public class DoWhileEx3 {

	public static void main(String[] args) {
		/* 강사님 코드
		int cnt=0; //초기값 지정
		int num; //변수 선언
		do {
			num=(int)(Math.random()*26+65);//난수 생성
			System.out.print(num+" "); //출력
//			 System.out.print(cnt); //반복문 변수
			++cnt;//증감식
		}while(cnt<10);
		*/
		
		int a=0;
		do {
			Random rd=new Random();
			int b=rd.nextInt(26)+65;
			System.out.print(b+" ");
			++a;
		}while(a<10);
		
		/*
		 * 
		int b;
		do {
			//난수용 변수 선언
			Random rd=new Random();
			int a=rd.nextInt(26)+65;
			//난수 생성 반복하기
			b = 10;
			//생성된 난수를 출력
			System.out.println(a);
			//횟수를 지정하는 변수를 만들어야 됨
			++a;
		}while(b>0);
		*/
	}

}
