package com.pavan;

public class Student {
	private Integer sId;
	private String fName;
	private String lName;
	private String city;
	private String dob;
	public Integer getSid() {
		return sId;
	}
	public void setSid(Integer sid) {
		this.sId = sid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sId + ", fName=" + fName + ", lName=" + lName + ", city=" + city + ", dob=" + dob
				+ "]";
	}
	
	
}
