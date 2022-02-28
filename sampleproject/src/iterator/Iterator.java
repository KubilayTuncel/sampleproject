package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		List<String> list2 = new ArrayList<>();
		list2.add("ALI");
		list2.add("veli");
		list2.add("Ayse");
		list2.add("fatma");
		System.out.println(list2);
		for (String w : list2) {
			System.out.print(w.toUpperCase()+ " ");

		}
		System.out.println("");
		for (int i = 0; i < list2.size(); i++) {

			list2.set(i, list2.get(i).toUpperCase());
		}
		System.out.println(list2);
		System.out.println("");
		ListIterator<String> itrIterator=list2.listIterator();
		
		while (itrIterator.hasNext()) {
			String gecici = itrIterator.next();
			itrIterator.set(gecici.toLowerCase());
		}

		System.out.println(list2);
	}

}
