package info.abstractclasslogic;

public class Main extends Abstractlogic{

	String city;
	String address;
	
	public Main(String city, String address)
	{
		super("surendra",24); 
		this.city=city;
		this.address=address;
	}
	public static void main(String[] args) {
		Main main=new Main("nizamabad", "DHM");
		System.out.println(main.greetings());
		System.out.println(main.name+" "+main.age);
		System.out.println(main);
		

	}
	@Override
	public String toString() {
		return "Main [city=" + city + ", address=" + address + "]";
	}
	@Override
	public String greetings() {
		return "hello surendra";
		
	}

}
