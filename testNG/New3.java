package testNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class New3 {
	
	@Test
	public void Learning() {
		System.out.println("Learning");
	}
	
	@Test (groups= {"smoke"})
	public void LearnJava() {
		System.out.println("Learning Java");
	}
	
	@Parameters({"URL"})
	@Test 
	public void LearnOOPS(String urlname) {
		System.out.println("Learning OOPS");
		System.out.println(urlname);
	}
	
	@Test(dataProvider="testData")
	public void LearnBasic(String userid, String key) {
		System.out.println("Learning Basic");
		System.out.println(userid);
		System.out.println(key);
	}
	
	@Parameters({"URL", "Key/Username"})
	@Test 
	public void LoginDetails(String username, String password) {
		System.out.println("Learning Basic");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void LearningSelenium() {
		System.out.println("Learning Selenium");
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I'm number 1");
	}
	
	@DataProvider
	public Object[][] testData() {
		//create a multi-dimensional array with 3 rows and 2 columns
		//which means running the test with 3 types of test data(username and password)
		
		Object[] [] data = new Object[3] [2]; 
		//first login details
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		//second login details
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		//third login details
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
		
		
	}

}
