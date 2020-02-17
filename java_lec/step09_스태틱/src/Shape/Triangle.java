package Shape;
/*
 * +Triangle()
 * +Triangle(x:int, y:int)
 * +getSize():double
 */
//Shape 상속
public class Triangle extends Shape{
	//부모 클래스에서 변수를 받아오면 되기 때문에
	//필드(변수) 생성 안해도 된다.
	//디폴트 생성자 생성
	public Triangle() {
		super();
	}
	//매개변수 생성자 생성
	public Triangle(int x, int y) {
		super(x,y);
	}
	//같은 메서드 사용 표시..?
	@Override
	public double getSize() {
		//부모 클래스의 getter에서 받아옴
//		return (getX()*getY())/2.0;
		//명확하게 표현하려면
		return (super.getX()*super.getY())/2.0;
	}

}
