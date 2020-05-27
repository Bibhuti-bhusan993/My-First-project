package javaProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateAndSortArray {

	public static void main(String[] args) {
	
		int a [] = {2,3,4,2,1,7,2,4,4,6};
		int b [] = {3,2,1,3,4,5,6,7,1,3,5,5,3,4,5};
		int [] c = new int[b.length];
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]!=b[j]){
					s.add(b[j]);
				}
			}
		}
		Iterator<Integer> it = s.iterator();		
		int n=0;
		while(it.hasNext()){
			c[n]=it.next();
			n++;
		}
		for(int k=0;k<c.length;k++){
			System.out.print(c[k]+" ");
			
		}
	}
}
