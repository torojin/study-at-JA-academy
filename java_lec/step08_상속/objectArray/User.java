package objectArray;

public class User {
	//객체(변수) 생성
	private String name;
	private String phone;
	//디폴트 생성자
	public User() {
		super();
	}
	//매개변수 생성자
	public User(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
}
