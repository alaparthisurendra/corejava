package info.yodlee;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(50);
		ts.add(120);
		ts.add(120);
		ts.add(1);
		ts.add(5);
		/*
		 * Iterator descendingIterator = ts.descendingIterator();
		 * while(descendingIterator.hasNext()) {
		 * System.out.println(descendingIterator.next()); }
		 */
		System.out.println(ts);
		System.out.println("-----");
		System.out.println(ts.descendingSet());

	}

}
