package testNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class New2 {
	
	@Parameters({"URL"})
	@Test
	public void Demo(String urlname) {
		System.out.println("Nayeem");
		System.out.println(urlname);
	}
	
	@Test(groups= {"smoke"})
	public void annot() {
		System.out.println("Nayeem"); 
	}
	
}
