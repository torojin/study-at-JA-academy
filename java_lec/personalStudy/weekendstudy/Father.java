package weekendstudy;
//�ڽ�Ŭ���� / �θ� Ŭ���� Family /interface Job���
public class Father extends Family implements Job{
	//default constructor
	public Father() {
		super();
	}
	public Father(String string) {
		super(string);
	}
	//interface ��� / �������̵�
	@Override
	public String work() {
		return "�ƺ��� ������ ���� �Ѵ�\n" ;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+this.work();
	}

}