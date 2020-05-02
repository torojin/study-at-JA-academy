package test14;
/*
 (2) 파일명 : Emp  --main()포함 X
+name:String
+age:int
+tall:double
+setEmp(name:String, age:int, tall:double):void
+viewEmp():void
          
 */
public class Emp {
	//filed
	public String name;
	public int age;
	public double tall;
	
	//setter
	public void setEmp(String name, int age, double tall) {
		this.name=name;
		this.age=age;
		this.tall=tall;
	}
	
	//getter?
	public void viewEmp() {
		System.out.println("나의 이름은 "+name+"이며, "+age+"살이고 키는 "+tall+"cm입니다");
	}
}
