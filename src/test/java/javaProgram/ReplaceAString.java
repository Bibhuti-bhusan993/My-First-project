package javaProgram;

public class ReplaceAString {

	public static void main(String[] args) {
		String s = "Omm Sai RAM sai";
		String toBeReplaced = "RAM";
		String replaceWith = "Sai";
		String words [] = s.split(toBeReplaced);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=words.length-1;i++){
			sb = sb.append(words[i]);
			if(i!=words.length-1){
				sb = sb.append(replaceWith);
			}
			
		}
		System.out.println(sb);

	}

}
