package Collection;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList lis = new ArrayList();
		lis.add(10);
		lis.add(13);
		lis.add("Sai");
		lis.add(3, "Ram");
		System.out.println(lis.contains("Sai"));
		System.out.println(lis.get(2));
		System.out.println(lis.size());
		System.out.println(lis.isEmpty());
		
		ArrayList lis2 = new ArrayList();
		lis2.add("Sai");
		lis2.add(20);
		lis.retainAll(lis2);
		System.out.println(lis);
		ArrayList lis3 = new ArrayList(2);
		lis3.add("xyz");
		lis3.add(20);
		lis3.add("xyz");
		lis3.add(20);
		System.out.println(lis3.size());
		lis3.set(2, "Ram");
		System.out.println(lis3.get(2));
		Object ch []= lis3.toArray();
		System.out.println(ch[1]);
		Object ch1 []= lis2.toArray(ch);
		System.out.println(ch1.length);
		lis.add(1,null);
		lis.add(2,null);
		lis.addAll(lis3);
		System.out.println(lis);
		System.out.println(lis.get(2));
		
		

	}

}
