
public class Fibonacci {
    public static long fib(int n){
    	if (n<=1) return n;
    	else
    	return fib(n-1)+fib(n-2);
    }
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		System.out.println("in the fibonacci series, the "+ n + "th element is : " + fib(n));
		// TODO Auto-generated method stub

	}

}
