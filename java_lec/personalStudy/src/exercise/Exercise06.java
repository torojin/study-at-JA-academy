package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제6] 4개의 값을 콘솔에서 입력받아 처리하시오
        조건) 성별 : M 이면 "남자", 나머지 "여자" 
                (if문 이용)

[입력화면]
Input name: 장미란
Input gender: F
Input age:  25
Input tall: 173.3 

[출력화면]
이름 : 장미란
성별 : 여자 
나이 : 25세
신장 : 173.3cm  
 */
public class Exercise06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		char gender;
		int age;
		double tall;
		
		System.out.print("Input name : ");
		name=br.readLine();
		
		System.out.print("Input gender : ");
		gender=br.readLine().charAt(0);//왜 0를 썼더라...
		
		System.out.print("Input age : ");
		age=Integer.parseInt(br.readLine());
		
		System.out.print("Input tall : ");
		tall=Double.parseDouble(br.readLine());
		
		System.out.println("이름 : "+name);
		if(gender=='M'|| gender=='m') System.out.println("성별 : 남자");
		else if(gender=='F'||gender=='f') System.out.println("성별 : 여자");
		System.out.println("나이 : "+age+"세");
		System.out.println("신장 : "+String.format("%.1f",tall)+"cm");
	}

}
