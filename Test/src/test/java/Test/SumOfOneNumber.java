package Test;

import java.util.Scanner;

public class SumOfOneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int y=1;
		int sum = 0;
		while(i>=y){
			
			sum = sum+y;
			y++;
		}
		System.out.println(sum);

	}

}
