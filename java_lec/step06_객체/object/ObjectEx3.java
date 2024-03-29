package object;
//setter & getter : 멤버변수 하나당 하나씩 값을 대입하는 setter와
//					그 값을 리턴하는 getter
//setter 값을 보내는 것
//getter 값을 가지고 오는 리턴하는 함수?
//멤버 변수에 적용
//변수는 사용되는 용도는 가져올때, 값을 저장할때

//setter 함수는 개별적으로 처리할 수 있다.
//클래스 생성

//public class가 메인 클래스여서
//class로 사용
class Member{
	//private 외부에서 접근할 수 없음
	//변수에는 private으로
	private String name;
	private int age;
	private double tall;
	//setter 함수만들땐 외부에서 접근을 해야하기 때문에
	//public을 사용
	//멤버 클래스
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setTall(double tall) {
		this.tall=tall;
	}
	//getter 리턴 값 받는거
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getTall() {
		return tall;
	}
}

public class ObjectEx3 {

	public static void main(String[] args) {
		//멤버클래스에 있는 객체 생성?
		//Setter
		Member ob=new Member();
		ob.setName("강호동");
		ob.setAge(25);
		ob.setTall(178.8);
		
		//getter는
		//출력의 기능이 없어서 출력문을 써줘야한다.
		System.out.println("이름 : "+ob.getName());
		System.out.println("나이 : "+ob.getAge());
		System.out.println("신장 : "+ob.getTall());
	}

}
