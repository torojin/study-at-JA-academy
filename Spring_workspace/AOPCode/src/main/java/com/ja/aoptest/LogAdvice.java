package com.ja.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	//어떤 pointcut이 사용됐는지 표시하는 방법
	//Joinpoint 사용
	public void test() {
		System.out.println("ttttt");
	}
	
	public void printLog(JoinPoint jp) {
		//System.out.println("[공통로그] 비즈니스 로직 수행 전 동작");
		String methodName = jp.getSignature().getName();
		System.out.println(methodName + "] 메소드 실행 전");
	}
	
	public void printAfterLog(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		System.out.println(methodName + "] 메소드 실행 후");
	}
	
	//앞뒤에 로그 찍고 싶을때
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		String name = pjp.getSignature().getName();
		System.out.println(name+"] 실행전");
		Object obj = pjp.proceed();
		System.out.println(name+"] 실행후");
		return obj;
	}
	
}
