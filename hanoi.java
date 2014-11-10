/*
 * min no of moves
 * check for its stack implementation
 */
import java.util.Scanner;

public class hanoi {
	static void towerHanoi(int n,String A,String B,String C){
		if (n==1) System.out.println("from "+A+" to "+C);
		else{
			towerHanoi(n-1, A, C, B);
			System.out.println("from "+A+" to "+C);//the last one at the bottom
			towerHanoi(n-1, B, A, C);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);//know about System.in
		System.out.println("no of ring initially in the peg A->");
		int n=s.nextInt();//n stores no of rings initially
		//no of towers are 3 , named A,B,C
		String A="Tower A",B="Tower B",C="Tower C";
		System.out.println("here is the way to solve the tower of hanoi problem->");
		towerHanoi(n,A,B,C);//where A is the from peg and C is the to peg

	}

}
/*  
  //here is a visualization of Tower if Hanoi Problem problem using 2-d stack
  import java.util.*;
 public class TowerOfHanoiUsingStacks

 {

     public static int N;


     public static Stack<Integer>[] tower = new Stack[4]; 

 

     public static void main(String[] args)

     {

         Scanner scan = new Scanner(System.in);

         tower[1] = new Stack<Integer>();

         tower[2] = new Stack<Integer>();

         tower[3] = new Stack<Integer>();

             

         System.out.println("Enter number of disks");

         int num = scan.nextInt();

         N = num;

         toh(num);

     }

     

     public static void toh(int n)

     {

         for (int d = n; d > 0; d--)

             tower[1].push(d);

         display();

         move(n, 1, 2, 3);         

     }

     

     public static void move(int n, int a, int b, int c)

     {

         if (n > 0)

         {

             move(n-1, a, c, b);     

             int d = tower[a].pop();                                             

             tower[c].push(d);

             display();                   

             move(n-1, b, a, c);     

         }         

     }

    

     public static void display()

     {

         System.out.println("  A  |  B  |  C");

         System.out.println("---------------");

         for(int i = N - 1; i >= 0; i--)

         {

             String d1 = " ", d2 = " ", d3 = " ";

             try

             {

                 d1 = String.valueOf(tower[1].get(i));

             }

             catch (Exception e){

             }    

             try

             {

                 d2 = String.valueOf(tower[2].get(i));

             }

             catch(Exception e){

             }

             try

             {

                 d3 = String.valueOf(tower[3].get(i));

             }

             catch (Exception e){

             }

             System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);

         }

         System.out.println("\n");         

     }

 }

*/