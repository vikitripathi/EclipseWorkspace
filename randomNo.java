//check for pseudo random no generator algorithms
import java.util.*;

public class randomNo {
	public  static int random(int n){
		Random r=new Random();
		return r.nextInt(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit within which you want 5 random no.s to be generated :>");
		int[] n= new int[5];
		for(int i=0;i<5;i++)
		{
			n[i]=s.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(n[i]);
		}
//		for(int i=1;i<=5;i++){
//			System.out.println(random(n));
//		}
	
	}

}
