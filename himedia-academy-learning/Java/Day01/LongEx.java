package first_project;
/**
* @packageName : first_project
* @fileName : LongEx.java
* @author : Woojin_Jeon
* @date : 2021.12.28
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성 
*/
public class LongEx {

	public static void main(String[] args) {
		long var1 = 10; // 변수 var1에 숫자 10을 long형으로 저장
		long var2 = 20L; // 변수 var2에 숫자 20을 long형으로 저장
		// long var3 = 10000000000;
		// 자바는 수를 변수에 저장하기 전에 그 수를 메모리에 저장하는데, 저장하는 형태가 무조건 int형이므로 숫자값을 int형으로 나타낼 수 없음
		long var4 = 10000000000L; // 접미사 L을 사용하여 숫자값을 long형으로 저장하도록 함.
		
		System.out.println(var1); // var1 출력
		System.out.println(var2); // var2 출력
		System.out.println(var4); // var4 출력

	}

}
