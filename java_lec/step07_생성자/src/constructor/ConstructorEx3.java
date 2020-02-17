package constructor;
//클래스명 : UserInfo
//-name : String
//-addr : String
//+UserInfo()//리턴타입이 없기 때문에 생성자의미
//+UserInfo(name:String, addr:String)
//+getter
//--출력
//**** 주소록 **** <-- 디폴트 생성자에서 출력
//이름 : 도라에몽  <-- main()에서 getter를 이용해서 출력
//주소 : 서울시 강남구 <-- main()에서 getter를 이용해서 출력
class UserInfo{
	//filed
	private String name;
	private String addr;
	//생성자
	public UserInfo() {
		System.out.println("****주소록****");
	}
	//생성자에 매개변수 입력
	public UserInfo(String name, String addr) {
		this();
		this.name=name; 
		this.addr=name;
	}
	//getter로 출력
	//getter는 setter가 없어도 변수만 있으면 호출 가능하다
	//데이터쪽에 연결되면 getter와 setter로 같이 사용해서 하는 경우가 있다
	//이부분은 JDBC에서
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		UserInfo ob=new UserInfo("도라에몽","서울시 강남구");//1
		System.out.println("이름 : "+ob.getName());
		System.out.println("주소 : "+ob.getAddr());
	}

}
