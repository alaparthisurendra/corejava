package info.abstracttechm;

public abstract class Student {
	
	protected boolean id;
	protected boolean age;
	
	public Student(boolean id, boolean age)
	{
		this.id=id;
		this.age=age;
	}
	public boolean isId() {
		return id;
	}
	public void setId(boolean id) {
		this.id = id;
	}
	public boolean isAge() {
		return age;
	}
	public void setAge(boolean age) {
		this.age = age;
	}
   public abstract void studentInfo();
   
   public void printdetails()
   {
	   System.out.println("surendra id is:"+ id+" "+"and age is:"+age+" "+"class is:"+getClass());
   }
   
}
