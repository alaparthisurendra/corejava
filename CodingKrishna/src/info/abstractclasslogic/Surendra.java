package info.abstractclasslogic;

public abstract class Surendra {

	protected String name;
	protected String age;
	protected Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
   
	public abstract void details();
	
	@Override
	public String toString() {
		return "Surendra [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
