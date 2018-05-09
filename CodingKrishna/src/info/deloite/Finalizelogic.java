package info.deloite;

public class Finalizelogic {
	static int num = 0;

	public static void main(String[] args) throws InterruptedException {
		Finalizelogic f1 = new Finalizelogic();
		Finalizelogic f2 = new Finalizelogic();

		new Finalizelogic();
		f1 = null;
		Thread.sleep(1000);
		f2 = f1;
		Thread.sleep(1000);
		System.out.println("num values is :" + num);
		

	}

	protected void finalize() {
		num++;
		System.out.println(num);
	}

}
