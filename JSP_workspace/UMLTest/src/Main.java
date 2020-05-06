import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		TvFactory factory = new TvFactory();
		
		System.out.println("어떤 TV를 사용하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();		
		
//		Tv tv = factory.getTv(inputValue); //이걸 쓰냐 안쓰냐에 UML 의존 관계도가 달라진다.
		
		
		TvUser user = new TvUser();
		user.useTv(factory.getTv(inputValue));
	}

}

class TvUser{
	//멤버 변수로 등록하면 아주 강한 의존도가 생긴다
	
	//private SamsungTv tv;
//	private SamsungTv tv = new SamsungTv();
	
	public TvUser() {
	}
	//삼성 티비를 포함하는게 기분나빠
//	public void setSamsungTv(SamsungTv tv) {
//		
//	}

	/*
	public void useTv(String value) {
		//인터페이스 변수 생성
		Tv tv = null;
		
		
		
		if(value.equals("삼성")) {
			tv = new SamsungTv();
		}else if(value.equals("LG")) {
			tv = new LgTv();
		}else if(value.equals("Apple")) {
			tv = new AppleTv();
		}
		tv.powerOn();
		tv.powerOff();
	}*/
	public void useTv(Tv tv) {
		//인터페이스 변수 생성
		tv.powerOn();
		tv.powerOff();
	}
}
//싱글톤 패턴
class TvFactory{
	private HashMap<String, Tv> map;
	public TvFactory() {
		map = new HashMap<String, Tv>();
		
		map.put("삼성", new SamsungTv());
		map.put("엘지", new LgTv());
		map.put("애플", new AppleTv());
	
	}
	
	public Tv getTv(String value) {
		return map.get(value);
	}
}


//인터페이스 선언
interface Tv{
	public void powerOn();
	public void powerOff();
}


class AppleTv implements Tv{
	public void powerOn() {
		System.out.println("Apple 티비 켠다");
	}
	
	public void powerOff() {
		System.out.println("Apple 티비 끈다");
	}
}


class LgTv implements Tv{
	public void powerOn() {
		System.out.println("lg 티비 켠다");
	}
	
	public void powerOff() {
		System.out.println("lg 티비 끈다");
	}
}

class SamsungTv implements Tv{
	//필드 생성
	private int price;
	public String modelName;
	
	//constructor 생성
	public SamsungTv() {
		price=500;
		modelName ="삼성 티비";
	}
	
	//Method 생성
	public void powerOn() {
		System.out.println("삼성 티비 켜짐");
	}
	public void powerOff() {
		System.out.println("삼성 티비 꺼짐");
	}
}
