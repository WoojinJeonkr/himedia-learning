package Second_project;

import java.io.IOException;
/**
* @packageName : Second_project
* @fileName : ContinueKey.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class ContinueKey {

	/*
	throws IOException: 예외가 발생하면 해당 클래스에서 벗어나게 됨.
	예외 부분을 감싸는 try~catch 문이 있다면 튕겨져나온 예외를 핸들링할 수 있음.
	
	while(조건문){
	 	문장 
	}
	조건문이 참인 동안에 while에 속해 있는 문장들을 계속해서 수행
	
	 */
	public static void main(String[] args) throws IOException {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode:" + keyCode);
		}

	}

}

