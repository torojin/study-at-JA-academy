package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx3 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		//Map은 순서가 없다
		map.put(3, "피카츄");
		map.put(1, "잠만보");
		map.put(4, "파이리");
		map.put(2, "꼬부기");
		
		System.out.println(map);
		/* set 순서대로 출력??
		Set<Integer> keys=map.keySet();
		for(Integer n:keys)
			System.out.println(map.get(n));
		*/
		
		//list에 넣어서 정렬를 하는 방법
		Set<Integer> keys=map.keySet();
		List<Integer> list=new ArrayList<Integer>(keys);
		System.out.println(list);
		//섞여 들어갈 수 있으니 정렬
		Collections.sort(list);
		for(Integer n:list)
			System.out.println(map.get(n));
	}
}
