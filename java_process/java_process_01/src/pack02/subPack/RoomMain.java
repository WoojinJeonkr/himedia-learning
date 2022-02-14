package pack02.subPack;

public class RoomMain {

	public static void main(String[] args) {
		
		// 휴대폰 1대 생성 (변수 4개 생성)
		Phone p = new Phone();
		
		// 멤버 변수를 프린트
		System.out.println(p);
		
		// 휴대폰에 color, size, price 값 넣기
		p.color = "빨강";
		p.size = 5;
		p.price = 10;
		
		// 멤버 변수를 프린트
		System.out.println(p);
		
		// 필요한 TV 2개 생성
		TV myTv = new TV();
		TV yourTv = new TV();
		
		// TV에 ch, vol, onOff 값 넣기
		// . : 접근 연산자
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = true;
		// 그림과 비교하기
		
		// 전체 변수가 몇 개 생성되었을까?
		System.out.println(myTv);
		// System.out.println(myTv.ch);
		
		// 생성된 객체의 주소를 가지고 멤버 메서드를 호출할 수 있다.
		myTv.on(10);
		
		// 2번째 TV에 멤버 변수값을 넣어 보고,
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		
		// 멤버 변수를 프린트
		System.out.println(yourTv);	
	}
}
