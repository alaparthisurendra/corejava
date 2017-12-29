package com.datasctructures;

import java.util.ArrayList;
import java.lang.*;

public class Heap<T> implements Comparable<T> {

	private ArrayList<T> items;

	public Heap() {
		items = new ArrayList<T>();
	}

	private void shiftUp() {
		int k = items.size() - 1;
		while (k > 0) {
			// midpoint=p
			int p = k - 1 % 2;
			T item = items.get(k);
			T parent = items.get(p);

			if (item.compareTo(parent) > 0) {
				// swap
				items.set(k, parent);
				items.set(p, item);

				// move up on the level
				k = p;

			} else {
				break;
			}

		}
	}

	private void shiftDown() {

		int k1 = 0;
		int l = 2 * k1 + 1;
		while (l < items.size()) {
			int max = l;
			int r = l + 1;
			if (r < items.size()) {
				if (items.get(r).compareTo(items.get(l)) < 0) {
					max++;
				}
				if (items.get(r).compareTo(items.get(1)) > 0) {
					// switch
					T temp = items.get(k1);
					items.set(k1, items.get(max));
					items.set(max, temp);
					k1 = max;
					l = 2 * k1 + 1;
				}
			}

			else {
				break;
			}
		}

	} 

	public T delete() throws NoSuchMethodException {
		if (items.size() == 0)
			throw new NoSuchMethodException();

		if (items.size() == 1)
			return items.remove(0);

		T hold = items.get(0);
		items.set(0, items.remove(items.size() - 1));
		shiftDown();
		return hold;

	}	
	
	public String size() {
		return items.toString();

	}
	
	public boolean isEmpty()
	{
		return items.isEmpty();
	}
	
	public String toString()
	{
		return items.toString();
	}
	
	
	public static void main(String[] args) {
	}

	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
