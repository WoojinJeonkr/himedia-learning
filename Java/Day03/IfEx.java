package Third_project;

// import java.util.Scanner; // 점수를 입력받을 경우
/**
* @packageName : Third_project
* @fileName : IfEx.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class IfEx {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in); // 점수를 입력받을 경우
		/*
		조건문 사용: 행사 참여 인원을 제한할 경우, 예약 시간 제한, 날짜 비교
		*/
		/*
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 높습니다.");
			System.out.println("A학점입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 낮습니다.");
		}
		*/
		
		int score = 40;
		// int score = Integer.parseInt(scanner.nextLine()); // 점수를 입력받을 경우
		if (score >= 90) {
			System.out.println("점수가 90보다 높습니다.");
			System.out.println("A학점입니다.");
		} else if (score >= 80 ) {
//		}
//		if (score >= 80 ) {
			System.out.println("점수가 80보다 높습니다.");
			System.out.println("B학점입니다.");
		} else if (score >= 70 ) {
			System.out.println("점수가 70보다 높습니다.");
			System.out.println("C학점입니다.");
		} else if (score >= 60 ) {
			System.out.println("점수가 60보다 높습니다.");
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		// scanner.close(); // scanner문 종료
	}
}
