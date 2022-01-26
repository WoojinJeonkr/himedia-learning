package Second_project;

import java.util.Scanner;

/**
* @packageName : Second_project
* @fileName : LogicOper.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class LogicOper {
	
	public static void main(String[] args) {
		
		/*
		논리 연산자
		AND : 둘 다 참일 경우에만 연산 결과가 true가 됨.
		 1) a && b (만약 a가 false 이면 b는 따져보지도 않고 결과값 false)
		 2) a & b (a가 false 일지라도, b 까지 따져봄)
		OR : 두개의 조건 중 하나라도 true이면 결과는 true
		 1) a || b (a가 true이면 b는 따져 보지도 않고 결과값 true)
		 2) a | b (a가 true일지라도 b 까지 따져봄)
		NOT : 조건문이 true이면 false, false이면 true가 된다.
		 1) !a (a의 값이  true -> false, false -> true)
		 */
		int charCode = 'A'; // 65
		System.out.println("charCode:"+charCode);
		
		if((charCode >= 65) & (charCode <= 98)){
			System.out.println("대문자 이군요.");
		}
		
		if((charCode >= 97) & (charCode <= 122)){
			System.out.println("소문자 이군요.");
		}
		
//		if(!(charCode < 48) & !(charCode > 57)){
//			System.out.println("0~9 숫자 이군요.");
//		}
		
		if((charCode < 48) & (charCode > 57)){
			System.out.println("0~9 숫자 이군요.");
		}
	}

}