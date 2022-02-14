package web;

public class AccountVO {
	private String name;
	private String Title;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "AccountVO [이름=" + name + ", 계좌이름=" + Title + ", 금액=" + price + "]";
	}
}
