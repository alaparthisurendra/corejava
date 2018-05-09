package info.dynamicmethoddispatch;

class Alaparthi {
	public void age() {
		System.out.println("Alaparthi:" + 23);
	}

}

class Chowdary extends Alaparthi {
	public void age() {
		System.out.println("Chowdary:" + 25);
	}

	public void color() {
		System.out.println("normal");
	}
}

class Nizamabad extends Chowdary {
	public void age() {
		System.out.println("Nizamabad:" + 24);
	}
}

public class Surendra {

	// compile time polymerphism and runtime polymerphism
	public static void main(String[] args) {
		Alaparthi alaparthi = new Chowdary(); // this is Runtime polymerphism
		// link(Alaparthi alaparthi=new Chowdary()) with two at runtime
		// which age(method) is call also decided at runtime
		alaparthi.age();
		System.out.println("=========================");

		alaparthi = new Nizamabad();
		alaparthi.age(); // Dynamic method Dispatch
		// Every Time changing method is called Dynamic Method Dispatch
		// To Achieve Dynamic method Dispatch we have to follow Runtime Polymerphism

		System.out.println("=========================");

		Chowdary chowdary = new Chowdary();
		chowdary.age();
		chowdary.color();

		System.out.println("=========================");

		Nizamabad nizamabad = new Nizamabad();
		nizamabad.age();
		nizamabad.color();

		System.out.println("=======================");
		chowdary = new Nizamabad();
		chowdary.age();
		chowdary.color();

	}

}
