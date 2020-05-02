package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*switch문 사용
 * 숫자를 입력하세요 : 5
 * 
 * 5는 홀수입니다.
 */

public class SwitchEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int num;
		
		System.out.print("숫자를 입력하세요 : ");
		num=Integer.parseInt(br.readLine());
		
		switch(num%2) {
		case 0: System.out.println(num+"는 짝수입니다"); 
			break;
		case 1: System.out.println(num+"는 홀수입니다"); 
			break;
		default: System.out.println("입력에 문제가 있어요"); 
			break;
		}
			
	}

}
