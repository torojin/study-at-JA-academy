package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("해리포터", Integer.valueOf(95));
		map.put("론", Integer.valueOf(75));
		map.put("헤르미온느", Integer.valueOf(85));
		map.put("말포이", Integer.valueOf(88));
		map.put("지니", Integer.valueOf(93));
		map.put("네빌롱바텀", Integer.valueOf(66));
		map.put("해리포터", Integer.valueOf(85));//중복을 허락하지 않아서 덮어쓰기를 한다. / 중복허용금지
		map.put(null, Integer.valueOf(95));//키에 널 허용
		map.put("볼드모트", null);// 값에 널 허용
		
		
		//출력
		System.out.println(map);
		
		//key값 기준으로 value값을 가져옴
		//레퍼 클래스..? 
		Integer num=map.get("말포이");
		System.out.println("말포이 성적은 ? "+num);
		
//		int n=num.intValue();//언박싱
//		int n=new Integer(num);//오토 언박싱
//		int n=(int)num; //오토 언박싱
//		System.out.println(n);
	}

}
