package objectArray;
//object Array(오브젝트배열) -1
public class UserEx2 {

	public static void main(String[] args) {
		//배열만들고 객체를 생성
		//아래 int 배열 생성 하던 것과 똑같다
		User[] ob=new User[3];
//		int [] num=new int[3];
		
		ob[1]=new User("kim", "010-123-4567");
		ob[2]=new User("lee", "010-456-4207");
		ob[3]=new User("park", "010-777-8080");
		//getter를 만들었으니 getter로 출력
		for(int i=0; i<ob.length;i++) {
			System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());
		}

	}

}
