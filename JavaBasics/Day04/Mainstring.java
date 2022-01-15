package Fourth_project;
/**
* @프로그램 : 입력값을 주고 싶은 경우 - Arguments(인자) 탭
 */
/**
* @packageName : Fourth_project
* @fileName : Mainstring.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class Mainstring {
	// java MainString 10 20
	public static void main(String[] args) {
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(result);
	}

}