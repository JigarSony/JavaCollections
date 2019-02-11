package ListConcept;

import java.util.ArrayList;

public class ArrayListConcept1 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add(12.33);//6
		ar.add('A');//7
		ar.add(true);//8
		
		ar.add(600);
		
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());

		
		System.out.println(ar.size());

		System.out.println(ar.get(4));

		System.out.println(ar.get(8));
		
		//to print all the values of arrylist : for loop
		
		for(int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//to restric to datatype
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Hi"); 
		//The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		//ar1.add(12.33);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hi");
		//ar2.add(100);

	}

}
