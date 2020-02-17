package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao=new EmpDao();
		System.out.println("**** 모든 사원 출력하기 ****");
		
		List<EmpVO> list=dao.getEmpList();
		for(EmpVO ob:list) {
			System.out.print("이름 : "+ob.getEname()+"\t");
			System.out.print("이름 : "+ob.getDept()+"\t");
			System.out.println("이름 : "+ob.getSalary());
		}
	}

}
