//optimize the code
import java.io.*;
public class prplan {
	static boolean palindromeExist(String s){
		if(palindrome(s)) return true;
		else{
			if(palindrome(s.substring(1))) return true;
			else if(palindrome(s.substring(0,s.length()-1))) return true;
			else{
			for(int i=1;i<s.length()-1;i++)//optimize here , instead of checking all see !!!
				{
				  if(palindrome(s.substring(0,i)+s.substring(i+1)))
					 return true;
				}
			}
		}
		return false;
	}
	static boolean palindrome(String s){
//		int l =s.length();
//		int j,k,n;
//		if(l%2==0){
//			n=l/2;
//			j=n-1;
//			k=n;
//		}
//		else{
//			n=l/2;
//			j=n-1;
//			k=n+1;
//		}
//		for(int i=0;i<n;i++){
//			if(s.charAt(j-i)==s.charAt(k+i)) continue;
//			else return false;
//		}
//		return true;	
		String reverse = new StringBuffer(s).reverse().toString();
		if(reverse.equals(s)) return true;
		return false;
		/*
		 It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer. However if thread safety is necessary the best 
		 option is StringBuffer objects.
		 */
		//even using stringbuffer , getting same time execution error
		//check Gist *
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] str=new String[n];
		for (int i =0;i<n;i++){
			str[i]=br.readLine();
		}
		long startTime = System.nanoTime();
		for (int i =0;i<n;i++){
			if(palindromeExist(str[i])) System.out.println("YES");
			else  System.out.println("NO");
		}
		long endTime = System.nanoTime();
     	long duration = (endTime - startTime);
		System.out.println(duration); //divide by 1000000 to get milliseconds.
	}

}
