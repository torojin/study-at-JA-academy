package object;
/* 클래스 다이어그램 표기
 * -(private) +(public) #(protected)
 *  위에 이름
 *  중간 변수
 *  괄호가 있는건 함수
 *  
 *  클래스 명 : Person
 *  +name : String
 *  +age : int
 *  +score : float
 *  +setPerson(name:String, a:int, s:float) : void
 *  +viewPerson():void
 *
 */

//괄호가 붙으면 함수
class Person{

//	3. 여기서 변수 선언 받고?
	public String name;//멤버 변수 (float) 선언
	public int age;
	public float score;
	
	//변수의 값을 정해주는거 set?
	//set이 붙어 있느면 무언가 대입시켜주는 것
	public void setPerson(String n, int a, float s) { //2. "개나리",23,73.5f를 가지고 있음 //변수 대입
		//멤버 함수 정의, method
		//(String name, int age, float score)
		//가린다. 자기자신의 객체의 이름이 겹치면...?
		//this로 자기자신을 바라보게 하는..
//		this.name=name;
//		this.age=age;
//		this.score=score;
		name=n;
		age=a;
		score=s;
		

	}
	//
	public void viewPerson() {
		//4.main의 값을 받...
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("점수 : "+score);
	}
}


public class ObjectEx1 {
//public : 접근 지정자
//public이 하는 일은..
// 운영체제가 접근하게 하는것?
	public static void main(String[] args) {
		//사용하고자하는 함수가 있는 클래스를 사용해야한다.
		//Person class를 가지고 pa객체를 만들고
		Person ps=new Person(); //new Person : 힙 영역에 메모리를 할당하는 인스턴스 / 힙 영역 : 프로그램이 동작을 하고 나서 런타임... / 스택 : 컴파일 파일에 결정되는 것/정적바인딩
		ps.setPerson("개나리",23,73.5f);//1. setPerson에 데이터를 보냄 / ps:객체(필드와 메서드의 조합이다)
		ps.viewPerson();
		System.out.println(ps.hashCode()); 
		//haxh : 힙영역의 인스턴스에 대한 참조값을 주는 방식
		//hashCode 참조 주소
		
		ps=new Person(); 
		ps.setPerson("개나리",25,73.5f);
		ps.viewPerson();
		System.out.println(ps.hashCode());
		
	}

}
