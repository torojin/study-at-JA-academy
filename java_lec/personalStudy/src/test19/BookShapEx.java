package test19;
/*
[����19] Ŭ���� 2���� ����� setter & getter�� �̿��Ͽ� ������ �ϼ��Ͻÿ�
(1) package���� test19�� �ϰ� BookShapEx.java������ ����ÿ�
Ŭ������ : BookShop
-bname:String   (å�̸�)
-author:String   (����) 
-price:int          (����) 

+setBook(bname:String,  author:String, price:int):void
+viewBook():void
+setter & getter

Ŭ������:BookShopEx  -- main() ����
BookShop ob=new BookShop();
ob.setBook("�ڹٿϼ�","Ȳ�ϼ�",25000);
//viewBook()�޼��带 �̿��ؼ� ������ �ϼ��Ͻÿ�

ob.setBname("JSP���"),  
ob.setAuthor("��JP"), 
ob.setPrice(3500)
//getter�� �̿��ؼ� ������ �ϼ��Ͻÿ�

(3) ���ȭ��
å�̸� : �ڹٿϼ�
��  �� : Ȳ�ϼ�
��  �� : 25000��

å�̸� : JSP���
��  �� : ��JP
��  �� : 35000��
 */
class BookShop{
	//filed
	private String bname;
	private String author;
	private int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname=bname;
		this.author=author;
		this.price=price;
	}
	public void viewBook() {
		System.out.println("å�̸� : "+bname);
		System.out.println("��  �� : "+author);
		System.out.println("��  �� : "+price+"��");
	}
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class BookShapEx {

	public static void main(String[] args) {
		BookShop ob=new BookShop();
		//setData
		ob.setBook("�ڹٿϼ�","Ȳ�ϼ�",25000);
		//������� ��ġ�ؾ� ���ϴ� �����Ͱ� ��µ�
		ob.viewBook();
		
		ob.setBname("JSP���");
		ob.setAuthor("��JP");
		ob.setPrice(3500);
		
		
		//getter ���
		System.out.println("å�̸� : "+ob.getBname());
		System.out.println("��  �� : "+ob.getAuthor());
		System.out.println("��  �� : "+ob.getPrice()+"��");
		System.out.println();
		
		
	}

}