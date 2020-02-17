package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedReader 읽어드리는 용도
//InputStreamReader 
//java io class로 데이터를 처리하게끔 만들어서  채팅할 수 있게 만들수도 있고..
public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//객체 단위로 움직인다 / 객체는 : 사용자 정의..?
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);//InputStreamReader의 속도를 빠르게 해줌..?
		
		int eno;
		String ename;
		char dept;
		double score;
		
		System.out.print("사원번호를 입력하세요 : ");// print 줄바꿈없는거 //println 줄바꿈 있는거
		eno=Integer.parseInt(br.readLine()); //문자열을 숫자로 변환해주는 캐이싱..?해줌
		
		System.out.print("사원이름을 입력하세요 : ");
		ename=br.readLine();//문자열 받는거 
		
		System.out.print("부서코드를 입력하세요 : ");
		dept=br.readLine().charAt(0);
		
		System.out.print("입사성적을 입력하세요 : ");
		score=Double.parseDouble(br.readLine());
		
		System.out.println("사원번호 : "+ eno);
		System.out.println("사원이름 : "+ ename);
		System.out.println("부서코드 : "+ dept);
		System.out.println("입사성적 : "+ String.format("%.2f",score)+"점");
		System.out.printf("입사성적 : %.2f점\n",score);		
		
	}

}
