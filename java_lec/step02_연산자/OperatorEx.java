package step02_연산자;

public class OperatorEx {

	public static void main(String[] args) {

		//변수의 초기화
		//값을 사용하기 전에 출력하는 경우가 있는데 그때 사용
		//어떤 함수를 사용해서 값을 초기화를 하는데 ....
		String a=null; //디폴트 초기화 // String a=""; 데이터를 넣지 않은 상태
		int b=0; //정수 데이터는 0으로 초기화 
		float c=0.0f;
		//double z=0.0;//?
		char d='\0'; // 널문자 / null이랑은 다르다..?공백 char를 초기화 할 때 사용
		
		System.out.println(a+" "+b+" "+c+" "+d);
				
		
		//--------------------------------------------
		
		//연산자 오버로딩 : 연산자 만들어서 사용하는것?? 
		/*
		//삼항연산자 : 항이 3개인것 / 연산자가 3개
		//if문과 비슷
		char code='남';
		String gender;
		
		//좌변과 일치하는 자료형이 와야한다.
		gender=(code=='M' || code=='남')?"man":"woman";
		System.out.println("성별 : "+gender);
		
		//부정연산
		//플래그처럼 사용
		//플래그란..... 참거짓 상태를 나타내는 것? 대표적인게 전등 스위치
		boolean ck=true;
		System.out.println(!ck);
		*/
		
		
		//--------------------------------------------
		/* 이항연산자
		int k=5;
		
		//앞에 위치하면 전위 연산자
		//후위연산자				
								// 화면 	메모리
		System.out.println(k++);// 5 	 6
		System.out.println(++k);// 7	 7
		System.out.println(k);	// 7	 7
		System.out.println(--k);// 6	 6
		System.out.println(k--);// 6	 5
		
		int p=3;
		p+=2; // p=p+2 //5
		p*=3; // p=p*3 //15
		p-=2; // 13
		p%=3; // 나머지 1 //나머지 연산
		
		System.out.println(p);
		*/
		
		//-----------------------------------------------
		
		/*
		//boolean 참거짓 자료형
		//플래그(?)의 개념이 강하기 때문에 잘 사용 안함
		int score=57;
		boolean sw=(score>=70 && score<90);
		
		System.out.println(sw);
		*/
		
		//------------------------------------------------
		
		/*
		//연산자를 출력문으로 확인
		System.out.println(5/3); //1 몫
		System.out.println(5%3); //2 나머지
		
		//관계연산?
		int a=5;
		
		System.out.println(a==5); // a가 5인가? 같은가? true
		
		System.out.println(a>=5); // a가 5보다 크거나 같은가? true
		
		System.out.println(a!=5); // (부정) a가 5가 아닌가? 네 true 아니오 false
		
		//And 연산자 겹치는 부분을 검사할 때 사용 / 둘다 참이면 참, 둘중 하나만 참이면 거짓
		//Or 연산자 갈라져있는거? / 둘중 하나가 참이라면 참
		String str="korea";
		System.out.println(str=="korea" || str=="KOREA"); // str이 korea인가?
		System.out.println(str=="korea" && str=="KOREA"); // and 연산자
		
		int score=57;
		System.out.println(score>=70 && score<90); 
		*/
		
	}

}









