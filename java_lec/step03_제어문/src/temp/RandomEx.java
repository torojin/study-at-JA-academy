package temp;

import java.util.Random;

//난수 : 컴퓨터가 임의의 숫자를 발생, 의사난수, pseudo random
public class RandomEx {

	public static void main(String[] args) {
//		난수 생성 클래스 종류
//		Math 클래스 ------
		System.out.println(Math.random());//0-1미만의 실수
		System.out.println((int)(Math.random()*10+1)); //1-11미만 //정수로 바꾸고 싶으면 int 캐스팅
		System.out.println((int)(Math.random()*31+50)); //50-80 (81미만)
		System.out.println((int)(Math.random()*30+51)); //51-80
		
//		Random클래스 이용
		Random rd=new Random();
		
		int n1=rd.nextInt(101)+0; //0-100
		int n2=rd.nextInt(31)+50; //50-80 (81미만)
		int n3=rd.nextInt(41)+30; //30-70 (71미만)
		
		System.out.println(n1+" "+n2+" "+n3);
	}

}
