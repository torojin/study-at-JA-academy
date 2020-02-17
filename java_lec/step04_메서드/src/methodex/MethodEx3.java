package methodex;
//call by value : 복사에 의한 전달
public class MethodEx3 {
	//호출하는 곳에서 값을 저장하는 방식
	//매개변수 지정
	public static void show1(int a, char b, double c, float d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	public static int show2(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double show3(int a, int b, int c) {
		return (a+b+c)/3.0;//자동형변환으로 실수값
	}
	
	public static String show4(int a, int b, int c) {
		double avg=(a+b+c)/3.0; //평균 계산
		//강사님 코드 / 변수선언
		String rs;
		if(avg >= 60) rs="합격";
		else rs="불합격"; 
		return rs;
		/* return문 2개를 사용하면 에러가 난다.
		 * 될 수 있으면 리턴문은 하나로 처리
		if(avg >= 60) return "합격"; 
		else return "불합격";
		*/
	}
	
//주소에서 값을 가지고 와서..

	public static void main(String[] args) {
		show1(10, 'A', 100.4, 90.4f);
		
		//합계 값을 전달
		int sum=show2(95,85,73);
		
		System.out.println("합계 : "+sum);
		System.out.println("합계 : "+show2(95,85,73));
		
		double avg=show3(95,85,73);
		System.out.println("평균 : "+String.format("%.2f", avg));
		System.out.printf("평균 : %.2f\n",avg);
		
		//합격 불합격
		String result=show4(95,85,73); 
		System.out.println("결과 : "+result);
	}

}
