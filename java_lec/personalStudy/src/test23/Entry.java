package test23;
/*
(2)Ŭ������ : Entry
-word:String
+Entry()                            ==> **  ������ **    ���
+Entry(word:String)
+toString()String               ==> ��� : OOP   ���

(3) ���ȭ��

*****������******
��� : OOP
���� : Object Oriented Programming
�ñ� : 1991��
 */
public class Entry {
	//filed 
	private String word;
	//default constructor
	public Entry() {
		super();
		System.out.println("*****������*****");
	}
	//parameter constructor
	public Entry(String word) {
		this();
		this.word=word;
	}
	//toString
	@Override
	public String toString() {
		return "��� : "+word;
	}
	
}