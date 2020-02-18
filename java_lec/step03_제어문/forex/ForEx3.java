package forex;
/*
 * 1~100사이의 7의 배수만 출력하세요 : continue사용하기
 */
public class ForEx3 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<100; i++) {
			if(i%7!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
