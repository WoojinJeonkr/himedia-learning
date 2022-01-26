package Third_project;
/**
* @packageName : Third_project
* @fileName : Array.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class Array {
	/*
	Array
	동일한 자료형(Data Type)의 데이터를 연속된 공간에 저장하기 위한 자료구조이다. 즉, 연관된 데이터를 그룹화하여 묶어준다.
	연관된 데이터를 저장하기 위한 변수의 선언을 줄여주며, 반복문 등을 이용하여 계산과 같은 과정을 쉽게 처리할 수 있다.
	
	1번째 방법
	
	자료형[] 변수 = {데이터1, 데이터2, 데이터3, ... };
	- 데이터들의 값을 알고 있을 때 사용하면 편리
	
	2번째 방법
	
	자료형[] 변수 = new 자료형[배열 크기] // 좌항과 우항의 자료형 통일
	변수[0] = 데이터값;
	변수[1] = 데이터값;
	- 배열의 값은 모르지만 향후 값을 저장하기 위한 배열을 생성하고 싶을 경우 주로 사용한다.
	*/
	public static void main(String[] args) {
		
		// scores 배열 선언
		
		// int[] scores = {83, 90, 87, 90}; // []: 변수가 배열 타입 이라고 선언, {}: 중괄호 안에 배열의 내용이 들어감, index는 0부터 시작한다.
		// String[] scores = {"한글","영어","일본어"};
		
		int[] scores = new int[4];
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 87;
		scores[3] = 90;
		
		// 출력
//		System.out.println("scores[0]:"+scores[0]);
//		System.out.println("scores[1]:"+scores[1]);
//		System.out.println("scores[2]:"+scores[2]);
//		System.out.println("scores[3]:"+scores[3]);
		
		// 배열의 합
		int sum = 0;
		// for(int i=0; i<3; i++) {
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]:"+scores[i]); // 출력
			sum += scores[i];
		}
		System.out.println("총합: "+sum);
		
		// 배열의 평균
		// double avg = (double)sum/3;
		 double avg = (double)sum/scores.length;
		System.out.println("평균: "+avg);
	}

}
