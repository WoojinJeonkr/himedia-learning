package first_project;
/**
* @packageName : first_project
* @fileName : Third.java
* @author : Woojin_Jeon
* @date : 2021.12.28
* @description : 시간과 분을 입력받아 분으로 환산
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class Third {

	public static void main(String[] args) {
		// String[]: 같은 데이터의 묶음, 배열
		
		int hour = 3; // hour이라는 변수에 3을 정수형으로 저장
		int minute = 5; // minute라는 변수에 5를 정수형으로 저장
		System.out.print(hour + "시간" + minute + "분은"); // hour시간minute분은 출력
		// + : 문자열을 붙이는 기능, " ": 따옴표 안은 문자열로 취급, 숫자와 문자를 붙이면 값은 문자로 취급
		
		int totalm = (hour*60) + minute; // 3시간 5분을 분으로 한다면 어떻게 되는가?
		System.out.println("총:" + totalm + "분입니다."); // 총:totalm분입니다. 출력
	}

}
