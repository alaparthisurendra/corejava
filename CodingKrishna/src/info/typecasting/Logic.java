package info.typecasting;

class Suri
{
	public void method1()
	{
		System.out.println("method1");
	}
}
class Ala extends Suri
{
	public void method2()
	{
		System.out.println("method2");
	}
}
public class Logic {

	public static void main(String[] args) {
		//Here Ala class extends Suri class then only it will compile
		Suri s=new Ala();
		s.method1();
		
	}

}
