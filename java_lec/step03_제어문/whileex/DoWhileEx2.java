package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 다시 한번 실행할까요(y/Y)? Y
 * 다시 한번 실행할까요(y/Y)? y
 * 다시 한번 실행할까요(y/Y)? n  
 * 
 * *** 수고요 ***
 * * y만 검사 실행 그렇지 않을 경우 종료
 * 
 */
public class DoWhileEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ans;
		//char ans='\0'; //null값과 비슷 / 값자체는 없는 char를 초기화하기 위한 값
		//String으로 처리하면 주소값이 다를 경우에 다르다고 인지함.
		//\0으로 처리하면... 주소로 처리?
		//문자열 처리를 하려면... 
		do {
			System.out.print("다시 한번 실행할까요(y/Y)?");
			ans=br.readLine().charAt(0);
		}while(ans=='y' || ans=='Y');
		System.out.println("*** 수고요 ***");
	}

}
