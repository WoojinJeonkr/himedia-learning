package Third_project;
/**
* @packageName : Third_project
* @fileName : For3.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30 				 Woojin_Jeon			  최초 생성
*/
public class For3 {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) { // (float x=0.1f; x<=1.0f; x++) 인 경우 0.1만 출력되는 오류가 발생한다.
			System.out.println(x);
		}
	}
}

