package Second_project;
/**
* @packageName : Second_project
* @fileName : SignOperator.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class SignOperator {
	
	/*
	부호 연산자
	+, - 두 가지가 있음.
	덧셈, 뺄셈 연산에 사용하는 이항 연산자이면서, 부호를 나타내는 단항 연산자로도 사용함.
	 */

	public static void main(String[] args) {
		int x = 100;
		int result1 = +x;
		int result2 = -x;
		int result2_1 = x * -1;
		int result3 = +result2;
		int result4 = -result2;
		int result4_1 = result2 * -1;
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		System.out.println("result2_1:" + result2_1);
		System.out.println("result3:" + result3);
		System.out.println("result4:" + result4);
		System.out.println("result4_1:" + result4_1);
		
		byte b = 100;
		byte result5 = (byte)-b;
		// byte result5 = -b; (오류) -> 
		// int result5 = -b; (다른 방법)
		System.out.println("result5:" + result5);
		
		float f = 3.14f;
		float result6 = -f;
		System.out.println("result6:" + result6);

		double d = 3.141592653259;
		double result7 = -d;
		System.out.println("result7:" + result7);
	}

}
