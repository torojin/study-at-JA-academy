package test23;
/*
[문제23] 다음 프로그램을 완성하시오
(1) package명은 test23로 하고 Entry.java, SubEntry.java, MainEx.java 파일을 만드시오
(2)클래스명 : Entry
-word:String
+Entry()                            ==> **  약어사전 **    출력
+Entry(word:String)
+toString()String               ==> 약어 : OOP   출력

클래스명 : SubEntry  ==> Entry상속
-definition:String
-year:int
+SubEntry()
+SubEntry(definition:String, year:int)
+SubEntry(word:String, definition:String, year:int)
+toString():String           ==> 원어, 시기 출력


클래스명 : MainEx  
SubEntry ob=new SubEntry("OOP","Object Oriented Programming", 1991);	
System.out.println(ob.toString());

(3) 출력화면

*****약어사전******
약어 : OOP
원어 : Object Oriented Programming
시기 : 1991년
 */
public class MainEx {

	public static void main(String[] args) {
		SubEntry ob=new SubEntry("OOP", "Object Oriented Programming", 1991);
		System.out.println(ob.toString());
	}

}
