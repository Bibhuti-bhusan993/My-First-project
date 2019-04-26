package Collection;

import java.util.LinkedList;

public class TestinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.addFirst(20);
		ll.addLast(30);
		ll.add(40);
		ll.addFirst(25);
		ll.addFirst(40);
		System.out.println(ll);
		System.out.println(ll.getLast());
		System.out.println(ll.getFirst());
		System.out.println(ll.get(1));
		System.out.println(ll.indexOf(40));
		System.out.println(ll.size());
		System.out.println(ll.lastIndexOf(40));
		LinkedList ll1 = new LinkedList();
		ll1.add(15);
		ll1.push(11);
		ll1.push(12);
		ll1.addFirst(13);
		ll1.add(14);
		ll1.push(17);
		System.out.println(ll1);
		System.out.println(ll1.peek());
		System.out.println(ll1.peekFirst());
		System.out.println(ll1.peekLast());
		System.out.println(ll1.pop());
		System.out.println(ll1.poll());
		System.out.println(ll1.pop());
		System.out.println(ll1);
		System.out.println(ll1.pollFirst());
		System.out.println(ll1.pollLast());
		
		

	}

}
