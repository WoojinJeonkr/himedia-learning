package Second_project;
/**
* @packageName : Second_project
* @fileName : StringConcatEx.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class StringConcatEx {
	/*
	 + 연산자
	 문자열을 붙일 때 가장 직관적으로 생각할 수 있는 방법이다.
	 */
	public static void main(String[] args) {
		
		int Value = 10 + 2 + 8;
		System.out.println("Value:" + Value);
		
		String str1 = 10 + 2 + "8"; // 128
		// String str1 = (10 + 2 + Integer.parseInt("8"))+""; // 20
		System.out.println("str1:" + str1);

		String str2 = 10 + "2" + 8; // 1028
		System.out.println("str2:" + str2);
		
		String str3 = "10" + 2 + 8; // 1028
		System.out.println("str3:" + str3);
		
		String str4 = "10" + (2 + 8); // 1010
		System.out.println("str4:" + str4);
	}

}
