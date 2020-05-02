package weekendstudy;

/*
 * ���� �ָ��� Ǯ���
 * 
 * interface ��ӹ޾Ƽ�..
 * family �θ�Ŭ����
 * �������̵�� Ŭ�������� interface�� ��Ӹ�
 * 
 * ��ư� �Ϸ��� object array�� �غ��� 
 * 
 * --���
 * 
 * �̸� : ȫ�浿
 * �ƺ��� ������ ���� �Ѵ�
 * 
 * �̸� : ��û
 * ������ �������� �Ѵ�
 * 
 * �̸� : ȫ��ǥ
 * �Ƶ��� ���θ� �Ѵ�
 * 
 */
public class MainEx {
	public static void main(String[] args) {
		//Object(Instance) ����
		
		Father ob1=new Father("ȫ�浿");
		Mother ob2=new Mother("��û");
		Son ob3=new Son("ȫ��ǥ");
		
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());
		
		
		System.out.println("-------------ArrayType---------------");
		
		//Object(Instance) ����
		//ArrayType1 ����
		/*
		Family[] fam=new Family[3];
		fam[0]=new Father("ȫ�浿");//��ӹ��� Ŭ������ ��ü ����??
		fam[1]=new Mother("��û");
		fam[2]=new Son("ȫ��ǥ");
		*/
		
		//ArrayType2 ����
		Family[] fam=new Family[] {new Father("ȫ�浿"),
								new Mother("��û"),
								new Son("ȫ��ǥ")
		};
		
		//����� ���� for��
		for(int i=0; i<fam.length; i++) {
			System.out.println(fam[i].toString());
		}
		
		/*
		//����� ���� ���� for��
		for(Family ob : fam) {
			System.out.println(ob.toString());
		}
		*/
		
	}
}