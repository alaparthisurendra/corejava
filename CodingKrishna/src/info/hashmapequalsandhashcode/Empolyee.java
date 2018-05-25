

package info.hashmapequalsandhashcode;

public class Empolyee {
	private Integer Eid;
	private String name;
	private String salary;
	private String experience;
	
	public Empolyee()
	{
	}

	public Empolyee(Integer eid, String name, String salary, String experience) {
		super();
		Eid = eid;
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}

	public Integer getEid() {
		return Eid;
	}

	public void setEid(Integer eid) {
		Eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Empolyee [Eid=" + Eid + ", name=" + name + ", salary=" + salary + ", experience=" + experience + "]";
	}
	
	/*public int hashCode()
	{
		return 100;
	}
	public boolean equals(Object obj)
	{
		return true;
	}*/
	
	
}
