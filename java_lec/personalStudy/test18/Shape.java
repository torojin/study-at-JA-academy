package test18;
/*
(2) ���ϸ� : Shape  --main()���� X
+Shape(x:int)                       --> ���ǳ��̸� ���ؼ� ���(���ǳ���=������*������*3.14)
+Shape(x:int, y:int)               --> �簢���� ���̸� ���ؼ� ���(�簢���ǳ���=����*����)
+Shape(x:int, y:int, z:int)       --> ��ٸ����� ���̸� ���ؼ� ���(��ٸ����� ����=(�غ� + ���� )*����/2)
 */
public class Shape {
	//����� 
	public Shape(int x) {
		System.out.println("���� ���� : "+(x*x*3.141592));
	}
	public Shape(int x, int y) {
		System.out.println("�簢���� ���� : "+(double)(x*y));
	}
	public Shape(int x, int y, int z) {
		System.out.println("��ٸ����� ���� : "+(x+y)*z/2.0);
	}
}