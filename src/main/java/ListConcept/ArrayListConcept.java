package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;


/*
 * Collection in Java
Framework - to store and manipulate the group of objects
Operation: Searching, Ibsertion, Deletion, Sorting
Interfaces: Set,List,Queue,Dequeue
Classes: ArrayList, Vector, LinkedList, HashSet, TreeSet, PriorityQueue

Entire Collection Available in jdk - java.util package
 */

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int a[] = new int[3];
		//static array -- size is fixed


		//dynamic array -- array list
		//1. contains duplicate values
		//2. Maintains insertion order
		//3. Not Synchronised
		//4. allows random access to fetch any element it stores the value on the basis of indexes.

		ArrayList ar = new ArrayList();

		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2

		System.out.println(ar.size());

		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		ar.add(12.33);
		ar.add("Sting");
		ar.add('a');
		ar.add(true);

		System.out.println(ar.size());//size of array list

		System.out.println(ar.get(4));//to get the values from index

		for(int i = 0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

		//non generic vs. generic:
		/*
		 * Here We haven't define the data type of the arrayList : Non Generic
		 */

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1);
		//ar1.add("Selenium");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("String");

		//if you're not sure about it string, int, double

		ArrayList<E> ar3 = new ArrayList<E>();


		//Employee class objects
		Employee e1 = new Employee("Jigar", 25, "QA");
		Employee e2 = new Employee("Tom", 28, "ADMIN");
		Employee e3 = new Employee("Peter", 29, "DEV");

		//create array list
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);


		//iterator to traverse the value

		Iterator<Employee> t1 = ar4.iterator();

		while (t1.hasNext()) {
			Employee emp = t1.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}

		System.out.println("***************");
		//*************************

		//addAll()


		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("QTP");
		ar5.add("JMeter");


		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javascript");

		ar5.addAll(ar6);

		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}

		System.out.println("***************");


		//removeAll() - remove all element 

		ar5.removeAll(ar6);

		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}

		System.out.println("***************");

		//retainAll() : only common element will printed

		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("QTP");
		ar7.add("JMeter");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("java");
		ar8.add("javascript");

		ar7.retainAll(ar8);

		for(int j=0;j<ar7.size();j++) {
			System.out.println(ar5.get(j));
		}
	}

}
