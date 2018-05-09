package info.sapiensinsurancecompany;

import java.util.Iterator;

public class Foreach {

	public static void main(String[] args) {
		for (String s : new Iterabe()) {
			System.out.println(s);
		}
	}
}

class Iterabe implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new iterator();
	}

}

class iterator implements Iterator<String> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return "suri";
	}

}
