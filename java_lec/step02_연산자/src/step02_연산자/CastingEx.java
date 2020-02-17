package step02_연산자;
//캐스팅할 때 
//좌변과 우변을 같게 해야함
//좌 크고 우 작으면 자동형변환
//좌 작고 우 크면 자동형변환이 안됨
public class CastingEx {

	public static void main(String[] args) {
		
		int pay=857650;
		double tax=0.033;
		//int tax=(int)0.033; //형변환은 좌변을 기준으로 우변을 변환
		//좌변과 우변이 일치되도록 만들어 줄것
		
		int rPay=pay-(int)(pay*tax);
		
		System.out.println("실 수령액 : "+ rPay);
		
		/*
		int k=87, e=88, m=75;
		int tot=k+e+m;
		//double avg=tot/3; //(실수/정수) => 정수
		//double avg=(double)tot/3; // 자동형변환
		double avg=tot/3.0; // 자동형변환 / 매번 캐스팅적기 힘들때 이런식으로 함 
		
		
		System.out.println("총점 : "+tot);
		System.out.printf("평균 : %.2f", avg);
		*/
		
		/*
		byte a=100;
		int b=a; //자동 형변환
		
		double c=73.45;
		int d=(int)c; // 강제 형변환
		
		//상위의 자료형으로 캐스팅한것
		System.out.println(a + " "+b);
		//실수 자료형은 정규화과정을 거친다.
		System.out.println(c + " "+d);
		*/
	}

}
