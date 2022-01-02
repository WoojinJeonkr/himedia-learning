package Second_project;

import java.util.Scanner; // import를 통해 외부 클래스를 호출, Scanner는 java.util 패키지에 포함되어 있음.
/**
* @packageName : Second_project
* @fileName : ScannerEx.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class ScannerEx {

	/*
	Scanner
	자바에서 입력받을 때 가장 많이 쓰이는 클래스
	정수, 실수, 문자열을 읽어올 수 있음
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner의 객체 생성, System.in: 입력 값을 바이트 단위로 읽음
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			// next + 자료형[ex.Int, Double]() : 정수, 실수를 입력받음
			// nextLine(): 문자열 전체를 입력받음
			System.out.println("입력된 문자열: \""+inputData+"\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
