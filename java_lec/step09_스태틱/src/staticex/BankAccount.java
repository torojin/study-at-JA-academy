package staticex;

public class BankAccount {
	//field 생성
	private int year;
	private String name;
	private int money;
	private static double rate; // static 선언 // 보통 공통값으로 사용하기 위해 사용 
	
	public BankAccount(int year, String name, int money, double r) {
		super();
		this.year = year;
		this.name = name;
		this.money = money;
		rate=r;
	}
	public static void setRate(double r) {// static 변수를 제어하는 함수 //유효성 검사를 위해 사용
		//넘어오는 매개변수 안에서..?
		if(r < 0.02 || r > 0.12) {
			System.out.println("금리를 확인하고 입력하세요~");
			System.exit(0);
		}
		rate=r;
	}
	//영혼없이 변수값만 출력해보자
	public void view() {
		System.out.println(year+"\t"+name+"\t"+money+"\t"+rate);
	}
	
}
