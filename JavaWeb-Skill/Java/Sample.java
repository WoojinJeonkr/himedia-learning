package Object;

class calculator{
	
	// 버스 : 641번, 함수 : 사람들을 태운다.
	// 영등포에서 강남을 지나 다시 영등포로 오는 순환 경로
	// 저기 내가 타야 하는 641 버스는 영등포에서 출발해서
	// 강남을 지나 영등포로 다시 돌아오는 순환버스이다.
	
//	int result=0;
	static int result=0;
//	int add(int num) {
	static int add(int num) {
		result += num;
		return result;
	}
}
public class Sample {
	public static void main(String[] args) {
		//--- static이 아닌 경우
//		calculator cal = new calculator();
//		System.out.println(cal.add(10));
//		System.out.println(cal.add(20));
		
		// static인 경우
//		System.out.println(calculator.add(10));
//		System.out.println(calculator.add(20));
		
		calculator cal1 = new calculator();
		calculator cal2 = new calculator();
		
		System.out.println(cal1.add(10));
		System.out.println(cal1.add(20));
		
		System.out.println(cal2.add(30));
		System.out.println(cal2.add(50));
	}
}
