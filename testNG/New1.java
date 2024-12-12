package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New1 {
	
	
	@Test
	public void AnotherDemo() {
		
		System.out.println("Hello");
		
	}
	
	@Test(groups= {"smoke"})
	public void Demo() {
		System.out.println("Bye");
		
	}
	
	@AfterTest
	public void Check() {
		System.out.println("I will execute in the last");
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("I will execute in the very last");
	}
	
	@BeforeMethod
	public void BfMethod() {
		System.out.println("will execute before each method in this class");
	}
	
	@AfterMethod
	public void AfMethod() {
		System.out.println("will execute after each method in this class");
	}


}
