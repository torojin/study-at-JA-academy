package test;
//비즈니스 로직
import java.util.ArrayList;

public class BookProc {
	
	public ArrayList<Book> getList() {
		//Object 생성
		Book bk1=new Book("java", "kim", 100);
		Book bk2=new Book("c++", "lee", 100);
		Book bk3=new Book("jsp", "park", 100);
		
		//list에 bk1~bk3을 추가해주세요
		ArrayList<Book> list=new ArrayList<Book>(); 
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		return list;//ArrayList를 리턴 해줘야함.
	}

}
