package Second_project;

import java.io.IOException;
/**
* @packageName : Second_project
* @fileName : KeyCode.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class KeyCode {
	/*
	System.in: 값을 입력받는 클래스
	값은 여러가지 방식으로 들어오기 때문에 만약 잘못된 값이 들어온 경우 에러가 나지 않도록 예외처리 필수
	try-catch 구문 혹은 IOException을 사용하여 예외처리를 하지 않으면 에러가 나타남
	
	read()
	- 한 바이트씩 입력된 값을 읽는 메서드
	- 한 바이트씩 입력을 받기 때문에 한글 입력 X, 영어, 숫자, 특수문자 등을 입력받을 수 있음
	
	- System.in.read()로 받아들인 값은 아스키코드의 10진수로 표현이 된다.
	 */
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode1: "+keyCode); // 유니코드 값
		
		keyCode = System.in.read();
		System.out.println("keyCode2: "+keyCode); // 캐리지리턴 값
		
		keyCode = System.in.read();
		System.out.println("keyCode3: "+keyCode); // 라인피드값



	}

}
