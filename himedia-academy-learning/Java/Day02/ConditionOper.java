package Second_project;
/**
* @packageName : Second_project
* @fileName : ConditionOper.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class ConditionOper {
	
	/*
	 삼항 연산자
	 자바에서 유일하게 피연산자를 세 개나 가지는 조건 연산자.
	 문법: 조건식 ? 반환값1 : 반환값2
	 */
	public static void main(String[] args) {
		
		int score = 85;
		
		// char grade = (score > 90) ? 'A' : 'B'; // 삼항 연산자
		char grade;
		if(score > 90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		
		System.out.println(score+" 점은 "+grade+"학점입니다.");

	}

}
