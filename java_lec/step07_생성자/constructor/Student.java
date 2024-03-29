package constructor;
//vo:value object 값을 가지고 움직이는거
public class Student {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	//디폴트 안쓰더라도 보통 생성한다
	public Student() {
		super();
	}

	public Student(String name, int kor, int mat, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	//Override
	//상속의 개념을 사용하는 것 이 함수가 부모 클래스에 있다는 것
	@Override
	public String toString() {
		return name+"의 점수는 "+getTotal()+"점이며 평균은 "+String.format("%.2f", getAvg())+"점이고 학점은 "+getGrade()+"입니다.";
	}
	public int getTotal() {
		return kor+eng+mat;
	}
	public double getAvg() {
		return getTotal()/3.0;
	}
	public char getGrade() {
		switch((int)getAvg()/10) {
		case 10:
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default: return 'F';
		}
		
	}
	
}
