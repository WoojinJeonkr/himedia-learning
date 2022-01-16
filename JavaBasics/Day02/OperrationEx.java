package Second_project;
/**
* @packageName : Second_project
* @fileName : OperrationEx.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class OperrationEx {
	/*
	 연산자에서의 자동 타입 Casting
	 서로 다른 피연산자가 있을 경우
	 두 피연산자 중 크기가 큰 타입으로 자동 변환한 후 연산을 수행한다.
	 */
	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; // java는 정수 연산을 int로 하므로, byte끼리는 연산이 불가능하다.
		int byteValue3 = byteValue1 + byteValue2; // byte 연산을 위해 byte를 int로 promotion
		System.out.println(byteValue3);
		
		char charValue1 = 'A'; // 'A': 65
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; // java는 정수 연산을 int로 하므로, char끼리는 연산이 불가능하다.
		int charValue3 = charValue1 + charValue2; // char 연산을 위해 char를 int로 promotion
		System.out.println("유니코드:" + charValue3);
		System.out.println("문자:" + (char)charValue3);

		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0; // int에서는 실수 연산을 할 수 없다.
		double doubleValue6 = intValue5 / 4.0;
		System.out.println(doubleValue6);
		
		int x = 1;
		int y = 2;
		// double result = x/y; // 0.0
		double result = (double) x/y; // 0.5
		System.out.println(result);
	}

}
