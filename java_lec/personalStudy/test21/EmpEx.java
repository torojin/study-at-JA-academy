package test21;
/*
[����21]���� EmpExŬ������ ������ ���� EmpŬ������ ����ÿ�
(1)package���� test21���� �ϰ� Emp.java,  EmpEx.java������ ����ÿ�
(2)Ŭ������ : Emp
//�������� EmpEx�� ���� �ۼ��Ͻÿ�


(3)Ŭ������ : EmpEx
Emp em=new Emp();
em.setName("��ȣ��");
em.setDept("������");
em.setSalary(1200000);
System.out.println(em.toString());

System.out.println("�̸� : " + em.getName());
System.out.println("�μ� : " + em.getDept());
System.out.println("�޿� : " + em.getSalary() + "��");

(4)���ȭ��
��ȣ���� �����λ���̸� 1520000���� �޿��� �޽��ϴ�

�̸� : ��ȣ��
�μ� : ������
�޿� : 1200000��
 */
public class EmpEx {

	public static void main(String[] args) {
		Emp em=new Emp();
		em.setName("��ȣ��");
		em.setDept("������");
		em.setSalary(1200000);
		System.out.println(em.toString());
		System.out.println();
		System.out.println("�̸� : " + em.getName());
		System.out.println("�μ� : " + em.getDept());
		System.out.println("�޿� : " + em.getSalary() + "��");
	}

}