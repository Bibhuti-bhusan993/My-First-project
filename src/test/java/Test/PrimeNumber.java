package Test;

public class PrimeNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =234;
		int flag = 0;
		for(int j = 2; j<i;j++){
			if(i%j==0){
				flag=1;
			}
		}
if(flag==0){
	System.out.println("Pm");
}
else {
	System.out.println("not");
}
	}

}
