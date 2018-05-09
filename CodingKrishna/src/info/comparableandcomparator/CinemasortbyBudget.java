package info.comparableandcomparator;

import java.util.Comparator;

public class CinemasortbyBudget implements Comparator<Cinema> {

	@Override
	public int compare(Cinema o1, Cinema o2) {
		return o1.getCinemaBudget() > o2.getCinemaBudget() 
				? -1: o1.getCinemaBudget() < o2.getCinemaBudget() ? 1:0 ;
	}

}
