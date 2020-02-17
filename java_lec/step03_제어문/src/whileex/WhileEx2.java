package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 단을 입력받아 구구단을 출력하세요
 * 
 * --결과
 * 단을 입력하세요 : 7
 * 7 * 1 = 7
 * 7 * 2 = 14
 *   :
 * 7 * 9 = 63
 * 
 */
public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n, tmp=1;
		
		System.out.print("단을 입력하세요 : ");
		n=Integer.parseInt(br.readLine());
		
		while(tmp<=9) {
			System.out.println(n+" * "+tmp+" = "+(n*tmp));
			++tmp;
		}
				
	}

}
