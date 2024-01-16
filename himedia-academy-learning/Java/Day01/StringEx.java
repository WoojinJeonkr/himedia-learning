package first_project;
/**
* @packageName : first_project
* @fileName : StringEx.java
* @author : Woojin_Jeon
* @date : 2021.12.28
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class StringEx {

	public static void main(String[] args) {
		// String은 타입이 아닌 객체이다.
		String name = "홍길동 ,	홍길순"; // 빈값(spacebar, Tab)도 코드값이 저장되어 있다.
		String job = "프로그래머";
		
		System.out.println(name); // name에 저장된 값 출력
		System.out.println(job); // job에 저장된 값 출력
	}

}
