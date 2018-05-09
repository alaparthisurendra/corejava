package info.comparableandcomparator;

import java.util.Comparator;

public class Cinemasortbyreleaseddate implements Comparator<Cinema>{

	@Override
	//ternary operator
	public int compare(Cinema o1, Cinema o2) {
		
		return o1.getCinemaReleasedDate().
				compareTo(o2.getCinemaReleasedDate());
	}
 
}
