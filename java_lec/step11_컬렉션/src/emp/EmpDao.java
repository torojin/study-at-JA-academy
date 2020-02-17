package emp;

import java.util.ArrayList;
import java.util.List;

//DAO (Data Access Object) : 데이터베이스에서 자원을 가져올 용도로 사용하는 클래스
//데이터를 가져오고 저장하는 용도로 사용 / 데이터베이스에 직접적으로 접근하는 것
public class EmpDao {
	List<EmpVO> list=null;
	
	//생성자에 데이터를... 저장하는것?
	public EmpDao() {
		list=new ArrayList<EmpVO>();
		list.add(new EmpVO("kim", "영업부", 1000000));
		list.add(new EmpVO("lee", "개발부", 1500000));
		list.add(new EmpVO("park", "관리부", 2000000));
	}

	//메서드 생성
	public List<EmpVO> getEmpList() {
		return list; //데이터가 있는 list가 온것
	}
	

}
