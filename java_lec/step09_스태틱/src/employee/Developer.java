package employee;
/*
 * --Emp 상속
 * -salary:long
 * -bonus:long
 * +Developer()
 * +Developer(eno, ename, phone)
 * +toString():String
 */
//여기서 override의 의미? /변수의 값을 대입해주겠다

//자식 클래스 / Emp 상속
public class Developer extends Emp{
	//field 
	private long salary; 
	private long bonus;
	
	//default constructor
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameter constructor
	public Developer(int eno, String ename, String phone) {
		//부모클래스에 접근
		super(eno, ename, phone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setSalary(long salary) {
		this.salary=salary;
	}
	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus+100000;
		//this.bonus+=bonus; or this.bonus+=100000이렇게 작성하면 안된다.
	}
	//toString 
	@Override
	public String toString() {
		return "사원번호 : "+getEno()
				+"\n사원이름 : "+getEname()
				+"\n내선번호 : "+getPhone()
				+"\n기본급여 : "+salary
				+"\n보너스+수당 : "+bonus
				+"\n지급금액 : "+(salary+bonus)+"원\n"
				;
	}
	
}
