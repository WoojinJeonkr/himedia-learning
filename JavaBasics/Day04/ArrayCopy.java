package Fourth_project;
/**
* @packageName : Fourth_project
* @fileName : ArrayCopy.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class ArrayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java", "Python", "C++"};
		String[] newStrArray = new String[5];

		//(원본배열, 시작 인덱스, 복사할 배열, 복사 시작할 인덱스(부분), 복사할 개수)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		String result = "";
		result += "(";
		for(int i=0; i<newStrArray.length;i++) {
			// 출력 맨 끝의 ,를 제거하는 방법
			if(i == newStrArray.length-1) {
				result += newStrArray[i];
			} else {
				result += newStrArray[i]+",";
			}
		}
		result += ")";
		System.out.print(result);
	}
}
