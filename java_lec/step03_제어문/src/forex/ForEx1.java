package forex;
//for(초기값; 조건식; 증감식) {}==> for(int i=0; i<10; i++){}
//for(초기값; 조건식; 증감식) {}==> for(char i='A'; i<'Z'; i++){}
//정수자료형이면 문제가 없지만 실수 자료형이라면 좀 다르게 적용해야한..? 적용이 안되는건가?
public class ForEx1 {

	public static void main(String[] args) {
		
		//3개씩 빼는거
		for(int i=100; i>=80; i-=3) {
			System.out.println(i+" ");
		}
		
		//A B C ...Y Z
		//for문을 이용해서 풀어보자
		//초기값을 넣는데 문자형인 경우 char
		//범위도 문자로 출력할 수 있다
		//char는 int로 자동 변환한다.
		//char+int=int // char+char=int
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i+" ");
		}
		
		/*
		//홀수 합을 출력하세요
		int sum=0, odd=0, even=0;		
		for(int i=1;i<=10; i++) {
			sum+=i; //sum=sum+i
			//코드작성 switch문 사용
			//if사용해도 됨
			switch (i%2) {
			case 1 : odd+=i; break; //odd=odd+i
			case 0 : even+=i;break;
			//3의 배수 합계는3으로 나누어서 나머지가 0으로 출력이 되면 됨
			}
		}
		
		System.out.println("합계 : "+sum);
		System.out.println("홀수 합 : "+odd);
		System.out.println("짝수 합 : "+even);
		*/
	}

}
