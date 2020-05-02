package test24;
/*
 (3)Ŭ������ : CircleRound
+CircleRound()
+CircleRound(r:int)
+getCalc():double   ==> ���� �ѷ��� ���Ѵ�(������*2*3.14)
+toString():String    ==> ���� �ѷ��� 62.8�Դϴ�   ���
 */
public class CircleRound extends Circle{
	//default constructor
	public CircleRound() {
		super();
	}
	//parameter constructor
	public CircleRound(int r) {
		super(r);
	}
	@Override
	public double getCalc() {
		return super.getR()*2*3.14;
	}
	@Override
	public String toString() {
		return super.toString()+"\n���� �ѷ��� "+String.format("%.1f", getCalc())+"�Դϴ�\n";
	}
}