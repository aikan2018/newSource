package test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);

		// ˳�򵹹���
		TreeSet newTreeSet = (TreeSet) set.descendingSet();
		Iterator iterator = newTreeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
