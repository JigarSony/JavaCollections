package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		
		ll.add("Test");
		ll.add("Selenium");
		ll.add("QTP");
		
		ll.add("RPA");
		ll.add("Rft");
		
		//print
		System.out.println("content of linkedlist:"+ll);
		
		//addfirst
		ll.addFirst("First");
		
		//addlast
		ll.addLast("Last");
		
		System.out.println("content of linkedlist:"+ll);
		
		//get
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));

		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("content of linkedlist:"+ll);
		
		//remove at specific location
		ll.remove(0);
		System.out.println("content of linkedlist:"+ll);
		
		//how to print all the element
		//for loop
		
		System.out.println("*****Using for loop");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		//advance for loop
		System.out.println("*****Using for Advance loop");
		for(String str:ll) {
			System.out.println(str);
		}

		
		//while loop
		int num=0;
		System.out.println("*****Using for while loop");

		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		//iterator
			System.out.println("*****Using for Iterator");
			Iterator<String> it = ll.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		 
	}

}
