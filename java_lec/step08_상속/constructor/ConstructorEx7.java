package constructor;

public class ConstructorEx7 {

	public static void main(String[] args) {
		//member에 매개변수 전달
		Member ob1=new Member("뽀로로",22);
		ob1.view();
		
		//매개변수 없는 객체를 실행하려고 하면 에러
		//생성자가 없다면 에러가 발생 안함
		//그래서 디폴트 생성자를 만들어줌
		Member ob2=new Member();
		ob2.view();
	}

}
