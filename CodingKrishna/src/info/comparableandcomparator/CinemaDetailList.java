package info.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CinemaDetailList {

	public static void main(String[] args) {

		List<Cinema> list = getCinemaList();

		System.out.println("before sorting.................");
		DisplayCinema(list);

		System.out.println("after sorting...................");
		Collections.sort(list);
		DisplayCinema(list);

		System.out.println("sortby cinemacentres..................");
		System.out.println("byusingComparator");
		Collections.sort(list, new CinemaSortbyCinemaCentres());
		DisplayCinema(list);

		System.out.println();
		System.out.println();
		System.out.println("sortby cinemaBudget..................");
		System.out.println("By Using CinemasortbyBudget");
		Collections.sort(list, new CinemasortbyBudget());
		DisplayCinema(list);


        }

	private static void DisplayCinema(List<Cinema> cinema) {

		Iterator<Cinema> itr = cinema.iterator();
		while (itr.hasNext()) {
			Cinema cin = itr.next();
			System.out.println(cin + "===");
		}

	}

	private static List<Cinema> getCinemaList() {
		List<Cinema> list;
		list = new ArrayList<>();

		Cinema cinema1 = new Cinema("sreemanthudu", "koratalashiva", "maheshbabu", "shruthihassan", 100, "kalyan",
				"devishreeprasad", "12/08/2015", 4000, "sucessfull");

		Cinema cinema2 = new Cinema("bhahubali", "rajamouli", "prabhas", "anushka", 1000, "Nimmagada", "keeravani",
				"12/10/2015", 7500, "BlockBuster");

		Cinema cinema3 = new Cinema("No1", "sukumar", "maheshbabu", "kruthisanan", 70, "mbk", "devishreeprasad",
				"12/08/2014", 2000, "Average");

		Cinema cinema4 = new Cinema("magadeera", "RajaMouli", "Ramcharan", "kajal", 100, "aditya", "keeravani",
				"24/03/2012", 2500, "sucessfull");

		Cinema cinema5 = new Cinema("Gabbarsingh", "haresshshankar", "pawankalyan", "shruthihassan", 60, "kalyan",
				"devishreeprasad", "12/08/2014", 3000, "good");

		Cinema cinema6 = new Cinema("mirchi", "koratalashiva", "prabhas", "anushka", 50, "null", "devishreeprasad",
				"20/05/2014", 1800, "sucessfull");

		Cinema cinema7 = new Cinema("nannakuprematho", "sukumar", "Ntr", "Rakul", 50, "Eros", "devishreeprasad",
				"12/08/2015", 2000, "sucessfull");

		Cinema cinema8 = new Cinema("julay", "trivikram", "AlluArjun", "illean", 50, "Aditya", "devishreeprasad",
				"12/02/2013", 1500, "Average");

		Cinema cinema9 = new Cinema("Ghazi", "sanklapreddy", "RanaDaggubathi", "tapsee", 40, "spproduction", "null",
				"28/08/2016", 1200, "hit");

		Cinema cinema10 = new Cinema("Arjunreddy", "sandeepReddy", "vijayDevarakonda", "null", 20, "sandeepreddy",
				"null", "20/08/2017", 2000, "hit");

		// Adding cinema objects to list
		list.add(cinema1);
		list.add(cinema2);
		list.add(cinema3);
		list.add(cinema4);
		list.add(cinema5);
		list.add(cinema6);
		list.add(cinema7);
		list.add(cinema8);
		list.add(cinema9);
		list.add(cinema10);

		return list;
	}

}
