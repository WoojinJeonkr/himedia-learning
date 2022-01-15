package Fourth_project;
/**
* @packageName : Fourth_project
* @fileName : ArrayCreate2.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class ArrayCreate2 {
	
	public static void main(String[] args) {
		int[] intarray = new int[3];
		intarray[0] = 90;
		intarray[1] = 97;
		intarray[2] = 83;
		
		// 배열 출력
		for(int i=0; i<intarray.length; i++) {
			System.out.println("intarray["+i+"]: "+intarray[i]);
		}
		
		double[] doublearray = new double[3];
		doublearray[0] = 0.1;
		doublearray[1] = 0.3;
		doublearray[2] = 0.5417;
		
		// 배열 출력
		for(int i=0; i<doublearray.length; i++) {
			System.out.println("doblearray["+i+"]: "+doublearray[i]);
		}
		
		String[] stringarray = new String[3];
		stringarray[0] = "1월";
		stringarray[1] = "2월";
		stringarray[2] = "3월";
		
		// 배열 출력
		for(int i=0; i<stringarray.length; i++) {
			System.out.println("stringarray["+i+"]: "+stringarray[i]);
		}
	}
}

