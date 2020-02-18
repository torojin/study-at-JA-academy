package temp;
/*
 * $ java ArgsEx 10 20 30
 * 
 * 세 수의 합 : 60
 * 
 */
public class ArgsEx {
	//args는 값을 초기화하는 것과 같다
	public static void main(String[] args) {
//		System.out.println(args);//객체 출력
		int a, b, c;
		//문자열을 받아오는 것이여서 숫자로 변형시켜줌
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		
		System.out.println("세 수의 합 : "+(a+b+c));
		
	}

}
