import java.util.*;
/*
The java.util.List interface is a subtype of the java.util.Collection interface. It represents an ordered list of objects, meaning you can access 
the elements of a List in a specific order, and by an index too. You can also add the same element more than once to a List. 

Being a Collection subtype all methods in the Collection interface are also available in the List interface. 
Since List is an interface you need to instantiate a concrete implementation of the interface in order to use it. You can choose between the 
following List implementations in the Java Collections API:
    java.util.ArrayList
    java.util.LinkedList
    java.util.Vector
    java.util.Stack
    
Here are a few examples of how to create a List instance:

List listA = new ArrayList();
List listB = new LinkedList();
List listC = new Vector();
List listD = new Stack();    

>access via index
>access via Iterator
>access via new for-loop

------------------------
Generic Lists->



*/
public class collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		List list = new ArrayList();
		list.add(new Integer(2));
		list.add("a String");
		list.add(0, "element 0");
		System.out.println(list);
		//Because any object could be added, you would also have to cast any objects obtained from these objects
		Integer in = (Integer) list.get(1);
		String st = (String) list.get(0);
		System.out.println(in);
		System.out.println(st);
		//Very often you only use a single type with a collection. 
		//With Java's Generics features you can set the type of the collection to limit what kind of objects can be inserted into the collection. 
		System.out.println("------------------");
		List<String> listA = new ArrayList<String>();
		listA.add("a String");
		listA.add(0, "element 0");
		// a new for-loop (also referred to as "for-each") which works well with generified collections
		for(String aString : listA){
			  System.out.println(aString);
			}

		

	}

}
