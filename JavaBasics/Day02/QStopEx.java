package Second_project;

import java.io.IOException;
/**
* @packageName : Second_project
* @fileName : QStopEx.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class QStopEx {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) { 
			keyCode = System.in.read();
			System.out.println("keyCode:"+keyCode);
			if(keyCode == 113) { // keyCode가 113과 같으면
				break; // 종료
			}
		}
		
		System.out.println("종료"); // 종료 출력
	}

}
