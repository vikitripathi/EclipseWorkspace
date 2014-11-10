/*
 * check its time and space??
//this sample code is the TAIL RECURSION
  def factorial(i, current_factorial=1):
  if i == 1:
    return current_factorial
  else:
    return factorial(i - 1, current_factorial * i)

 */
import java.util.Scanner;

public class factorial {
	static int fact(int n){
		if(n==1) return 1;
		else return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);//s has to be closed resource??
		System.out.println("enter the no whose factorial is to be found");
		int n=s.nextInt();
		int result=fact(n);
		System.out.println(result);

	}

}
