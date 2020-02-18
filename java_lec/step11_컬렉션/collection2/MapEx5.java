package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx5 {

	public static void main(String[] args) {
		//제네릭선언
		Map<String, String> map=new HashMap<String, String>();//Map<String, Book> map=new HashMap<>();똑같다.
		//정상적인 동작
		/*
		map.put("둘리", "객실1");
		map.put("또치", "객실2");
		map.put("마이콜", "객실3");
		map.put("도우너", "객실4");
		map.put("고길동", "객실5");
		*/
		//중복되는 객실이 있을때 
		map.put("둘리", "객실1");
		map.put("또치", "객실2");
		map.put("마이콜", "객실3");
		map.put("도우너", "객실2");
		map.put("고길동", "객실3");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("방 이름을 입력하세요 (객실1~5) : ");
		String room=sc.next();
		//역으로 대입하는 방식
		Set<String> keys=map.keySet();// keySet() : key값만 필요한 경우 사용
		for(String key:keys) {
			//데이터가 같은지 검사
			String rom=map.get(key);
			
			if(rom.equals(room)) {
				System.out.println(room+"에 있는 사용자는 "+key+"입니다.");
			}
		}
	}

}
