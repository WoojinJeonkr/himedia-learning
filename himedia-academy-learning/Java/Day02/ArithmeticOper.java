package Second_project;
/**
* @packageName : Second_project
* @fileName : ArithmeticOper.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class ArithmeticOper {
	
	/*
	산술 연산자
	사칙연산을 다루는 연산자로, 가장 기본적이면서도 가장 많이 사용되는 연산자 중 하나.
	모두 두 개의 피연산자를 가지는 이항 연산자
	피연산자들의 결합 방향은 왼쪽에서 오른쪽이다.
	
	+	: 왼쪽의 피연산자에 오른쪽의 피연산자를 더함.
	-	: 왼쪽의 피연산자에서 오른쪽의 피연산자를 뺌.
	 *	: 왼쪽의 피연산자에 오른쪽의 피연산자를 곱함.
	/	: 왼쪽의 피연산자를 오른쪽의 피연산자로 나눔.
	%	: 왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 반환함.
	
	 */

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("v1 + v2:"+result1);

		int result2 = v1 - v2;
		System.out.println("v1 + v2:"+result2);
		
		int result3 = v1 * v2;
		System.out.println("v1 + v2:"+result3);
		
		int result4 = v1 / v2;
		System.out.println("v1 + v2:"+result4);
		
		int result5 = v1 % v2; // v1을 v2로 나눈 나머지의 값
		System.out.println("v1 + v2:"+result5);
	}

}
