package test24;
/*
(4)Ŭ������ : CircleSize
+CircleSize()
+CircleSize(r:int)
+getCalc():double   ==> ���� ���̸� ���Ѵ�(������*������*3.14)
+toString():String    ==> ���� ���̴� 78.5�Դϴ� ���
 */
public class CircleSize extends Circle{
	
	//default constructor ������
	public CircleSize() {
		super();
	}
	public CircleSize(int r) {
		super(r);
	}
	@Override
	public double getCalc() {
		return super.getR()*super.getR()*3.14;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"\n���� ���̴� "+getCalc()+"�Դϴ�";
	}
	
	

}