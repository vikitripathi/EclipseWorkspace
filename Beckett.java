
public class Beckett {
	public static void moves(int n,boolean forward){
		if (n == 0) return;
        moves(n-1, true);
        if (forward) System.out.println("enter " + n);
        else         System.out.println("exit  " + n);
        moves(n-1, false);
		
	}
public static void main(String[] args){
	int n=Integer.parseInt(args[0]);
	moves(n,true);
}
}
//return terminates the function
//recursion 