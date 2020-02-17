package test21;
/*
(3)클래스명 : EmpEx
Emp em=new Emp();
em.setName("강호동");
em.setDept("영업부");
em.setSalary(1200000);
System.out.println(em.toString());

System.out.println("이름 : " + em.getName());
System.out.println("부서 : " + em.getDept());
System.out.println("급여 : " + em.getSalary() + "원");
*/
public class Emp {
	//필드(변수)생성
	private String name, dept;
	private int salary;
	//getter, setter 생성
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
	@Override
	public String toString() {
		return name + "은 " + dept + "사원이며" + salary + "원의 급여를 받습니다";
	}
	
}
