package test24;
/*
(2)Ŭ������ : Circle
-r:int
+Circle()
+Circle(r:int)
+setter & getter
+getCalc():double 
+toString():String    ==>  ������ : 10  /   ������ : 5 ���

 */
public class Circle {
	//field(variable) ����
	private int r;
	
	//default constructor ������
	public Circle() {
		super();
	}
	//parameter constructor �Ű����� ������
	public Circle(int r) {
//		super();
		this.r=r;
	}
	//getter���, setter �Է�..?
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	//override�� ��
	public double getCalc() {
		return 0.0;
	}
	//toString
	public String toString() {
		return "������ : "+r;
	}
	
}