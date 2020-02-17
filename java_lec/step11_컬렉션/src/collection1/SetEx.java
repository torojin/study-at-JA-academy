package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : 중복 허용 x, 순서 유지 x
public class SetEx {
//	@SuppressWarnings(value="unchecked")//type을 확인하지 않음 / collection에서 자료형 검사를 하지 않는다
	public static void main(String[] args) {
		//Object 생성
		//제네릭이란 기억공간(컬렉션or컨테이너)이 있으면 
		//예를 들어 set이라고 표현하면 set자료형인데 안에는 내가 담고 싶은 자료형을 담을수있다.
		//기본 자료형은 사용이 안되고 참조자료형만 올수있다
		//안에 자료형을 정해주는게 제네릭
		//제네릭 옛날 문법 방식 		Set<Integer> set=new HashSet<>();
		
		Set set=new HashSet();
		set.add("one");				//add(Object) / object는? 모든 클래스로 표현된 자료형은 다 사용할 수 있다
		set.add(2); 				//int --> new Integer(2) 자료형형태로 들어간다는 것 : 기본형--> 객체형(Boxing)으로 변경
		set.add(new Float(3.0f));
		set.add(4.00); 				//double->new Double(4.00)을 교체
		set.add(2);
		set.add(new Integer(2));
		set.add(new Double(4.00));
//		set.add(Integer.valueOf(2));//요새 자바9버전에서 권장 사항
		
		Iterator iter=set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
