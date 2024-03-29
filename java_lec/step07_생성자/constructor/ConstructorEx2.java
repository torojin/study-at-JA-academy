
package constructor;
/*
public class ConstructorEx2 {

	//매개변수의 값을 받아서 this(매개변수의 값을 따라 이동) 
	//System.out.println 읽고 출력 종료 후 호출받았던 곳으로 이동 
	
	//default 생성자
	public ConstructorEx2() {
		System.out.println("default constructor");//4
	}
	
	public ConstructorEx2(String str) {
		this(str, 10);//2
		System.out.println(str+" constructor");//6
	}
	
	//생성자
	public ConstructorEx2(String str, int n) {
		this(); //3
		System.out.println(str+" "+n+" constructor");//5
	}

	public static void main(String[] args) {
		//객체 생성 매개변수 전달
		new ConstructorEx2("가나다");//1 
		new ConstructorEx2("ooo"); //7
	}

}
*/
//--------------------------------------------------------


/*
public class ConstructorEx2 {
	//default 생성자
	public ConstructorEx2() {
		this("가나다", 10); //2
		System.out.println("default constructor");//6
	}
	
	public ConstructorEx2(String str) {
		System.out.println(str+" constructor");//4
	}
	
	//생성자
	public ConstructorEx2(String str, int n) {
		this(str); //3
		System.out.println(str+" "+n+" constructor");//5
	}

	public static void main(String[] args) {
		//객체 생성 매개변수 전달
		new ConstructorEx2();//1 //매개변수 없는 생성자
		new ConstructorEx2("ooo",10); //7
	}

}

*/
//-------------------------------------------------------------------

//4개의 함수가 있으면
public class ConstructorEx2 {
	//default 생성자
	public ConstructorEx2() {
		System.out.println("default constructor");//4
	}
	
	public ConstructorEx2(String str) {
		this();//3
		System.out.println(str+" constructor");//5
	}
	
	//생성자
	public ConstructorEx2(String str, int n) {
		this(str); //2 //한번 생성자는...... //맨위에 사용해야 한다.
		 //this 생성자 호출 = 생성자를 자기자신의 생성자를 호출하겠다.
		System.out.println(str+" "+n+" constructor");//6
	}

	public static void main(String[] args) {
		//객체 생성 매개변수 전달
		new ConstructorEx2("가나다",10);//1, 7
	}

}

