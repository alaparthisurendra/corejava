package info.abstractclasslogic;

 abstract class Abstractlogic {
	 
	 String name;
	 Integer age;
	 
	public Abstractlogic(String name, Integer age)
	 {
		 this.name=name;
		 this.age=age;
	 }
	
	public abstract String greetings();

	@Override
	public String toString() {
		return "Abstractlogic [name=" + name + ", age=" + age + "]";
	}
 }
 
