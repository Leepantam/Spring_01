package com.leepantam.s1.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	public int memberJoin(MemberDTO mDto) throws Exception {
		String user="user01";
		String password="user01";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver="oracle.jdbc.OracleDriver";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "insert into users (id,pw,name,phone,email) values(?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, mDto.getId());
		st.setString(2, mDto.getPw());
		st.setString(3, mDto.getName());
		st.setString(4, mDto.getPhone());
		st.setString(5, mDto.getEmail());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	
	public MemberDTO login(MemberDTO mDto) throws Exception {
		MemberDTO dto = null;
		String user="user01";
		String password="user01";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver="oracle.jdbc.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from users where id=? and pw=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, mDto.getId());
		st.setString(2, mDto.getPw());
		
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			dto=new MemberDTO();
			dto.setName(rs.getString("NAME"));
			dto.setPhone(rs.getString("PHONE"));
			dto.setEmail(rs.getString("EMAIL"));
		} else {
			dto=null;
		}
		
		rs.close();
		st.close();
		con.close();
		
		return dto;
	}
}
