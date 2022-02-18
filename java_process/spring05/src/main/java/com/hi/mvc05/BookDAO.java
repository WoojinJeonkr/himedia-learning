package com.hi.mvc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Component;

@Component
public class BookDAO {

	public void create(BookVO vo) throws Exception {
		System.out.println("dao에서 전달받은 값:" + vo);
		ps.executeUpdate();
	}
}
