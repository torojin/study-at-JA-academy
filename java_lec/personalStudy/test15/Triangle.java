package test15;
/*
(1)Ŭ������:Triangle   --main()���� X
-base:double
-height:double
+setData(base:int, height:int):void
+getSize():double
+getView():String
 */
public class Triangle {
	//filed
	private double base;
	private double height;
	
	//setter
	public void setDate(int base, int height) {
		this.base=base;
		this.height=height;
	}
	//getter
	public double getSize() {
		return (base * height)/2;
	}
	public String getView() {
		return "�ﰢ���ǳ��� : "+getSize();
	}
	
}