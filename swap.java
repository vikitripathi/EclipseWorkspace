
public class swap {

	static void swap(){
		 int x = 10, y = 5;
		  System.out.println(x+"--"+y);
		  x = x ^ y; //use of xor 
		  y = x ^ y;  
		  x = x ^ y; 
		  System.out.println(x+"--"+y);
		  //return 0; ?? is it necessary for function to return something
	}
	static void swap1(){
		 int x = 10, y = 5;
		  System.out.println(x+"--"+y);
		  x = x+y;  
		  y = x - y;  
		  x = x - y; 
		  System.out.println(x+"--"+y);
		  //return 0; ?? is it necessary for function to return something
	}
	public static void main(String[] args){
  	  swap();
  	 System.out.println("other method");
  	swap1();
  	  
	}
}
