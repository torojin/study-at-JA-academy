package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 [����13] �Ʒ��� ���� 12���� ������ �迭�� ����� ����Ų�� 
���ϴ� month�� �Է¹޾� �� ���� ������ ����Ͻÿ�

[����]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

[�Է�ȭ��/���ȭ��]

���ϴ� month�� �Է��Ͻÿ� : 3
3���� 31���Դϴ�.
 */
public class Exercise13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int []month= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int n;
		System.out.print("���ϴ� month�� �Է��ϼ��� : ");
		n=Integer.parseInt(br.readLine());
		
		
		//System.out.println(n+"���� "+month[n-1]+"�� �Դϴ�");
					
		//for���� ����ؼ� �غ��ٸ�
		//�迭0~11
		for(int i=0; i<month.length; i++) {
			//�� �ε��� ��ȣ�� �����ؾ���
			if(n==i+1) {
				System.out.println(n+"���� "+month[i]+"�� �Դϴ�");
			}
		}
		
	}

}