package info.keyandmultiplevalues;

public class Student {
	private Integer sid;
	private String sname;
	private String schoolName;
	private String standard;
	public Student(Integer sid, String sname, String schoolName, String standard) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.schoolName = schoolName;
		this.standard = standard;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", schoolName=" + schoolName + ", standard=" + standard
				+ "]";
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	

}
