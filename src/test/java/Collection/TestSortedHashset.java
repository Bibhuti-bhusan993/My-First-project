package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet ss = new TreeSet();
		ss.add("Sai");
		ss.add("Ram");
		ss.add("hanuman");
		System.out.println(ss);
		ss.add("10");
		ss.add("20");
		ss.add("30");
		ss.add("40");
		ss.add("50");
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet("20"));
		System.out.println(ss.tailSet("30"));
		
		

	}

}
