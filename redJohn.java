import java.io.*;
import java.util.*;
/*
 * read about hash tables , map interface , collection framework
 */
/*
We can convert the first part of the problem into a recurrence relation i.e. F(N) = F(N-1) + F(N-4) with the base case : F(0) = F(1) = F(2) = F(3) = 1.
Here, F(N) represents the number of ways of tiling the 4xN rectangle with 4x1 and 1x4 tiles.
explanation goes as :
If we place a 4x1 tile, then we just need to solve for F(N-1).
If we place a 1x4 tile, then we can't place a 4x1 tile under it. Basically, we will have to place a set of four 1x4 tiles together, hence we solve forF(N-4).
Finally, we take the sum and get the total number of configuration i.e. M. 
 */
public class redJohn {
	
	//recursive programming , applying dynamic programming
	public static int combination(int n){
		if(n==0||n==1||n==2||n==3)
			return 1;
		else
			return combination(n-1)+combination(n-4);
	}
	//counting prime using Sieve of Eratosthenes method
	public static int countPrimes(int m){
		int count=0;
		Hashtable<Integer, Boolean> numbers=new Hashtable<Integer,Boolean>();
		for(int i=2;i<=m;i++)
			numbers.put(i, true);
		for (int i =2;i<=(int)Math.sqrt(m);i++)
			if(numbers.get(i)==true)
			{
					for(int j=i*i;j<=m;j+=i)
					numbers.put(j,false);
			}
		for(int i=2;i<=m;i++)
			if(numbers.get(i)==true)
				count++;
					
		return count;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
		//System.out.println(combination(7));
        int[] a=new int[N];
        for (int i=0;i<N;i++)
            a[i] = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++)
        {
            int m=combination(a[i]);
            System.out.println(countPrimes(m));
        }
				
	}

}
