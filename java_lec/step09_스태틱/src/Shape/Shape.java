package Shape;
/*
 * -x:int
 * -y:int
 * +Shape()
 * +Shape(x:int, y:int)
 * +setter&getter
 * +getSize():double
 * 
 */
public class Shape {
	//filed 생성
	private int x,y;
	
	//디폴트 생성자 생성
	public Shape() {
		super();
	}

	//매개변수 생성자 생성
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//setter&getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//override 시킴
	public double getSize() {
		return 0.0;
//		return x*y;
//		return 0.0 나 x*y으로 해도 상관없지만
//		자료형 초기값으로 지정해주면 제일 좋다
		
	}



}
