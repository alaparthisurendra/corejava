package info.deloite;
class Surendra
{
	int x=1;
	 public Surendra()
	 {
		x=15000;
	 }
	public void name()
	{
		System.out.println("surendra");
	}
	public void age()
	{
		System.out.println("suriage");
	}
}
class Alaparthi extends Surendra
{
	int y=100;
	 int x=10;
	 public Alaparthi()
	 {
		 y=5000;
	 }
	public void name()
	{
		System.out.println("alaparthi");
	}
}
public class Rameshanna {

	public static void main(String[] args) {
		Surendra s=new Surendra();
		System.out.println(s.x);
		s.name();
		System.out.println("==========");
		Surendra ss=new Alaparthi();
		ss.name();
		ss.age();
		System.out.println(ss.x);
		System.out.println("===============");
		Alaparthi a=new Alaparthi();
		a.age();
		a.name();
		System.out.println(a.x);
		System.out.println(a.y);

	}

}
