package emp;
//데이터베이스에 접근하는 것을 만들때 보통 이 구조로 사용한다.
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		//데이터 베이스가 있다는 가정하에 dao 만들고
		//EmpDao Object 생성
		EmpDao dao=new EmpDao();
		System.out.println("**** 모든 사원 출력하기 ****");
		
		List<EmpVO> list=dao.getEmpList();//4  List<EmpVO> list 이게 없다면 못쓴다
		//향상된 for문으로 사원 리스트 출력
		for(EmpVO ob:list) {
			System.out.print("이름 : "+ob.getEname()+"\t");
			System.out.print("이름 : "+ob.getDept()+"\t");
			System.out.println("이름 : "+ob.getSalary());
		}
		//--------------------------------------------------------
		System.out.println("**** lee 사원 출력 ****");
		EmpVO vo=dao.getEmp("lee");
		
		if(vo==null) {
			System.out.println("찾는 사원이 없어요...");
		}else {
			System.out.println(vo.getEname()+" "+vo.getDept()+" "+vo.getSalary());
		}
	}

}
