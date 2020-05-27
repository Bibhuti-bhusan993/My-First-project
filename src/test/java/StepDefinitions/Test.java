package StepDefinitions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;


import cucumber.api.java.de.Gegebensei;
import gherkin.lexer.LexingError;

public class Test {

	public static void main(String[] args) {
		
		int i [] = {10,20,30,40};
		int givenElement =30;
		
		for(int k=0;k<i.length;k++){
			if(givenElement==i[k]){
				System.out.println("Position is "+k);
			}
			
		}

	}

}
