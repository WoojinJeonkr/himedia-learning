package pack02.subPack;

public class Phone {
	// 멤버 변수 3개
	String color; // 전역변수(global), 변수의 자동 초기화
	// null로 초기화
	int size; // 0으로 초기화
	int price = 0;
	
	// 멤버 메서드 2개
	// Phone를 가지고 할 동작(기능을 정의)
	public void tel(String no) {
		System.out.println(no+"로 전화를 걸다.");
	}
	
	public void kakao(String name) {
		System.out.println(name+"과 카톡하다.");
	}

	// 생성된 객체의 변수 저장된 것을 스트링으로 반환
	@Override
	public String toString() {
		return "휴대폰 [색=" + color + ", 크기=" + size + ", 가격=" + price + "]";
	}	
}
