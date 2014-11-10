
public class Factorial {
	public static long factorial(long n) {
        if      (n <  0) throw new RuntimeException("Underflow error in factorial");
        else if (n > 20) throw new RuntimeException("Overflow error in factorial");
        else if (n == 0) return 1;
        else             return n * factorial(n-1); //recursion , a good technique
    }

    public static void main(String[] args) {
        long N = Long.parseLong(args[0]);
        System.out.println(factorial(N));
    }
}
//static method ??