package pack01;

import java.util.Date;

/**
 * 
  * @FileName : ReturnClass.java
  * @Project : test02
  * @Date : 2022. 2. 14. 
  * @작성자 : hi
  * @변경이력 :
  * @프로그램 : 반환값 연습
 */
public class ReturnClass {
	// public: 접근을 컨트롤
	public void add(int x) {
    	System.out.println(x+"입니다.");
    }
	
    public int add(int x, int y) {
        // 정수 + 정수 => 정수
        return x + y;
    }
    
    // java는 타입이 달라도 연산이 가능하다.
    public double add(double x, int y) {
        // 실수 + 정수 => 실수
        return x + y;
    }
    
    public String add(String x, String y) {
        // 문자 + 문자 => 문자
        return x + y;
    }
    
    public String add(int x, String y) {
        // 정수 + 문자 => 문자
        return x + y;
    }
    
    public int[] add() {
        // x => 배열
        int[] x = {1,2,3};
        return x;
    }
    
    public Date add2() {
    	Date date = new Date();
		return date;
	}
}
