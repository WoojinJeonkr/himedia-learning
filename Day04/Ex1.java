package Fourth_project;
/**
* @프로그램 : 배열에 임의의 숫자 5개를 넣고 최대값을 찾으시오.
*/
/**
* @packageName : Fourth_project
* @fileName : Ex1.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class Ex1 {

	public static void main(String[] args) {
//		int[] intarray = {30, 20, 31, 23, 32};
//
//			if((intarray[0] > intarray[1]) && (intarray[0] > intarray[2])
//					&& (intarray[0] > intarray[3]) && (intarray[0] > intarray[4])) {
//				System.out.println("최대값: "+intarray[0]);
//			} else if((intarray[1] > intarray[2])
//					&& (intarray[1] > intarray[3]) && (intarray[1] > intarray[4])) {
//				System.out.println("최대값: "+intarray[1]);
//			} else if((intarray[2] > intarray[3]) && (intarray[2] > intarray[4])) {
//				System.out.println("최대값: "+intarray[2]);
//			} else if(intarray[3] > intarray[4]) {
//				System.out.println("최대값: "+intarray[3]);
//			} else {
//				System.out.println("최대값: "+intarray[4]);
//		}
		
		int max=0;
		int[] intarr = {30, 20, 31, 23, 32};
		
		for(int intar : intarr) {
			if( max < intar) {
				max = intar;
			}
		}
		System.out.println("max:"+max);
		
	}
}

