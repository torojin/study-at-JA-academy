package object;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//Scanner
		//입력
		Scanner sc=new Scanner(System.in);
		
	
		System.out.print("문자열 : ");
		String str=sc.nextLine();
		
		System.out.print("정수 : ");
		int a=sc.nextInt();
		
		System.out.print("실수 : ");
		double b=sc.nextDouble();
		sc.nextLine();// 버퍼 비우기 \n,\r
		
		System.out.print("문자 : ");
		char c=sc.nextLine().charAt(0);//버퍼 비우기 후 배치하면 에러 발생 안함
		//버퍼 비우기 안하면 에러 발생
	
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close(); //Scanner는 꼭 닫아줘야한다 안그럼 에러 발생
	}

}
