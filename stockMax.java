import java.util.*;

public class stockMax {
	static int current_max=0;
	static int[][] b=new int[8][2];
	static void max_array(int[] b){
		//stockMax.b=b; check had it been
		int max=b[0];
	    int index=0;
		for (int i=0;i<8;i++){
			if(b[i]>=max){
				max=b[i];
				index=i;
			}
		}
		
	}
	
	public static void main(String[] args) {
			int[] a={5,4,7,8,3,16,1,2};//these are the price of the stock of the next 8 days of WOT
		    max_array(a);
		    
	}

}
