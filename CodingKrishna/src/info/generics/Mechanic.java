package info.generics;

import java.util.ArrayList;
import java.util.List;

class Bike extends Vechicle {
	public void service() {
		System.out.println("bike service");
	}
}

class Car extends Vechicle {
	public void service() {
		System.out.println("car service");
	}
}

public class Mechanic {
	public void serviceVechicles(List<Vechicle> vechicle) {
		for (Vechicle vechicle1 : vechicle) {
			vechicle1.service();
		}
	}

	public static void main(String[] args) {
		List<Vechicle> vlist = new ArrayList<Vechicle>();
		vlist.add(new Vechicle());
		vlist.add(new Vechicle());

		List<Bike> blist = new ArrayList<>();
		blist.add(new Bike());
		blist.add(new Bike());

		List<Car> clist = new ArrayList<>();
		clist.add(new Car());
		clist.add(new Car());

		Mechanic mechanic = new Mechanic();
		mechanic.serviceVechicles(vlist);

	}
}
