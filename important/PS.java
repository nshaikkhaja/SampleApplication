package important;

import org.testng.annotations.BeforeMethod;

public class PS {
	
	public void toThis() {
		
		System.out.println("In this method");
	}
	
	@BeforeMethod
	public void bfMethod() {
		
		System.out.println("before method first");
	}

}
