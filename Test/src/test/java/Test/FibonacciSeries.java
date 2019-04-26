package Test;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Expected 0 1 1 2 3 5 8 13 21
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int y =0;
		 int z = 1;
		 int k =y+z;
		 System.out.print(y+" "+z);
		 for (int j = 0; z <i; j++) {
			 System.out.print(" "+k);
			 y=z;
			 z=k;
			 k =y+z;
			 
			
		}
	}

}
