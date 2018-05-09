/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.permutationbystring;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {
	public static List<String> getPermutation(String input) {

		List<String> collection = null;

		if (input.length() == 1) {
			collection = new ArrayList<String>();
			collection.add(input);
			return collection;
		} else {
			collection = getPermutation(input.substring(1));

			Character first = input.charAt(0);
			/* System.out.println(first); */

			List<String> result = new ArrayList<String>();
			for (String str : collection) {
				for (int i = 0; i < str.length(); i++) {
					String item = str.substring(0, i) + first + str.substring(i);
					System.out.println("item:" + item);
					System.out.println("first:" + first);
					result.add(item);
				}
				String item = str.concat(first.toString());
				System.out.println("foreach:" + str);

				System.out.println("su:" + item);
				// System.out.print(first.toString());
				result.add(item);
			}
			return result;
		}

	}

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(PermutationString.getPermutation("abc"));

	}

}
