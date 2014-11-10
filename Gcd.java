
public class Gcd {
public static int gcd(int n, int r){
	int min=(n<r)?n:r;
	int g=1,i=1;	
	while(i<=min){
		if((n%i==0)&&(r%i==0)){
			g=i;
		}
		i++;
	}
	return g;
}
public static void main(String[] args){
	int n=Integer.parseInt(args[0]);
	int r=Integer.parseInt(args[1]);
	System.out.println(gcd(n,r));
}
}
// static and other methods and calling