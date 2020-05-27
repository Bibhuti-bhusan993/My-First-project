package javaProgram;

public class ReverseString {

	public static void main(String[] args) {
//		Out put looks like mmO iaS MAR
		String s = "Omm Sai RAM";
		String s1 [] = s.split(" ");
		String newS = "";
		
		for(int i =0;i<s1.length;i++){
			String word = s1[i];
			String reverse ="";
			for(int j= word.length()-1;j>=0;j--){
				reverse = reverse+word.charAt(j);
			}
			newS += reverse+ " ";
			
		}
		System.out.println(newS);

	}

}
