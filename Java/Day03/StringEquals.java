package Third_project;
/**
* @packageName : Third_project
* @fileName : StringEquals.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class StringEquals {

	public static void main(String[] args) {
		String strVar1 = "자바";
		String strVar2 = "자바";
		
		if(strVar1 == strVar2) { // 메모리 번지 값 비교
			System.out.println("strVar1과 strVar2는 참조가 같음"); // 참조 : 메모리 주소
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { // 비교 대상1.equals(비교 대상2)
			System.out.println("strVar1과 strVar2는 문자값이 같음");
		}
		
		String strVar3 = new String("자바");
		String strVar4 = new String("자바");
		
		if(strVar3 == strVar4) { // 메모리 번지 값 비교
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) { // 값을 비교하는데 사용
			System.out.println("strVar1과 strVar2는 문자값이 같음");
		}
	}

}
