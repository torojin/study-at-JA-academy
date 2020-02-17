package forex;

public class ForEx2 {

	public static void main(String[] args) {
		
		/*
		//정수형 배열
		//배열 : 동일한 자료형의 연속된 기억공간
		//아래 배열은 첨자 5 인덱스5?
		//length 배열의 길이를 알고자 할 때 사용
		//length() 문자열의 길이를 알고자 할 때 사용
		int [] num = {101, 102, 103, 104, 105};
		
		//0부터 4까지 
		//num.length : num의 배열의 길이 
		//for문은 2가지 형식이 있다
		//기존의 for문
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		//향상된 for문
		//임의의 기억공간을 만들어준다.
		//내부적으로 자료가 들어오는데..
		//처음부터 끝가지 순차로 작동, 역순으로는 작동 안함
		//단점은 일부분만 사용하면 기존 for문이 편하다.
		for(int n : num) {
			System.out.println(n);
		}
		*/
		
//		-----------------------------------------------
		
		//문자열형 배열
		/*
		String[] color= {"red", "green", "blue"};
		
		for(int i=0; i<color.length; i++ ) {
			System.out.println(color[i]);
		}
		
		//향상된 for문
		//뒤에 조건은 무조건 배열이여야한다.
		for(String a : color) {
			System.out.println(a);
		}
		*/
//		continue, break;
		
		for(int a=1; a<=10; a++) {
			if(a==5) {
				continue; //5가 출력이 안됨 / 생각보다 많이 사용함 
				//반복문에서만 사용 조건을 거는 경우 조건에 해당하는 경우 건너뛰고 싶다할때 사용하는것
//				break; //상위에 있는 루프가 종료 
			}
			System.out.print(a+" ");
		}
	}

}
