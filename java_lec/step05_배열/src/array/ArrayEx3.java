package array;
// $ java ArrayEx3 abcd 가나다 123 12345
//공백을 기준으로 구분한다
//2차원 배열 0,0/0,1/0,2/0,3 = a,b,c,d 1,0/1,1/1,2 =가,나,다
public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("args의 길이 : "+args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] : "+args[i]);
			System.out.println("args["+i+"]의 크기 : "+args[i].length());
			System.out.println();
		}
		//------ 향상된 for문으로 출력해보세요
		//찾고 싶은걸 찾아서 사용할수 없음
		//순서대로만 출력하는 용으로 사용
		//class를 가지고 자료형을 선언한 것
		for(String n : args) {
			System.out.println("args : "+n);
			System.out.println("args의 크기  : "+n.length());
			System.out.println();
		}
		//배열.. 문자열에 관해서 선언할때 이런식으로 가능하다
		//다른 자료형은 불가능
//		String n= new String();
//		String n1="";
	}

}
