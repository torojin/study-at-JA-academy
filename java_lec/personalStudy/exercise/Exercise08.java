package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����8]����ó�����α׷�
        �߰�����,�⸻����,����Ʈ,�⼮������ �Է¹޾Ƽ� ����Ͻÿ�

����1) (�߰�+�⸻)/2      ---> 60%
          ����                   ---> 20%
          �⼮                   ---> 20%
     
����2)  90�̻� 'A'����     (3)A,B����  ---->"excellent"
           80�̻� 'B'����        C,D����  ---->"good"
           70�̻� 'C'����        F����    ---->"poor"
           60�̻� 'D'����        (switch���̿�) 
           ������ 'F'����
           (if~else if���̿�)

[�Է�ȭ��]
�߰����縦 �Է��Ͻÿ� : 90
�⸻���縦 �Է��Ͻÿ� : 89
���������� �Է��Ͻÿ� : 99
�⼮������ �Է��Ͻÿ�: 100

[���ȭ��]
����=93.20      <---�Ҽ����� 2°�ڸ�����
����=A              System.out.printf("���� : %.2f", avg);
��=excellent
 */
public class Exercise08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		float mid,fin,rep,att,mfav,repav,attav,total;
		
		System.out.print("�߰����縦 �Է��ϼ��� : ");
		mid=Integer.parseInt(br.readLine());
		
		System.out.print("�⸻���縦 �Է��ϼ��� : ");
		fin=Integer.parseInt(br.readLine());
		
		System.out.print("���������� �Է��ϼ��� : ");
		rep=Integer.parseInt(br.readLine());
		
		System.out.print("�⼮������ �Է��ϼ��� : ");
		att=Integer.parseInt(br.readLine());
		
		mfav=((mid+fin)/2)*0.6f;//53.7
		repav=rep*0.2f;//19.8
		attav=att*0.2f;//20
		total=mfav+repav+attav;
		System.out.println(mfav);
		
		char avg;
		if(total>=90) avg='A';
		else if(total>=80) avg='B';
		else if(total>=70) avg='C';
		else if(total>=60) avg='D';
		else avg='F';
		
		String re = "";
		switch(avg) {
		case 'A' :
		case 'B' : re="excellent"; break;
		case 'C' : 
		case 'D' : re="good"; break;
		case 'F' : re="poor"; break;
		}
		System.out.printf("����= %.2f\n", total);
		System.out.println("����= "+avg);
		System.out.println("��="+re);
	}

}