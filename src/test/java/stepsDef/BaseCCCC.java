package stepsDef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class BaseCCCC {
	
	String name,pwd;
	
	String pr = ".//projectdata.properties";

Properties prob = new Properties();



	
	
	public String urlfromproperties() throws IOException
	{
		FileInputStream file = new FileInputStream(pr);
		prob.load(file);		
	  String url = (String) prob.get("url");
 
	 return url;
	 
	 
	}
	
	public String username() throws IOException
	{
		FileInputStream file = new FileInputStream(pr);
		prob.load(file);		
	  String id = (String) prob.get("id");
 
	 return id;
	 
	 
	}
	
	
	public String PWD() throws IOException
	{
		FileInputStream file = new FileInputStream(pr);
		prob.load(file);		
	  String pwdd = (String) prob.get("pwd");
 
	 return pwdd;
	 
	 
	}
	
	
	
	
	
	
	
}
