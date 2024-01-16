package first_project;
/**
* @packageName : first_project
* @fileName : FloatDoubleEx.java
* @author : Woojin_Jeon
* @date : 2021.12.28
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.28   				 Woojin_Jeon			  최초 생성
*/
public class FloatDoubleEx {

	public static void main(String[] args) {
		// float var1 = 3.14; // float: 실수형, 크기 정밀도 차이
		float var2 = 3.14f;
		double var3 = 3.14; // 실수형의 기본은 double형이다.
		
		float var4 = 0.12345678901234567890f; // 8자리까지 표시, 정밀도: 7자리
		double var5 = 0.12345678901234567890; // 17자리까지 표시, 정밀도: 15자리

		System.out.println("var2:" + var2);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
		
		double var6 = 3e6; // e: 지수형, 0이 6개 붙음
		float var7 = 3e6f;
		double var8 = 3e-3;
		
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
	}

}
