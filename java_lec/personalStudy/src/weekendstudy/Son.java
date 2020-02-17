package weekendstudy;
//자식클래스 / 부모 클래스 Family /interface Job상속
public class Son extends Family implements Job{
	//default constructor
	public Son() {
		super();
	}
	//parameter constructor
	public Son(String name) {
		super(name);
	}
	//interface 상속 / 오버라이딩 /리턴값 필요
	@Override
	public String work() {
		return "아들은 공부를 한다\n";
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+this.work();
	}
}
