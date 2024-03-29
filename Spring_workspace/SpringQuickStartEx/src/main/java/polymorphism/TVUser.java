package polymorphism;

import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	
	public static void main(String[] args) {
		
		/*
		BeanFactory factory = new BeanFactory();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 TV?");
		String command = sc.nextLine();
		
		TV tv = (TV)factory.getBean(command); //각각의 tv와는 의존도가 완전히 떨어졌다
		
		*/
		
		
		
		//applictionContext.xml 관련
		//소스와 소스간의 결합도가 아예 없어짐
		//IoC container를 가동시켜라
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		//String str = new String("111.222.111.111");
		//String str = (String)factory.getBean("xxx");
		
		
		
		
		TV tv = (TV)factory.getBean("tv");
		tv = (TV)factory.getBean("tv");
		tv = (TV)factory.getBean("tv");
		tv = (TV)factory.getBean("tv");
		//실행했을때 기본생성자 호출 됨
		
		
		//SamsungTv 객체 생성
		//이런식으로 작성하면 결합도가 높아진다.
		//응집도는 당연히 있어야할 어떤 기능가 멤버 변수들이 그 위치에 있어야 한다
		//결합도를 낮춘다는 의미는 어떤 클래스와 어떤 클래스의 관계가 있는데..
		//결합도를 낮출때 
		//1. 인터페이스를 활용하자
		//2. factory를 사용해보자
		
		/* 결합도 높은 코드
		SamsungTv tv =  new SamsungTv();
		tv.powerOn();
		tv.volumUp();
		tv.volumDown();
		tv.powerOff();
				
		LgTv tv = new LgTv();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		*/
		
		
		//결합도가 낮아진 코드
		//TV tv = new LgTv();
		//TV tv = new SamsungTv();
		tv.powerOn();
		tv.volumUp();
		tv.volumDown();
		tv.powerOff();
		
	}
}
