package Second_project;
/**
* @packageName : Second_project
* @fileName : Stringfix.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class Stringfix {
	
	/*
	 Integer.parseInt: 문자열을 숫자로 변환
	 - Integer.parseInt(string s): 숫자형의 문자열을 받아 10진수의 숫자형으로 반환
	 - Integer.parseInt(string s, int radix): 숫자형의 문자열을 받고 변환할 진수 값을 입력하면 입력한 진수값의 숫자형으로 반환
	 
	 valueOf: 입력된 인자 값을 지정된 number 객체 형으로 변환하여 반환
	 - 인자 값 예시: 원시 데이터 형(byte, int, long, double과 같이 자바 키워드로 이미 지정된 데이터 형), 문자열 등
	 */
	
	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10"); // 클래스명.함수/변수명(값)
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("Value1:" + value1);
		System.out.println("Value2:" + value2);
		System.out.println("Value3:" + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println("str3:" + str3);
		
		System.out.println("" + 10);
		System.out.println("" + 3.14);
		System.out.println("" + true);
	}
}
