package test17;
/*
[����17]���� ���α׷��� ����ÿ�
(1)package���� test17���� �ϰ� Student.java,  StudentEx.java������ ����ÿ�
(2)Ŭ������ : Student
-name:String
-kor:int
-eng:int
-mat:int
+setStudent(name:String, kor:int, eng:int, mat:int):void
+getTotal():int        ==> �������ϱ�
+getAvg():double    ==> ��ձ��ϱ�
+getGrade():char     ==> �������ϱ� (switch�̿�)
+getResult():String   ==> ��� ���ϱ� (if�̿�)
+getView():String    ==> ��¹� �����

(3)Ŭ������ : StudentEx
Student ob=new Student();
ob.setStudent("�̼���",75,80,90);
System.out.println(ob.getView());

(4)���ȭ��
���� �̸��� �̼����̰� ������ 245���̰� 
����� 81.666666�̰� ������ B�����̸� 
����� �հ��Դϴ�
 */
public class StudentEx {

	public static void main(String[] args) {
		//��ü ����
		Student ob=new Student();
		ob.setStudent("�̼���",75,80,90);
		System.out.println(ob.getView());
	}

}