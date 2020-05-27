package javaProgram;

public class Reverse_an_array {

	public static void main(String[] args) {
		 int array [] = {10,20,30,40,50};
		 
		 for(int i=0;i<array.length/2;i++){
			 int temp = array[i];
			 array [i] = array [array.length-1-i];
			 array[array.length-1-i] = temp; 
		 }
		 
		 for(int j=0;j<array.length;j++){
			 System.out.print(array[j]);
			 
		 }

	}

}
