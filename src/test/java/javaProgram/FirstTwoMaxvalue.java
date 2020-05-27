package javaProgram;

public class FirstTwoMaxvalue {

	public static void main(String[] args) {
		int i [] = {10,20,30,5,70,9};
		int max = 0;
		int max2 =0;
		
		for(int n:i){
			if(max<n){
				max2 = max;
				max=n;
			}
			else if(max2<n){
				max2 = n;
				
			}
		}
		System.out.println(max+" "+max2);

	}

}
