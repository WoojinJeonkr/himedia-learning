package Second_project;

import java.util.Scanner; // import java.util.*; : java.util 패키지 전체를 사용
/**
* @packageName : Second_project
* @fileName : Ex1.java
* @author : Woojin_Jeon
* @date : 2021.12.29 
* @description : 아이디, 패스워드를 입력받아 아이디가 : users, 패스워드가 : 19876일 때 로그인 성공
* 아이디가 틀렸을 경우 : 아이디가 존재하지 않습니다. , 패스워드가 틀렸을 경우 : 로그인 실패로 각각 콘솔창에 로깅
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String ID;
		int Password;
		
		ID = scanner.nextLine();
		Password = Integer.parseInt(scanner.nextLine());
		
		/*
		// 방법 1 : if문 연속
		if(ID.equals("users") & (Password == 19876)) {
			System.out.println("로그인 성공");
		}
		if (!(ID.equals("users"))) {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		if (Password != 19876) {
			System.out.println("로그인 실패");
		}
		
		// 오류 : if-else문 -> ID와 Password가 모두 만족할 때 로그인 성공 문구가 2번 출력됨.
		if (!(ID.equals("users"))) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else if(ID.equals("users") & (Password == 19876)) {
				System.out.println("로그인 성공");
		}
		if (Password != 19876) {
			System.out.println("로그인 실패");
		} else if(ID.equals("users") & (Password == 19876)) {
			System.out.println("로그인 성공");
		}
		
		// 방법 2: if-else문 사용 -> ID와 Password가 모두 만족할 때 로그인 성공 문구가 1번 출력됨.
				if (ID.equals("users")) {
					if (Password == 19876) {
						System.out.println("로그인 성공했습니다.");
					} else {
						System.out.println("로그인 실패: 패스워드 틀림");
					}
				} else {
						System.out.println("로그인 실패 : 아이디가 존재하지 않습니다.");
				}
		*/
		
		// 방법 3 : else if문 -> ID와 Password가 모두 만족할 때 로그인 성공 문구가 1번 출력됨.
		if (!(ID.equals("users"))) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else if (Password != 19876) {
			System.out.println("로그인 실패");
		} else if(ID.equals("users") & (Password == 19876)) {
			System.out.println("로그인 성공");
		}
	}
}

