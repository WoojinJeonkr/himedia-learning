package Second_project;
/**
* @packageName : Second_project
* @fileName : DenyLogicOper.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class DenyLogicOper {

	/*
	boolean: 참 또는 거짓을 나타내는 값
	1바이트의 크기를 가지고 있다.
	주로 프로그램의 흐름을 제어하는 변수로 사용되는 데이터 타입.
	결과로 true 또는 false 라는 논리값을 반환한다.
	 */
	
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		if(!play) {
			
		}
	}

}
