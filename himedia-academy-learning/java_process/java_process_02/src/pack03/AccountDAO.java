package pack03;

public class AccountDAO {
	// CRUD
	// create 기능만 호출, vo 만들어서 넣어서 전달, 확인
	public void create(AccountVO vo) {
		System.out.println(vo);
		String name2 = vo.getName();
		String title2 = vo.getTitle();
		int price2 = vo.getPrice();
		System.out.println("전달받은 이름은 "+name2+"입니다.");
		System.out.println("전달받은 계좌이름은 "+title2+"입니다.");
		System.out.println("전달받은 금액은 "+price2+"입니다.");
		System.out.println("계좌 개설이 요청됨");
	}
}
