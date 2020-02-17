package employee;

public class EmpMain {

	public static void main(String[] args) {
		//Engineer 사용
		//object 생성 or Instance 생성 / 매개 변수 선언
		Engineer eng=new Engineer(101, "Steve", "1234");
		eng.setSalary(1500000);
		eng.setBonus(75000);
		System.out.println(eng.toString());
		
		//Developer 사용
		//object 생성 or Instance 생성
		Developer dev=new Developer(201, "Scott", "5678");
		dev.setSalary(2500000);
		dev.setBonus(275000);
		System.out.println(dev.toString());
	}

}
