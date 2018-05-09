package info.typecasting;

class A {
	public void m1() {
		System.out.println("m1()");
	}
}

class B extends A {
	public void m2() {
		System.out.println("m2()");
	}
}

class C extends B {
	public void m3() {
		System.out.println("m2()");
	}
}

public class Upcastinglogic {

	public static void main(String[] args) {
		B c1 = new B();
		c1.m1();
		c1.m2();
		System.out.println("----------");
		A a = new C();
		a.m1();
		System.out.println("------------");
		C c = new C();
		B b = c;
		b.m1();
		b.m2();
		System.out.println("------------");

		A aa = new B();
		aa.m1();
		aa.hashCode();
		System.out.println("------------");

		/*
		 * B bb=new B(); Object o=(A)bb; o.m1(); //o belongs to object type here compile
		 * time error
		 */

	}

}
