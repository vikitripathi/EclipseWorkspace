/*
 * this class is to practise collection framework applications 
 * Stack 2-d
 * try catch error handling
 */
import java.util.*;

public class collection {
	  static void showpush(Stack st, int a) {
	      st.push(new Integer(a));
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
	   }

	   static void showpop(Stack st) {
	      System.out.print("pop -> ");
	      Integer a = (Integer) st.pop();
	      System.out.println(a);
	      System.out.println("stack: " + st);
	   }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
         } catch (EmptyStackException e) {
            System.out.println("empty stack");
         }
        System.out.println("-------------------------------------");
        Stack<Integer>[] tower = new Stack[3];
        System.out.println(tower);
        tower[0] = new Stack<Integer>();
        tower[1] = new Stack<Integer>();
        tower[2] = new Stack<Integer>();
        tower[1].push(1);
        tower[1].push(2);
        tower[1].push(3);
        tower[1].push(4);
        tower[1].push(6);
        tower[1].push(9);
        tower[1].push(7);
        tower[2].push(1);
        tower[2].push(3);
        int n=7;
        for(int i=0;i<3;i++){
        	System.out.println("it is ->"+ i);
           for(int j=n-1;j>=0;j--){
        	  try{       
              System.out.println(tower[i].get(j));
        	  }
        	  catch (Exception e){
              	
              }
           }
        }
	}

}
