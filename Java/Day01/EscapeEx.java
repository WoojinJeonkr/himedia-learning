package first_project;
/**
* @packageName : first_project
* @fileName : EscapeEx.java
* @author : Woojin_Jeon
* @date : 2021.12.28
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class EscapeEx {

	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업"); // \t: tab(보통 스페이스 4칸을 기준으로 함), ln: 줄바꿈
		System.out.print("라인피드\n"); // \n: 줄바꿈 기호를 대신함, 라인피드: 커서를 아래로 이동
		System.out.print("캐리지리턴\r"); // \r: 줄바꿈 기호를 대신함, 캐리지리턴: 커서를 앞으로 이동
		System.out.println("우리는 \"개발자\"입니다."); // \"___\": ___은 문자열로 취급한다.
		System.out.print("봄\\여름\\가을\\겨울"); // \\: 문자열 \로 표시한다.
	}

}
