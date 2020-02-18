package ifEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 반지름을 입력하세요 : 5
 * 314/
 * 원의 넓이 :78.5(반*반*3.14)
 * 원의 둘레: 31.4(2*3.14*반)
 */
public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in); 
		BufferedReader br=new BufferedReader(isr);
		int a;
		double size, rnd;
		
		System.out.print("반지름을 입력하세요 : ");
		a=Integer.parseInt(br.readLine());
		//System.out.println("원의 넓이 : "+(a*a*3.14));
		size=3.14*a*a;
		rnd=2*3.14*a;
		System.out.println("원의 넓이 : "+size);
		System.out.println("원의 둘레 : "+String.format("%.1f", rnd));
		
		System.out.printf("원의 넓이 : %.1f\n", (size));
		System.out.printf("원의 둘레 : %.1f\n", (rnd));
			
	}

}
