package test3.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {    
	public void findDuplicateChars(String str){

    Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
    char[] chrs = str.toCharArray();
    for(Character ch:chrs){
        if(dupMap.containsKey(ch)){
            dupMap.put(ch, dupMap.get(ch)+1);
        } else {
            dupMap.put(ch, 1);
        }
    }
    Set<Character> keys = dupMap.keySet();
    for(Character ch:keys){
        if(dupMap.get(ch) > 1){
            System.out.println(ch+"--->"+dupMap.get(ch));
        }
    }
    
}
public void test(){
	String str = "w3schools";
	  char[] inp = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	     System.out.println(inp[j]);
	     break;
	    }
	   }
	  }
}
	public static void main(String a[]){
	Test3 dcs = new Test3();
    dcs.findDuplicateChars("Java2Novice");
    dcs.test();
}
}
