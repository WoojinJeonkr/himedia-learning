package Third_project;
/**
* @packageName : Third_project
* @fileName : For4.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class For4 {

	public static void main(String[] args) {
		for(int n1 = 1; n1 < 10; n1++) {
			System.out.println(n1+"단");
			for(int n2 = 1; n2 < 10; n2++) {
				System.out.println(n1+"X"+n2+"="+(n1*n2));
			}
		}
	}
}

