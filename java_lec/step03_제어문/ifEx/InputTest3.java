package ifEx;
/* 입력 테스트
 *  이름 : 강호동
 *  성별 : 남
 *  나이 : 23
 *  
 *  이름은 강호동입니다.
 *  성별은 남자입니다
 *  나이는 23세 입니다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest3 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String name;
		char gender;
		int age;
		
		System.out.print("이름 : ");
		name=br.readLine();
		System.out.print("성별 : ");
		gender=br.readLine().charAt(0);
		System.out.print("나이 : ");
		age=Integer.parseInt(br.readLine());
		
		System.out.println("이름은 "+name+"입니다.");
		System.out.println("성별은 "+gender+"자 입니다.");
		System.out.println("나이는 "+age+"세 입니다.");
		
		System.out.printf("이름은 %s입니다.\n", name);
		System.out.printf("성별은 %c자입니다.\n", gender);
		System.out.printf("나이는 %d입니다.", age);
		
		
	}

}
