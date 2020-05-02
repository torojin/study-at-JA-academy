package methodex;
/*
 * --출력
 * 총점 : 253점
 * 평균 : 84.33점
 * 학점 : B
 * 결과 : 합격
 * ---------------
 * 조건
 * 학점 : switch문 이용하여 구하기
 * 학점을 기준으로하면 a b c d f		F면 불합격 아니면 합격을 리턴
 * 결과 : if~else문 이용
 * 
 */
//메인 함수, 멤버 함수 방식이 로직을 짰을때 문제가 제일 적음
public class MethodEx4 {
	
	//리턴을 하고자 하는 값이 ..
	public static int total(int k, int e, int m) {
		return k+e+m; //return은 호출한 곳으로 되돌아 감..(값을 가지고)
	}
	
	//avg(total(k, e, m))이 값을 받은 함수가 된다.
	//값이 대입이 되는 구조 //tot에 253이 담아지는 것
	public static double avg(int tot) {
		return tot/3.0; //호출한 곳으로 보내서 출력
	}
	
	//여기서 switch문 사용해야 함
	//84.33이 av에 담아지는 것
	public static char grade(double av) {
		
		/*
		//변수 하나를 만드는게 좋다
		//임의로 하나씩 
		char ck;
		switch((int)av/10){ //av=>84.33 ==>84 --->
		case 10 :
		case 9: ck='A'; break;
		case 8: ck='B'; break;
		case 7: ck='C'; break;
		case 6: ck='D'; break;
		default: ck='F';
		}
		return ck;//return이 출력
		*/
		
		//두 방식으로 가능하다.
		switch((int)av/10){
		case 10 :
		case 9: return 'A';
		case 8: return 'B'; 
		case 7: return 'C';
		case 6: return 'D'; 
		default: return 'F';
		}

	}
	
	//합격 불합격 리턴하기
	public static String result(char gr) {
		String res;
		if (gr=='F') res="불합격";
		else res="합격";
		return res;
	}
	
	//출발점
	public static void main(String[] args) {
		int k=95, e=85, m=73;
		System.out.println("총점 : "+total(k, e, m)+"점");
		System.out.printf("평균 : %.2f점\n", avg(total(95, 85, 73)));//avg의 tot 함수에 입력 된다
		System.out.println("학점 : "+grade(avg(total(k, e, m))));//grade의 av 함수에 입력 된다.
		System.out.println("결과 : "+result(grade(avg(total(k, e, m)))));//result의 gr 함수에 입력된다.
	}

}
