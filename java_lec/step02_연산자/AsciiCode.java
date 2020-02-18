package step02_연산자;
/*
 * 7비트 정보교환용 코드 2^7(2의7승 = 파이선에선 2**7) 개의 자료표현
 * A : 65, a : 97 \n : 13 //기억할것
 */
public class AsciiCode {

	public static void main(String[] args) {
		System.out.println("A : "+(int)'A'); //(int) 캐스팅 : 자료의 형변환 / 문자 A가 숫자로 바꿔달라라는 의미
		System.out.println("a : "+(int)'a');
		
		System.out.println(65+" : "+(char)65); 
		System.out.println(97+" : "+(char)97); 
		
		System.out.println("--------------------------");
		
		//대소문자 변환할 때 사용
		//ctrl + shift + x
		System.out.println('A'+1); //char + int = int
		System.out.println((char)('A'+1));
		
		System.out.println('a'-32);
		System.out.println((char)('a'-32)); //기억할 것
		
		System.out.println('A'+'B'); //char + char = int
		
	}

}
























