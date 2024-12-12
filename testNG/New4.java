package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New4 {
	
	@Test
	public void LearnAPI() {
		System.out.println("Learning API");
	}
	
	@Test (groups= {"smoke"})
	public void LearnDB() {
		System.out.println("Learning DB");
	}
	
	@Test
	public void LearnAppium() {
		System.out.println("Learning Appium");
	}
	
	@BeforeTest
	public void preReq() {
		System.out.println("I will execute first");
	}

}
