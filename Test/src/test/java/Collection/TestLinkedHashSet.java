package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hs = new LinkedHashSet();
		hs.add("Hello");
		hs.add("10");
		hs.add("30");
		hs.add("30");
		Iterator it = hs.iterator();
		while(it.hasNext()){
			String name = (String)it.next();
			System.out.println(name);
		}
		System.out.println(hs);

	}

}
