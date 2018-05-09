package info.inheritance;
class Alaparthi
{
	public void age()
	{
		System.out.println("50");
	}
	public void name()
	{
		System.out.println("alaparthi");
	}
	public void city()
	{
		System.out.println("nizamabad");
	}
}
class Surendra extends Alaparthi{
	public void age()
	{
		System.out.println("24");
	}
	public void height()
	{
		System.out.println("5.11");
	}
}
public class App {

	public static void main(String[] args) {
		Alaparthi a=new Surendra();
		a.age();
		a.name();
		a.city();
		
		System.out.println("===============");
		Alaparthi ala=new Alaparthi();
		ala.age();
		ala.city();
		ala.name();
	}

}
