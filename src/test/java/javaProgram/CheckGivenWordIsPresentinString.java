package javaProgram;

public class CheckGivenWordIsPresentinString {

	public static void main(String[] args) {
		String s = "Omm Sai Ram";
		String givenWord = "Ram";
		String words [] = s.split(" ");
		
		for(int i=0;i<words.length;i++){
			
			if(words[i].equals(givenWord)){
				System.out.println("Presrent");
				break;
			}
			
		}

	}

}
