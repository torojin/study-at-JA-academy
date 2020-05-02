package test;
//입력값에 대한 검사
//사용자 처리
//비즈니스 로직(데이터베이스 연동 처리)
public class UserProc {

	public User getLoginUser(String id, String pw) {
		/* 문제
		 * 매개변수로 들어온 pororo, 1234를 비교하여
		 * 맞으면 entity 객체를 만들어서(User자료형으로 만들어져야함)
		 * setter를 통해 id,pw, "뽀로로", 89.97를 대입하세요
		 * 
		 * entity를 리턴하세요
		 * 
		 * .equals : 객체 비교하는 것
		 * 
		 */
		//밖으로 빼서 null값을 넣어 초기화해줘야함??
		User entity = null; //조건이 만족하지 않을때 null값을 출력
		
		//매개변수로 들어온 pororo, 1234를 비교
		if(id.equals("pororo") && pw.equals("1234")) {
			entity=new User(); //맞으면 entity 객체를 만들어서
			//setter를 통해 id,pw, "뽀로로", 89.97를 대입하세요
			//데이터베이스가 없어서 데이터베이스 대신 넣어주는 것 / Dao인것 처럼 만들어준것
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("뽀로로");
			entity.setPoint(89.97);
		}
		return entity;
	}

}
