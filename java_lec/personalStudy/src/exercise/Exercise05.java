package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제5] 다음을 입력받아 계산하시오
        (삼각형넓이 = (밑변 * 높이)/2)  

[입력화면]
**** 삼각형의 넓이 구하기  ****
밑변 :  10  
높이 :   3
   

[출력화면]
넓이 :   15.00  <--- 소수 2자리까지출력하시오
 */
public class Exercise05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int bot, hei;
		
		System.out.println("*** 삼각형의 넓이 구하기 ***");
		System.out.print("밑변 : ");
		bot=Integer.parseInt(br.readLine());
		
		System.out.print("높이 : ");
		hei=Integer.parseInt(br.readLine());
		
		int tot=(bot*hei);
		double area=tot/2.0;
		System.out.println("넓이 :"+String.format("%.2f",area));
		
	}

}
