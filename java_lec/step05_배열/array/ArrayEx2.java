package array;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		//값을 한번에 넣어주는 것
		String [] car= {"소나타", "코란도", "포르테", "티코", "모닝"};
		car[3]="마티즈";//티코자리에 마티즈를 넣음
		
		for(String st:car) {
			System.out.println(st);
		}
	}

}
