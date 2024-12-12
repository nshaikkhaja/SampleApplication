package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener interface which implements testng listeners 
public class Listeners implements ITestListener{
	
	@Override
    public void onTestStart(ITestResult result) {
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	
    	System.out.println("I have successfully executed Listeners code");
        
    }

    @Override
    public void onTestFailure(ITestResult result) {
        
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    	
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    	
    }

    @Override
    public void onStart(ITestContext context) {
    	
    }

    @Override
    public void onFinish(ITestContext context) {
    	
    }
}


