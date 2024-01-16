package web;

import java.sql.Timestamp;

public class BoardVO {
	
	// 데이터들을 전달할 때
	// 데이터들을 넣어줄 가방 역할의 클래스가 필요
	// 변수를 만들어서 값만 넣었다 뺐다만 함.
	// Value Object
	// Data Transfer Object(DTO)
	private String idx;
	private String title;
	private String name;
	private String text;
	private Timestamp rgstdate;
	private String id;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Timestamp getRgstdate() {
		return rgstdate;
	}
	public void setRgstdate(Timestamp rgstdate) {
		this.rgstdate = rgstdate;
	}
	
	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", title=" + title + ", name=" + name + ", text=" + text + ", rgstdate="
				+ rgstdate + "]";
	}
}


