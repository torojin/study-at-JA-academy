package chap11;

public class STData {
	//필드 생성
	private String name;
	private int score;
	
	//생성자 생성
	public STData() {
		
	}
	public STData(String name, int score) {
		this.name= name;
		this.score = score;
	}
	//setter는 필요없고 getter만 생성
	public String getName() {
		return name;
	}
	public String getTest() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	//toString
	public String toString() {
		return "아무거나 출력";
	}
	
}
