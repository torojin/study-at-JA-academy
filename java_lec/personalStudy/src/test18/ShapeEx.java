package test18;
/*
[����18]������ overload�� �̿��Ͽ� ���α׷��� ����ÿ�
(1) package���� test18�� �ϰ� Shape.java   ShapeEx.java������ ����ÿ�
(2) ���ϸ� : Shape  --main()���� X
+Shape(x:int)                       --> ���ǳ��̸� ���ؼ� ���(���ǳ���=������*������*3.14)
+Shape(x:int, y:int)               --> �簢���� ���̸� ���ؼ� ���(�簢���ǳ���=����*����)
+Shape(x:int, y:int, z:int)       --> ��ٸ����� ���̸� ���ؼ� ���(��ٸ����� ����=(�غ� + ���� )*����/2)
          
(3) ���ϸ� : ShapeEx   --main()���� O
new Shape(3);
new Shape(4,5);
new Shape(3,4,7);

(4) ���ȭ��
���ǳ��� : 28.274337
�簢���ǳ��� : 20.0
��ٸ����ǳ��� : 24.5
 */
public class ShapeEx {

	public static void main(String[] args) {
		new Shape(3);
		new Shape(4,5);
		new Shape(3,4,7);
		
	}

}