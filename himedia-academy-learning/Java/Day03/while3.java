package Third_project;
/**
* @packageName : Third_project
* @fileName : while3.java
* @author : Woojin_Jeon
* @date : 2021.12.30 
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class while3 {

	public static void main(String[] args) {

		while(true) { 
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			// 6이 나올 때까지 계속 난수 발생
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
