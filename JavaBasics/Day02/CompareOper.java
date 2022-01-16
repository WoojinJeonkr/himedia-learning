package Second_project;
/**
* @packageName : Second_project
* @fileName : CompareOper.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class CompareOper {
	
	/*
	 두 개의 변수 또는 리터럴을 비교하는 데 사용되는 연산자
	 주로 조건문과 반복문의 조건식에 사용, 연산결과는 true 또는 false.
	 비교연산자 역시 이항연산자이므로
	 비교하는 피연산자의 자료형이 서로 다를 경우에는 자료형의 범위가 큰 쪽으로 형변환을 하여
	 피연산자의 타입을 일치시킨 후에 비교한다.
	 
	==	: 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 참을 반환함.
	!=	: 왼쪽의 피연산자와 오른쪽의 피연산자가 같지 않으면 참을 반환함.
	>	: 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 참을 반환함.
	>=	: 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같으면 참을 반환함.
	<	: 왼쪽의 피연산자가 오른쪽의 피연산자보다 작으면 참을 반환함.
	<=	: 왼쪽의 피연산자가 오른쪽의 피연산자보다 작거나 같으면 참을 반환함.

	 */
	
	public static void main(String[] args) {
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // v2 == v3를 만족하면 true로 출력, 그렇지 않다면 false로 출력 // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		// System.out.println(v4 == v5); // v4 == v5를 만족하면 true로 출력, 그렇지 않다면 false로 출력 // false
		System.out.println((float)v4 == v5); // true		
	}

}
