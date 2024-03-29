package instance;
//instanceof : 참거짓을 나타내는 연산자?

//abstract class(추상 클래스) 생성
abstract class Employee{
	//field(variable)
	String name;
	int salary;
	
	//default constructor 
	public Employee() {
		super();
	}
	//parameter constructor
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	//abstract method선언
	abstract public int getBonus();
	
	//toString
	public String toString() {
		return name+"\t"+salary;
	}
}
//------------------------------------------------------
//class Engineer 추가 / 부모 클래스 Employee 상속
class Engineer extends Employee{
	//default constructor
	public Engineer() {
		super();
	}
	//parameter constructor
	public Engineer(String name, int salary) {
		super(name, salary);
	}
	//abstract method 가져옴
	@Override
	public int getBonus() {
		return 150000;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+getBonus();
	}
	
}

//class Developer 추가 / 부모 클래스 Employee 상속
class Developer extends Employee{
	//default constructor
	public Developer() {
		super();
	}
	//parameter constructor
	public Developer(String name, int salary) {
		super(name, salary);
	}
	//abstract method 가져옴
	@Override
	public int getBonus() {
		return 100000;
	}
	@Override
	public String toString() {
		return super.toString()+"\t"+getBonus();
	}
	
}

public class InstanceofEx2 {
	//main method
	public static void main(String[] args) {
		//objectArray를 사용해서 객체를 생성
		Employee[] em=new Employee[] {
				new Engineer("kim", 1200000),
				new Developer("lee", 1750000),
				new Engineer("park", 2500000),
				new Developer("hong", 2350000)			
		};
		System.out.println("이름\t급여\t정규보너스\t특별보너스");
		System.out.println("-------------------------------------");
		//instanceof 사용 방법 
		// ob 에 Engineer에 속하는가 맞으면 true 아니면 fault
		//보너스 더 주기 / 엔지니어는 급여의 13%, 개발자는 15%의 특별보너스
		for(Employee ob:em) {
			if(ob instanceof Engineer) {
				//field 생성할 때 public salary로 선언해서 사용가능 private이면 사용 불가능
				System.out.println(ob.toString()+"\t"+(int)(ob.salary*0.13));
			}else if(ob instanceof Developer) {
				System.out.println(ob.toString()+"\t"+(int)(ob.salary*0.15));	
			}
		}
		
	}

}
