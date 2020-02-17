package object;

public class ObjectEx2 {

	//시작은 여기서
	//그 외의 객체는 User.java에서
	//2개의 메서드를 만들어야함 setUser,getUser
	public static void main(String[] args) {
		//필드랑 메서드가 합쳐진게 객체
		//객체=속성+동작 속성이랑 동작 둘중 하나만 있어도 객체가 될 수 있다.
		User ob=new User();//User 객체 생성 / (class Object(객체) 생성)		
		ob.setUser("진달래", 97,55,79);
		//함수를 만들었다고 반드시 사용해야하는 건 아니다
		//int a=getTotal();
		//출력을 하기 위해
		System.out.println(ob.getUser());
		
		//--출력
		//이름은 진달래이고, 총점은 231점입니다
		
	}

}
