import java.io.IOException;

/*
 The wrapper classes in the Java API serve two primary purposes:
 To provide a mechanism to “wrap” primitive values in an object so that the primitives can be included in activities reserved for objects, like as being added to 
 Collections, or returned from a method with an object return value.
 To provide an assortment of utility functions for primitives. Most of these functions are related to various conversions: converting primitives to and from 
 String objects, and converting primitives and String objects to and from different bases (or radix), such as binary, octal, and hexadecimal.
 */
public class practise {
	static Integer methodPractise(int n){
		return n*n;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println(methodPractise(10));
//		java.io.BufferedReader r = new java.io.BufferedReader(new java.io.InputStreamReader (System.in));
//		int a=Integer.parseInt(r.readLine()),
//		b=Integer.parseInt(r.readLine());
//		System.out.println(a+b);
/*
 * below extract is asked in technical section of coding 
 * all three of the below loops are infinite
 */
//		int i=0;
//		for(;i<6;){
//			System.out.println("Hi!!!!!!!!");
//		}
//		for(;;){
//			System.out.println("Hi!!!!!!!!");
//		}
//     for(byte i=1;i<=37768;i++){
//		System.out.println("Hi!!!!!!!!");
//	}
		char grade = 'C';

	      switch(grade)
	      {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;//if you remove this break , then below two cases statement will also be printed before encountering the break !!!
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	}

}

/*
 //PACKAGES
 |                                | Private | No Modifier | Protected | Public |
+--------------------------------+---------+-------------+-----------+--------+
| Same class                     |  Yes    |  Yes        |  Yes      |  Yes   |
| Same package subclass          |  No     |  Yes        |  Yes      |  Yes   |
| Same package non-subclass      |  No     |  Yes        |  Yes      |  Yes   |
| Different package subclass     |  No     |  No         |  Yes      |  Yes   |
| Different package non-subclass |  No     |  No         |  Yes      |  Yes   |
+--------------------------------+---------+-------------+-----------+--------+
 
*/