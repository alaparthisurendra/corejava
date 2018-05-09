package info.abstractclasslogic;

public class Alaparthi  extends Surendra{
	public String company;
	
	public Alaparthi(String name, String age, Integer salary, String company)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.company=company;
		
	}

	public static void main(String[] args) {
		System.out.println("hello surendra");
		Surendra s=new Alaparthi("suri","24",10000,"hcl");
		System.out.println(s.age+"---- "+s.name+"---"+s.salary);
		s.details();
		Alaparthi a=new Alaparthi("suri","24",10000,"hcl");
		System.out.println(a.age+"===="+a.name+"==== "+a.salary+"===== "+a.company);
	}

	@Override
	public void details() {
		System.out.println("surendra alaparthi here practing fucking java");
	}

	@Override
	public String toString() {
		return "Alaparthi [company=" + company + "]";
	}
	

}
