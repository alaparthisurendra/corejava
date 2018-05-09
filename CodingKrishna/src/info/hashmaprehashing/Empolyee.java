package info.hashmaprehashing;

public class Empolyee {
	private Integer eId;
	private String eName;
	private String eSalary;

	public Empolyee() {
	}

	public Empolyee(Integer eId, String eName, String eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteSalary() {
		return eSalary;
	}

	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eId == null) ? 0 : eId.hashCode());
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + ((eSalary == null) ? 0 : eSalary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empolyee other = (Empolyee) obj;
		if (eId == null) {
			if (other.eId != null)
				return false;
		} else if (!eId.equals(other.eId))
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (eSalary == null) {
			if (other.eSalary != null)
				return false;
		} else if (!eSalary.equals(other.eSalary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empolyee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}

}
