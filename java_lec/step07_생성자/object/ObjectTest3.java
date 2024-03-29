package object;
//객체 복습
/*
 * 클래스명 : Emp
 * -name : String
 * -dept : String
 * -salary : int
 * 
 * +setEmp(name:String, dept:String, salary:int):void
 * +printEmp():void
 * --홍길동 사원은 개발부에 근무하며 1520000원의 급여를 받아요
 */
class Emp3{
	//filed
	private String name;
	private String dept;
	private int salary;
	
	//getter setter 사용
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//toString 생성
	public String toString() {
		return name+"은 "+dept+"에 근무하며"+salary+"원의 급여를 받습니다";
	}
	
}

public class ObjectTest3 {
	
	public static void main(String[] args) {
		//객체생성
		//생성자는 Emp3()
		//생성자는 객체를 생성하기 위해 생성
		Emp3 em=new Emp3();
		//setter에 값 입력
		em.setName("강호동");
		em.setDept("개발부");
		em.setSalary(120000);
		//toString으로 출력
		System.out.println(em.toString());
		
		//getter 출력
		System.out.println("이름 : "+em.getName());
		System.out.println("부서 : "+em.getDept());
		System.out.println("급여 : "+em.getSalary()+"원");
		
	}

}
