package family;
//자식클래스 / 부모 클래스 Family /interface Job상속
public class Mother extends Family implements Job{
	//default constructor
	public Mother() {
		super();
	}
	//parameter constructor
	public Mother(String name) {
		super(name);
	}
	//interface 상속 / 오버라이딩 /리턴값 필요
	@Override
	public String work() {
		return "엄마는 집안일을 한다\n";
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+this.work();
	}
}
