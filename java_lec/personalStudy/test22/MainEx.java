package test22;
/*
[����22] ���� ���α׷��� �ϼ��Ͻÿ�
(1) package���� test22�� �ϰ� Salary.java, SalarySub.java, MainEx.java������ ����ÿ�
(2) ���ϸ� : Salary      
-name:String
-salary:int
+Salary()
+Salary(name:String, salary:int)
+toString():String         ==>  �̸�, �������
    
(3) ���ϸ� : SalarySub   ==> Salary���
-dept:String
+SalarySub()
+SalarySub(dept:String)
+SalarySub(name:String, salary:int, dept:String)   ==> name, salary�� �θ�����ڷ� �ѱ�
+toString():String         ==>  �μ����

(4) ���ϸ� : MainEx  --main()���� O
SalarySub ob = new SalarySub("��ö����",85000000,"ö���");
System.out.println(ob.toString());

(5) ���ȭ��
�̸� : ��ö����
���� : 85000000
�μ� : ö���
 */
public class MainEx {

	public static void main(String[] args) {
		SalarySub ob = new SalarySub("��ö����",85000000,"ö���");
		System.out.println(ob.toString());
	}

}