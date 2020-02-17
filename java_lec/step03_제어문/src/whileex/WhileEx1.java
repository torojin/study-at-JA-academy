package whileex;

public class WhileEx1 {

	public static void main(String[] args) {
		
		//10 9 8 7 6 5 4 3 2 1
		//단순하게 생각하자..
		int n=10;
		while(n>=0){
			System.out.print(n+" ");
			--n;
		}
		
//		--------------------------------------
		/*
		int n=0;
		while(n<5) {
			++n; //증감식
			System.out.println("hello java");			
		}
		*/
		
//		----------------------------------------
		/*
		int n=0;
		
		//참값을 사용하면 무한 루프 / 탈출값을 만들어줘야 빠져나올수 있음
		//while(true or false){}
		while(true) {
			++n;
			//n의 값이 5보다 작으면
			if(n<=5) {
				System.out.println("hello java");
		}else {
			break;
		}
		}
		*/
	}

}
