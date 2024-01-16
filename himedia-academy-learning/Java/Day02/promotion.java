package Second_project;
/**
* @packageName : Second_project
* @fileName : promotion.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class promotion {
	/*
	 자동 타입 변환(promotion)
	 작은 크기를 가지는 타입이 큰 크기를 가지는 타입으로 저장할 때 발생한다.
	 여기서 크기는 타입이 사용하는 메모리(byte) 크기로 판단한다.
	 byte(1) < short(2) < int(4) < long(8) < float(4) < double(8) 이런 식으로..
	 타입 변환이 발생하면 이전과 이후의 값은 동일하다.
	 단, byte 타입을 char 타입으로 변환할 수 없다.
	 */

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue; // byte -> int
		System.out.println("intValue:" + intValue);
		
		char charValue = '가';
		intValue = charValue; // char -> int
		System.out.println("유니코드:" + intValue);
		
		intValue = 50;
		long longValue = intValue; // int -> long
		System.out.println("longValue:" +longValue);
		
		longValue = 100;
		float floatValue = longValue; // long -> float
		System.out.println("floatValue:" +floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue; // float -> double
		System.out.println("doubleValue:" +doubleValue);
	}

}
