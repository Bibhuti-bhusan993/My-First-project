package Test;

public class FindDuplicateWordInString {

	public static void main(String[] args) {
		String input="Welcome to Java Session Session Session"; 		//Input String	
	String [] s1 = input.split(" ");
	int count = 1;
	for(int i=0;i<s1.length;i++){
		for(int j=i+1;j<s1.length;j++){
			if(s1[i].equals(s1[j])){
				count= count+1;
				s1[j]="0";
			}
		}
		if(s1[i]!="0"){
			System.out.println(s1[i]+"----"+count);
			
			count=1;
		}
	}
}

}


