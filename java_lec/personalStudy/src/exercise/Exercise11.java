package exercise;
/*
 [����11]������ ���� �޼��带 �ۼ��ϰ� ����� �ϼ��Ͻÿ�
(1) output(10,'#') : void �� ȣ���Ͽ� output�޼��忡�� ����Ͻÿ�
(2)����� for���� �̿��Ͻÿ�

[���ȭ��]
# # # # # # # # # # 
 */
public class Exercise11 {
	
	public static void output(int a, char b) {
		for(int i=0;i<a;i++) {
			System.out.print(b+" ");
		}
		//return ��������
	}
	
	public static void main(String[] args) {
		output(10,'#');

	}

}