package first_project;
/**
* @packageName : first_project
* @fileName : CharEx.java
* @author : Woojin_Jeon
* @date : 2021.12.28 
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class CharEx {

	public static void main(String[] args) {
		char c1 = 'A'; // 변수 c1에 문자열 A를 char형으로 저장
		char c2 = 65; // 변수 c2에 숫자 65을 char형으로 저장
		char c3 = '\u0041'; // 변수 c3에 코드 \u0041을 char형으로 저장
		
		char c4 = '가'; // 변수 c4에 문자열 가를 char형으로 저장
		char c5 = 44832; // 변수 c5에 숫자 44832를 char형으로 저장
		char c6 = '\uac00'; // 변수 c6에 코드 \uac00을 char형으로 저장
		
		char c7 = '한'; // 변수 c7에 문자열 한을 char형으로 저장
		
		System.out.println(c1); // c1의 값 출력
		System.out.println(c2); // c2의 값 출력
		System.out.println(c3); // c3의 값 출력
		System.out.println(c4); // c4의 값 출력
		System.out.println(c5); // c5의 값 출력
		System.out.println(c6); // c6의 값 출력
		System.out.println(c7); // c7의 값 출력
		//---------------------------------------
		char ch1 = '9';
		int i1 = ch1 - '0'; // 57 - 48  = 9
		System.out.println(ch1);
		System.out.println(i1);
		
		int ascilValue = '0';
		System.out.println("ASCII Numeric Value: " + ascilValue);
	}
}
