package oopencaps;

public class Student {
	
	private String stName;
	private int stId;
	private int stDob;
	int rollNo;
	
	Student(){}
	Student(String stName,int stId,int rollNo ) {
		this.stName=stName;
		this.stId=stId;
		this.rollNo=rollNo;
		
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public int getStDob() {
		return stDob;
	}
	public void setStDob(int stDob) {
		this.stDob = stDob;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
	
	
}
