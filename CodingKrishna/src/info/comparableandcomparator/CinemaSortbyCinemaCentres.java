package info.comparableandcomparator;

import java.util.Comparator;

public class CinemaSortbyCinemaCentres implements Comparator<Cinema> {

	/*@Override
	public int compare(Cinema o1, Cinema o2) {
		if(o1.getCinemaCentres() > o2.getCinemaCentres())
			return 1;
		else if(o1.getCinemaCentres() < o2.getCinemaCentres())
			return -1;
		return 0; 
	}
*/
	
	//By using Ternary operator
	//we can reduce the code.
	@Override
	public int compare(Cinema o1, Cinema o2) {
		
		return o1.getCinemaCentres()>o2.getCinemaCentres() ? 1:o1.getCinemaCentres() < o2.getCinemaCentres() ? -1: 0; 
	}

}
