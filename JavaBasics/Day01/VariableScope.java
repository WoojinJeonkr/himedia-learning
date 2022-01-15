package first_project;
/**
* @packageName : first_project
* @fileName : VariableScope.java
* @author : Woojin_Jeon
* @date : 2021.12.28
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class VariableScope {

	/*
	public static void main(String[] args) {
		int v1 = 15; // 변수 v1에 15를 정수형으로 저장
		// if문 (v1 > 10을 만족하는 경우 if 안을 수행, 만족하지 않는다면 수행하지 않음)
		if(v1 > 10) {
			int v2; // 변수 v2를 정수형으로 선언
			v2 = v1 - 10; // v2 = 15 - 10 = 5
		}
		// int v3 = v1 + v2 + 5;
	}
	*/
	public static void main(String[] args) {
		int v1 = 15;
		int v2; // 오류 문구 의미: 변수 v2를 사용하지 않는데 왜 선언을 했는가?
		if(v1 > 10) v2 = v1 - 10;
		}

}
