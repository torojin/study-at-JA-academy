package object;

public class ObjectEx4 {

	public static void main(String[] args) {
		//객체 생성
		Employee em=new Employee();
		//setter에 데이터 입력
		em.setName("이순신");
		em.setDept("개발부");
		em.setPay(1500000);
		em.setScore(85.75);
		System.out.println(em.toString());
		//setter 데이터 삽입?
		em.setEmployee("진달래", "총무부", 1200000, 75.34);
		
		//getter
		System.out.println("사원이름 : "+em.getName());
		System.out.println("근무부서 : "+em.getDept());
		System.out.println("받은급여 : "+em.getPay());
		System.out.println("입사점수 : "+em.getScore());
		
		
	}

}
