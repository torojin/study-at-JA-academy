package exercise;
/*
[����10] ������ ���� �޼��带 �ۼ��ϰ� ����� �ϼ��Ͻÿ�
(1)���θ޼��忡�� �Ʒ� �޼��带 ȣ���ϰ� ȣ��޼��忡�� 
    ���� �����  �����Ұ� 
     sum(3,5)    /     sub(7,2)   /     mul(4,5)   /     div(7,3)
(2)�޼��忡�� ���� ������� ���θ޼��忡�� ����Ͻÿ�

[���� ��]
System.out.println("���ϱ� : " + sum(3,5));             

[���ȭ��]
���ϱ� : 8
��  �� : 5
���ϱ� : 20
������ : 2.33
 */
public class Exercise10 {
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static float div(float a, float b) {
		return a/b;
	}
	public static void main(String[] args) {
		System.out.println("���ϱ� : "+sum(3,5));
		System.out.println("�� �� : "+sub(7,2));
		System.out.println("���ϱ� : "+mul(4,5));
		System.out.println("������ : "+String.format("%.2f", div(7,3)));
		System.out.printf("������ : %.2f", div(7,3));
	}

}