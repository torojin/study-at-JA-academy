package emp;
//VO(Value Object), entity(행), DTO(data transfer object), bean
//		: 데이터를 하나로 묶어서 전송할 목적으로 만든 클래스
//field / consctructor/ getter,setter까지 만든게 VO라고 불린다.

//시작을 할때(데이터베이스 만들때?) VO를 먼저 만든다.
//VO 형태로 있는 건 독립적으로 있다고 보면 된다
public class EmpVO {
	//field
	private String ename;
	private String dept;
	private int salary;
	//default constructor
	public EmpVO() {
		super();
	}
	//parameter constructor
	public EmpVO(String ename, String dept, int salary) {
		super();
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	//getter, setter
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	
	
}
