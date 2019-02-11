package ListConcept;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "Hi");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);

		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		//if you use same key again it will replace value
		
		h.put(3, "Hi");
		//you can give an y combination
		
		
		//restriction od datatype
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(11, 100);
		//h1.put(2, "Tab");
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer,String>();
		h2.put(12, "Hi");

		
	}
	

}
