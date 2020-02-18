package objectArray;
//object Array(오브젝트배열) -2 
public class UserEx3 {

	public static void main(String[] args) {
		//배열만들고 객체를 생성
		//아래 int 배열 생성 하던 것과 똑같다
		//객체 자료형이여서 User라는 자료형을 만든것
		User[] ob=new User[] {new User("kim", "010-123-4567"),
							new User("lee", "010-456-4207"),
							new User("park", "010-777-8080")
				
		};
//		int [] num=new int[]{1,2,3,4,5};
		
		//향상된 for문
		//자료형 확인
		for(User m :ob) {
			System.out.println(m.getName()+"\t"+m.getPhone());
		}

	}

}
