package polymorphism;

//simple factory?
//인스턴스를 생성하는게 Factory
public class BeanFactory {
	public TV getBean(String beanName) {
		if(beanName.equals("삼성")) {
			return new SamsungTv();
		}else if(beanName.equals("엘지")) {
			return new LgTv();
		}
		return null;
		
	}
}
