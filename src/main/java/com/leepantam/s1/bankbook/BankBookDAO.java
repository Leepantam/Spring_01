package com.leepantam.s1.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	//getList
	
	public ArrayList<BankBookDTO> getList() throws Exception {
		ArrayList<BankBookDTO> array =new ArrayList<BankBookDTO>();
		
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		
		BankBookDTO bDto;
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from bank_book";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			bDto = new BankBookDTO();
			bDto.setAccount_number(rs.getInt("account_number"));
			bDto.setAccount_name(rs.getString("account_name"));
			bDto.setInterest_rate(rs.getDouble("interest_rate"));
			bDto.setCan_make(rs.getString("can_make"));
			array.add(bDto);
		}
		
		rs.close();
		st.close();
		con.close();
		return array;
	}
	
	
	
	public BankBookDTO getSelect(BankBookDTO bDto) throws Exception {
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "select * from bank_book where account_number=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, bDto.getAccount_number());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			bDto.setAccount_number(rs.getInt("account_number"));
			bDto.setAccount_name(rs.getString("account_name"));
			bDto.setInterest_rate(rs.getDouble("interest_rate"));
			bDto.setCan_make(rs.getString("can_make"));
		} else {
			bDto=null;
		}
		
		rs.close();
		st.close();
		con.close();
		
		return bDto;
		
	}
	
	public int setWrite(BankBookDTO bDto) throws Exception {
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "insert into bank_book values(bank_seq.nextval,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, bDto.getAccount_name());
		st.setDouble(2, bDto.getInterest_rate());
		st.setString(3, bDto.getCan_make());
		
		int result=st.executeUpdate();
		
		st.close();
		con.close();
		return result;
	}
	
	public int setDelete(BankBookDTO bDto) throws Exception {
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "delete from bank_book where account_number=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, bDto.getAccount_number());
		
		int result=st.executeUpdate();
		
		st.close();
		con.close();
		return result;
	}
	
}
