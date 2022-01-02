package first_project;
/**
* @packageName : first_project
* @fileName : IntegerLiteral.java
* @author : Woojin_Jeon
* @date : 2021.12.28
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class IntegerLiteral {

	public static void main(String[] args) {
		int var1 = 0b1011;	// 2진수
		int var2 = 0206;	// 8진수
		int var3 = 365;		// 10진수
		int var4 = 0x83;	// 16진수

		System.out.println("var1:" + var1); // var1: var1의 값 출력
		System.out.println("var2:" + var2); // var2: var2의 값 출력
		System.out.println("var3:" + var3); // var3: var3의 값 출력
		System.out.println("var4:" + var4); // var4: var4의 값 출력
	}

}
