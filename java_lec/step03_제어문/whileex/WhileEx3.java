package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 1.사각형 2.삼각형 3.원 4.종료
 * 선택하세요 : 1
 * 사각형이 선택되었습니다.
 * 
 * 1.사각형 2.삼각형 3.원 4.종료
 * 선택하세요 : 4
 * *** 종료합니다 ***
 * 
 */
public class WhileEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//while loop안에 switch문
		int n;
		while(true) {
			System.out.print("1.사각형 2.삼각형 3.원 4.종료\n선택하세요 : ");
			n=Integer.parseInt(br.readLine());
			switch(n) {
			case 1: System.out.println("사각형을 선택하였습니다."); break;
			case 2: System.out.println("삼각형을 선택하였습니다."); break; 
			case 3: System.out.println("원을 선택하였습니다."); break;
			case 4: System.out.println("*** 종료합니다 ***");
				System.exit(0);// 강제종료, 정상종료(시스템 종료)
			}
			/*
			 * dowhile문으로 사용할 경우
			 do {
				System.out.print("1.사각형 2.삼각형 3.원 4.종료\n선택하세요 : ");
				n=Integer.parseInt(br.readLine());
				switch(n) {
				case 1: System.out.println("사각형을 선택하였습니다."); break;
				case 2: System.out.println("삼각형을 선택하였습니다."); break; 
				case 3: System.out.println("원을 선택하였습니다."); break;
				case 4: System.out.println("*** 종료합니다 ***");
					System.exit(0);// 강제종료, 정상종료(시스템 종료)
				}while(true);
				
				*/
		}
	}

}
