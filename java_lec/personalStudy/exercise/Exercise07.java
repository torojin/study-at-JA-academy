package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 [����7]2���� ���ڿ� �����ڸ� �Է��Ͽ� ����Ͻÿ�
        ����1) �Ǽ��ΰ��� �Ҽ����� 2°�ڸ����� ����Ͻÿ�
        ����2) �����ڰ� +,-,*,/ �̿��� ���ڰ� ������ 
                 "������error"����Ͻÿ�

[������]
x���� �Է��Ͻÿ� : 25  
y���� �Է��Ͻÿ� : 36
�����ڸ� �Է�(+,-,*,/) : +
25 + 36 = 61

x���� �Է��Ͻÿ� : 25  
y���� �Է��Ͻÿ� : 36
�����ڸ� �Է�(+,-,*,/) : /
25 / 36 = 0.69      

x���� �Է��Ͻÿ� : 25  
y���� �Է��Ͻÿ� : 36
�����ڸ� �Է�(+,-,*,/) : #
������ error
 */
public class Exercise07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		char c;
		System.out.print("x���� �Է��Ͻÿ� : ");
		x=Integer.parseInt(br.readLine());
		System.out.print("y���� �Է��Ͻÿ� : ");
		y=Integer.parseInt(br.readLine());
		System.out.print("�����ڸ� �Է�(+,-,*,/) : ");
		c=br.readLine().charAt(0);
		
		switch(c) {
		case '+' : System.out.println(x+" + "+y+" = "+(x+y)); break;
		case '-' : System.out.println(x+" - "+y+" = "+(x-y)); break;
		case '*' : System.out.println(x+" * "+y+" = "+(x*y)); break;
		case '/' : System.out.println(x+" / "+y+" = "+String.format("%.2f",((double)x/(double)y))); break;
		default : System.out.println("������ error"); break;
		}
		
	}

}