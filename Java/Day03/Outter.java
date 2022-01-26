package Third_project;
/**
* @packageName : Third_project
* @fileName : Outter.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class Outter {

	public static void main(String[] args) {
		아웃: // 어떤 언어로(ex. 숫자, 한글, 일본어, 중국어 등) 적어도 인식이 된다.
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper+"~"+lower);
				if(lower == 'g') {
					break 아웃; // 출력 시 A~g 까지만 출력되고 멈춤
					//break; // A~a 에서 시작해서 Z~g 까지 출력
				}
			}
		}
	}

}
