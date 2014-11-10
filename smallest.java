//or use for loop with single decrement on each variable, one which goes 0 is smallest
public class smallest {
	static int small(int x, int y, int z)
	{
		/*
		 * If value of (a/b) is zero, then b is greater than a, else a is greater.
		 */
	    if (!(y/x))  // Same as "if (y < x)"
	        return (!(y/z))? y : z;//ternary operator
	    return (!(x/z))? x : z;
	}

	public static void main(String[] args){
	  	  small(3,4,5);
	  	 
	  	  
		}
}
