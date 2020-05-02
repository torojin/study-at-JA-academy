package test15;
/*
[문제15] 다음을 완성하시오
(1) package명은 test15로 하고 Triangle.java  TriangleEx.java파일을 만드시오
(1)클래스명:Triangle   --main()포함 X
-base:double
-height:double
+setData(base:int, height:int):void
+getSize():double
+getView():String

(2)클래스명:TriangleEx   --main()포함 O
Triangle ob=new Triangle();
ob.setData(3,7);
System.out.println(ob.getView());

(3) 삼각형의 넓이 = (밑변 * 높이) /2 공식을 이용하고 
     getSize()에서 계산하고 출력은 getView()에서 하시오

(4) 출력화면
삼각형의넓이 : 10.50
 */
public class TriangleEx {

	public static void main(String[] args) {
		Triangle ob=new Triangle();
		ob.setDate(3, 7);
		System.out.println(ob.getView());
	}

}
