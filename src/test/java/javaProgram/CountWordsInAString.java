package javaProgram;

public class CountWordsInAString {

	public static void main(String[] args) {
		String s = "Omm Sai RAM";
		int count =0;
		char[] ch = new char[s.length()];
		
		for(int i =0;i<s.length();i++ ){
			ch[i] = s.charAt(i);
			if(((i>0 && ch[i]!=' ') && ch[i-1]==' ') || (ch[0]!=' ' && i==0)){
				count ++;
				
			}
			
		}
		System.out.println(count);

	}

}
