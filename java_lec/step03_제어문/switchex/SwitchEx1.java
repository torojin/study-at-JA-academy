package switchex;

public class SwitchEx1 {

	public static void main(String[] args) {
		
		char sw='g';
		
		//위에서 아래로 쭉읽어가면서 실행하는 구조
		//switch문에서는 물어보질 않는다
		//구문 안에서만...조건을 넣는건가
		switch(sw) {
		case 'E':
		case 'e': 
				System.out.println("excellent"); 
				break;
		case 'G':
		case 'g': 
				System.out.println("good"); 
				break;
		default:
				System.out.println("fail");
		}
		
		/*
		char sw='g';
		
		if(sw == 'E'|| sw == 'e') {
			System.out.println("excellent");
		}
		else if(sw == 'G'|| sw == 'g') {
			System.out.println("good");
		}
		else {
			System.out.println("fail");
		}
		*/
		
		/*
		int score=95;
		char grade;
		
		//java는 엄격해서 조건식 정수로..?
		//break를 안걸면 그냥 실행됨.
		switch(score/10) //조건식은 정수값 
		{
		case 10:
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F';
		}
		
		System.out.println("점수는 "+score+"점이고 학점은 "+grade+"입니다.");
		*/
	}

}
