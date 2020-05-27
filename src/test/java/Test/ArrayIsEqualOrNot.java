package Test;

public class ArrayIsEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i={12,13,14,15,16};
		int [] j={12,13,14,15,16};
		boolean b = true;
		if(i.length==j.length){
			for(int k=0;k<i.length;k++){
				if(i[k]!=i[k]){
					b=false;
				}
				
			}
		}
		else{
			b=false;
		}
		if(b){
			System.out.println("both r equal");
		}
		else{
			System.out.println("not equal");
		}

	}

}
