package javaProgram;

import java.util.Scanner;

public class FebonacciSerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int x = sc.nextInt();
		int a=0;
		int b=0;
		int c=1;
		for(int i=0;i<x;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		

	}

}
