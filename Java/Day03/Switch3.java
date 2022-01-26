package Third_project;
/**
* @packageName : Third_project
* @fileName : Switch3.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class Switch3 {
	
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
		
		// 문자열 변환
		String upper = " aB cd E";
		System.out.println(upper.toUpperCase()); // 문자열 전부 대문자로
		System.out.println(upper.toLowerCase()); // 문자열 전부 소문자로
		System.out.println(upper.trim()); // 앞뒤 공백 제거
		System.out.println(upper.replace(" ", "")); // replace(조건1, 조건2): 조건 1을 조건 2로 변환
	}

}

