package ifEx;
//중첩 if문 : if문 안에 또 다른 if문 사용
public class ifEx2 {

	public static void main(String[] args) {
		
		int age=35;
		
		if(age>=19) {
			if(age<30) {
				System.out.println("즐거운 시간 되세요");
			}else {
				System.out.println("국빈관으로 가세요 ");
			}
		}else {
			System.out.println("애들은 가라~");
		}
			
		
	}

}
















