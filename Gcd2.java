
public class Gcd2 {
	//recursion EUCLID Algorithm
    public static int gcd(int i , int j){
    	int  g=1;
    	if(i<j){
    		if(i==0) g=j;
    		else
    		return gcd(i,(j%i));
    	}
    	else if(j<i){
    		if(j==0) g=i;
    		else
    		return gcd(j,(i%j));
    	}
    	
    	return g;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        System.out.println(gcd(i,j));
	}

}
