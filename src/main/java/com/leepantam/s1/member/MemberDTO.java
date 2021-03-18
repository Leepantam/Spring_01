package com.leepantam.s1.member;

public class MemberDTO {
	
	// 모든 멤버변수는 private
	// 변슈명과 데이터타입은 컬럼과 동일
	// getter, setter
	// 기본생성자 1개
	
	private String ID;
	private String PW;
	private String NAME;
	private String PHONE;
	private String EMAIL;
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getPHONE() {
		return PHONE;
	}
	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

}
