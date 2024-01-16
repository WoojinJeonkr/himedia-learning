package Second_project;
/**
* @packageName : Second_project
* @fileName : PrintfEx.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class PrintfEx {

	/*
	System.out.printf("출력 서식", 출력할 내용); : 어떤 format(서식/틀 대로 출력하려고 할 때 사용)
	- 출력 서식: 지시자와 문자가 들어간다. 지시자를 제외한 문자는 그대로 출력된다.
	
	-- 지시자
	--- %d: 10진수 정수형으로 출력
	--- %f: 소수점 형식으로 출력
	--- %s: 문자열 형식으로 출력
	--- %c: 문자 형식으로 출력
	--- %n: 줄바꿈 지시자 = 엔터, 개행
	--- %b: boolean형태로 출력
	
	- 출력할 내용: "출력 서식"의 지시자가 되는 변수들이 순서대로 들어간다. (지시자 개수, 순서 = 변수의 개수, 순서 순)
	- printf는 println처럼 자동 줄바꿈이 되지 않으므로 줄바꿈을 하고 싶다면 출력서식에서 원하는 위치에 %n을 넣어야 한다
	
	 */
	public static void main(String[] args) {
		int value = 12300;
		System.out.printf("상품의 가격:%d원\n", value); // 정수형 출력
		System.out.printf("상품의 가격:%6d원\n", value); // 최대 6자리의 정수를 출력하되, 다 출력하고 남는 자리는 공백으로 채우고 오른쪽 정렬
		System.out.printf("상품의 가격:%-6d원\n", value); // 최대 6자리의 정수를 출력하되, 다 출력하고 남는 자리는 공백으로 채우고 왼쪽 정렬
		System.out.printf("상품의 가격:%06d원\n", value); // 최대 6자리의 정수를 출력하되, 다 출력하고 남는 자리는 공백으로 채우고 오른쪽 정렬
		
		double area = 3.14159 * 10 * 10;
		// double area = 3.14159;
		System.out.printf("반지름이 %d인 원의 넓이:%10s\n", 10, area);
		
		String name = "홍길동";
		String job = "의적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
