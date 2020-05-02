package emp;

import java.util.ArrayList;
import java.util.List;

//DAO (Data Access Object) : 데이터베이스에서 자원을 가져올 용도로 사용하는 클래스
//데이터를 가져오고 저장하는 용도로 사용 / 데이터베이스에 직접적으로 접근하는 것
public class EmpDao {
	//1 초기화 리스트라는 이름이 있어야 객체 생성가능
	List<EmpVO> list=null;
	
	//생성자에 데이터를... 저장하는것?
	public EmpDao() {
		//2 객체 생성
		//데이터 보여주기 위해 임의로 사용
		//데이터베이스에 값을 저장 했다고 생각하면 될 듯
		list=new ArrayList<EmpVO>(); //ArrayList 클래스의 자료형이 EmpVO라는 / EmpVO 생성자 호출
		list.add(new EmpVO("kim", "영업부", 1000000)); //list 안에 들어있기 때문에 찾아서 들어갈수있다..?
		list.add(new EmpVO("lee", "개발부", 1500000));
		list.add(new EmpVO("park", "관리부", 2000000));
	}

	//메서드 생성
	public List<EmpVO> getEmpList() {
		//3
		return list; //데이터가 있는 list가 온것 
	}
	//getEmp 생성
	//하나의 데이터를 하나더 생성하는 거 같은?
	public EmpVO getEmp(String name) {
		for(EmpVO vo:list) {
			if(vo.getEname().equals(name))
				return vo;
		}
			
		return null;
	}
	

}
