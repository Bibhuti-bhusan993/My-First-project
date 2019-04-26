package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Create object of fileinputstream class and pass location of the file
		FileInputStream fis = new FileInputStream("F:\\E Drive\\Bibhuti\\Java\\Test\\Test.properties");
//		Create object of properties 
		Properties ps = new Properties();
//		Load the file 
		ps.load(fis);
//		Get data from file
		System.out.println(ps.getProperty("username"));

	}

}
