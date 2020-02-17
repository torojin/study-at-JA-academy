package Shape;
/*
 * +Rectangle()
 * +Rectangle(x:int, y:int)
 * +getSize():double
 */
public class Rectangle extends Shape{
	//디폴트 생성자 생성
	public Rectangle() {
		super();
	}
	//매개변수 생성자 생성
	public Rectangle(int x, int y) {
		super(x,y);
	}
	
	@Override
	public double getSize() {
		//부모 클래스의 getter에서 받아옴
//		return (getX()*getY());
		//명확하게 표현하려면
		return (super.getX()*super.getY());
	}
}
