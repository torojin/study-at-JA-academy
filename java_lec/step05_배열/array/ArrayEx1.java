package array;
//1차원 배열
//배열 : 동일한 자료형의 연속된 기억공간
//String name="홍길동"
public class ArrayEx1 {

	//new = 기억공간 할당
	public static void main(String[] args) {
		int[] num=new int[5]; //배열선언 / 5개의 기억공간 /new 연산자 : 객체 생성 --- 참조 자료형 : 원본 데이터에 액세스 할 수 있는 경우에
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//length가 5를 리턴해서 -1해서 4배열을 출력
		//50 40 30 20 10
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
	
		//향상된 for문을 이용하여 출력하세요
		//10 20 30 40 50
		//int n : 기억공간을 만들어 준다 
		for(int n: num) {
			System.out.print(n+" ");
		}

		
		
	}

}
