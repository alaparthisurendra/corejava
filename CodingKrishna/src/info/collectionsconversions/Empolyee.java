package info.collectionsconversions;

public class Empolyee {
	
	private Integer Eid;
	private String Ename;
	
	public Empolyee(Integer eid, String ename) {
		super();
		Eid = eid;
		Ename = ename;
	}
	public Integer getEid() {
		return Eid;
	}
	public void setEid(Integer eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString() {
		return "Empolyee [Eid=" + Eid + ", Ename=" + Ename + "]";
	}
	

}
