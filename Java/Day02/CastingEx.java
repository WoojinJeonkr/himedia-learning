package Second_project;
/**
* @packageName : Second_project
* @fileName : CastingEx.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class CastingEx {
	/*
	 Casting(강제 타입 변환)
	 강제적으로 큰 데이터 타입을 작은 데이터 타입으로 쪼개 저장하는 것
	 "큰 그릇의 물을 작은 그릇에 넣고 나머지는 버리는 것"
	 int를 byte에 넣는다면 4byte의 int 중 1byte만 쪼개 byte에 넣는 것
	 */
	public static void main(String[] args) {
		
		int intValue = 44032;
		char charValue = (char)intValue; // int -> char
		System.out.println(charValue);
		
		long longValue = 500L;
		intValue = (int)longValue; // long -> int
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue; // double -> int
		System.out.println(intValue);
		
		//--------------------------------
		String str = "10000000";
		int str_int = Integer.parseInt(str); // parseInt(str): str을 숫자로 변환하여 리턴
		System.out.println("str_int:" + str_int);
	}

}
