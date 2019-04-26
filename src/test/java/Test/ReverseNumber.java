package Test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int y = 0;
	
		while(i!=0){
			int z = i%10;
			y=(y*10)+z;
			i =(int)i/10;
		}
		System.out.println(y);

	}

}
