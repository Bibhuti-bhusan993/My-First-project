package javaProgram;

public class SortAnArray {

	public static void main(String[] args) {
		
		int a [] = {10,20,30,2,3,4,990};
		for(int i =0;i<a.length;i++){
			for(int j=i+1;j<a.length-1;j++){
				int temp=0;
				if(a[i]>a[j]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
				
			}
			
		}
		for(int i =0;i<a.length;i++){
			System.out.print(a[i]+" ");
			
		}

	}

}
