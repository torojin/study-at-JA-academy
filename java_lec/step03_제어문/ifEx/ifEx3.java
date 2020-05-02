package ifEx;
/*
 * a변수에 55또는 46을 대입한 후 
 * 1. if문을 이용하여
 * 		"55는 50보다 크거나 같다" 또는 "46은 50보다 작다"
 * 2. if~else문 이용
 * 		a의 변수가 홀수 인지 짝수 인지 출력
 * 		"55는 홀수입니다" 또는 "46은 짝수입니다"
 * 3. if~else~if문 이용
 * 		a의 값이 "양수", "음수", "zero"인지 출력
 * 		"55는 양수입니다"...
 */
public class ifEx3 {

	public static void main(String[] args) {
		
		//a변수에 55또는 46을 대입한 후 
		// 1. if문을 이용하여
		// 		"55는 50보다 크거나 같다" 또는 "46은 50보다 작다"
		int a=46;
		
		if(a>=50) System.out.println(a+"는 50보다 크거나 같다");
		if(a<=50) System.out.println(a+"는 50보다 작다");
		
		
//		 2. if~else문 이용
//		 		a의 변수가 홀수 인지 짝수 인지 출력
//		 		"55는 홀수입니다" 또는 "46은 짝수입니다"
//		정수를 2로 나눠 0일 경우 짝수, 1일 경우 홀수임을 출력하는 코드
		//나눴을때 나머지가 0일때 짝수 나머지가 생길때 홀수
		if(a%2 == 0) System.out.println(a+"는 짝수입니다.");
		else System.out.println(a+"는 홀수입니다.");
			
//		 3. if~else~if문 이용
//		  		a의 값이 "양수", "음수", "zero"인지 출력
//		  		"55는 양수입니다"...
		
		if(a>0) System.out.println(a+"는 양수입니다");
		else if(a<0) System.out.println(a+"는 음수입니다");
		else System.out.println("zero");

	}

}
