package first_project;
/**
* @packageName : first_project
* @fileName : Variable.java
* @author : Woojin_Jeon
* @date : 2021.12.28
* @description : 변수 정의
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class Variable { //class는 첫글자를 대문자로 시작

	public static void main(String[] args) { // 함수는 첫글자를 소문자로 시작
		
		int x = 3; // 변수 x에 3을 정수형으로 저장
		int y = 5; // 변수 y에 5를 정수형으로 저장
		System.out.println("x:" + x + ", y:" + y); // x: x의 값, y: y의 값 출력
		
		int temp = x; // x라는 변수를 정수형 변수 temp에 저장
		x = y; // ; : 라인과 상관없이 프로그램의 내용이 끝나면 처리한다는 표시, 변수 x에 y의 값 저장
		y = temp; // 변수 y에 temp의 값 저장
		System.out.println("x:" + x + ", y:" + y); // x: x의 값, y: y의 값 출력
	}

}
