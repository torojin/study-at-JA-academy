package step02_연산자;

//java.io에 있는 패키지를 사용할 수 있게 만들어 줌
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//콘솔 : 표준 입출력 장치
public class InputTest1 {
	//throws IOException 예외상황 발생시 언지기..?
	public static void main(String[] args) throws IOException {
		//Ctrl + space바 누르면 import됨
		InputStreamReader isr=new InputStreamReader(System.in);//키보드에서 들어가는 데이터..??
		BufferedReader br=new BufferedReader(isr); //키보드에서 전달받은 데이터를...
		
		
		String name;//문자열 선언
		char gender;
		int age;
		Float weight;
		double tall;
		
		//.라는 의미 
		//1.포함 
		//br아래 readLine이라는 함수가 있다고 보면 된다.
		//2.입력 함수의 입력으로 잡는다

		System.out.print("이름을 입력하세요 : ");
		name=br.readLine();
		
		System.out.print("성별을 입력하세요 : ");
		gender=br.readLine().charAt(0);//0번째 자리에 있는 char를 뽑아냄...??
		// charAt(i) : 문자 1개 추출
		//i는 추출하고자 하는 값의 인덱스
		//입력은 charAt(i) 앞에 기술 :
		
		//System.out.println("한글과 컴퓨터".charAt(2));
		
		System.out.print("나이를 입력하세요 : ");
		age=Integer.parseInt(br.readLine());
		
		System.out.print("체중를 입력하세요 : ");
		weight=Float.parseFloat(br.readLine());
		
		System.out.print("신장를 입력하세요 : ");
		tall=Double.parseDouble(br.readLine());
		
		//이름 입력 후 출력됨
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		System.out.println("체중 : "+weight);
		System.out.println("신장 : "+tall);
	}

}


















