package Collection;

import java.util.HashSet;
import java.util.Iterator;



public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("Sai");
		hs.add("Ram");
		hs.add("Hanuman");
		Iterator it =  hs.iterator();
		while(it.hasNext()){
			String nm = (String) it.next();
			System.out.println(nm);
		}
		hs.remove("Ram");
		System.out.println(hs); 

	}
	

}
