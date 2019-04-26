package Test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int y,z=0;
		int k=i;
		while(i>0){
			y = i%10;
			z = (z*10)+y;
			i=i/10;
		}
		if(k==z){
			System.out.println("Pali");
		}
		else {
			System.out.println("not");
		}

	}

}
