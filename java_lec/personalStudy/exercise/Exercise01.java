package exercise;
/*
[문제1] 급여명세서를 작성하시오
  조건1) 기본급이 1500000원,수당이 55000원,세금은 기본급의 10%
            pay=1500000 / tpay=55000 / tax=0.1  
  조건2) 실수령액 = 기본급 + 시간수당 - 세금
           
[출력화면] 
실수령액 : 1405000원???

 */
public class Exercise01 {

	public static void main(String[] args) {
		int pay, tpay;
		double tax;
		pay=1500000;
		tpay=55000;
		tax=(pay+tpay)*0.1;
		
		System.out.println("실수령액 : "+((pay+tpay)-(int)tax));
	}

}
