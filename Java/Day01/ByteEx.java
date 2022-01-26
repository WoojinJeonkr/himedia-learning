package first_project;
/**
* @packageName : first_project
* @fileName : ByteEx.java
* @author : Woojin_Jeon
* @date : 2021.12.28 
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class ByteEx {

	public static void main(String[] args) {
		byte var1 = -128; // 변수 var1에 -128을 byte형으로 저장
		byte var2 = -30; // 변수 var2에 -30을 byte형으로 저장
		byte var3 = 0; // 변수 var3에 0을 byte형으로 저장
		byte var4 = 30; // 변수 var4에 30을 byte형으로 저장
		byte var5 = 127; // 변수 var5에 127을 byte형으로 저장
		// byte var6 = 128; // byte형 변수에는 -128 ~ 127까지 저장이 가능하므로 오류 문구가 표시된다.
		
		System.out.println(var1); // 변수 var1의 값 출력
		System.out.println(var2); // 변수 var2의 값 출력
		System.out.println(var3); // 변수 var3의 값 출력
		System.out.println(var4); // 변수 var4의 값 출력
		System.out.println(var5); // 변수 var5의 값 출력
	}

}
