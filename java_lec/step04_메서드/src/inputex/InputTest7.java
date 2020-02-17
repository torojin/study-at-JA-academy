package inputex;

public class InputTest7 {

	public static void main(String[] args) {
		//argument는 다 String형식으로 인식해서 형변환을 해줘야한다.
		int eno=Integer.parseInt(args[0]);//문자열로 들어오는걸 정수로 변환해줌
		String ename=args[1];
		char dept=args[2].charAt(0);
		double score=Double.parseDouble(args[3]);
		
		System.out.printf("사원번호 : %d\n사원이름 : %s\n부서코드 : %c\n입사성적 : %.1f\n",eno,ename,dept,score);
	}

}


